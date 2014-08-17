grammar TWS_SCHEDULES ;

options {
  language = Java;
  output=AST ;
}

  
@header { 
package af.jstech.migration.jobstream;
import af.jstech.migration.* ;
import java.util.LinkedList ;
import  af.jstech.migration.jaxb.scheduler.* ;
}
   


@lexer::header {
package af.jstech.migration.jobstream; 
}



schedules returns [LinkedList<TWSJobStream> streams] : 
{
$streams = new LinkedList<TWSJobStream>() ;
}
(scheduleDefinition {$streams.add($scheduleDefinition.stream);})* 

;


scheduleDefinition returns [TWSJobStream stream]:


  'SCHEDULE' sdId=ID 
  {
  $stream = new TWSJobStream($sdId.text) ;
  Launcher.createApplicationDirectory($sdId.text);
  JobChain jobChain = new JobChain() ;
  } 
 
 ('VALIDFROM' DATE_LITERAL)?
 
  timeZoneDefinition?
  
 ('DESCRIPTION' STRING_LITERAL)?
 
 ('DRAFT')?
 
 varTableDefinition?
 
 freeDaysDefinition?
 
 onStatement*
 
 exceptStatement*
 
 launchDefinition?
 
 untilDefinition?
 
 deadlineDefinition?
 
 'CARRYFORWARD'?
 
 matchingStatement*
 
 followsStatement*
 
 ('KEYSCHED')?
 
 ('LIMIT'  NUMBER)?
 
 needsStatement*
 
 opensStatement*
 
 priorityDefinition?
 
 ':'
 (jobStatement
 {
 Job job = Launcher.getJobById($sdId.text,$jobStatement.jobId) ;
 job.setRunTime($jobStatement.runTime) ;
 job.getPriority().add($jobStatement.priority) ;
 $stream.addJobStatement($jobStatement.statement) ; 
 Launcher.putJobIntoDir($sdId.text,$jobStatement.jobId) ;
 }
 
)*
{
Launcher.generateJobChain($stream,$sdId.text.split("#")[0]) ;
}
'END'
 
 ;
 
 
 priorityDefinition returns[String priority]:
 'PRIORITY' (prio=NUMBER {$priority= $prio.text;}|'HI'{$priority="255"; }|'GO' {$priority="255";})
 ;
 
 
 varTableDefinition :
 'VARTABLE' ID
 ;
 
 freeDaysDefinition :
 'FREEDAYS' ID ('-SA')? ('-SU')?
 ;
 
 onStatement :
 
 'ON' ('RUNCYCLE' ID)?
 
 ('VALIDFROM' DATE_LITERAL)? ('VALIDTO' DATE_LITERAL)?
 
 ('DESCRIPTION' STRING_LITERAL)?
 
 ('VARTABLE' ID)?
 
 calendarDefinition*
 
 fdOptions?
 
 ('('
 launchDefinition?
 
 untilDefinition?
 
 deadlineDefinition?
 
 ')')?
 ;
 
 
 exceptStatement :
  
 'EXCEPT' ('RUNCYCLE')? ID?
 
 ('VALIDFROM' DATE_LITERAL)? ('VALIDTO' DATE_LITERAL)?
 
 ('DESCRIPTION' STRING_LITERAL)?
 
 ('VARTABLE' ID)?
 
 calendarDefinition*
 
 fdOptions ?
 
 ('('
 
 launchDefinition?
  
 ')')?
 
 ;
 
 matchingStatement : 
 'MATCHING' 
 followsOrMatchingOptions?
 ;
 
 followsStatement returns [String jobId]: 
 'FOLLOWS' id=ID {$jobId = $id.text;}
 followsOrMatchingOptions ?
 ;
 
 followsOrMatchingOptions :
 'SAMEDAY'
 |'PREVIOUS'
 |('RELATIVE' 'FROM' ('+'|'-')? NUMBER 'TO' ('+'|'-')? NUMBER)
 |('FROM' ('+'|'-')? NUMBER (('+'|'-')? NUMBER day)? 'TO' ('+'|'-')? NUMBER (('+'|'-')? NUMBER day)? )
 ;
 
 
 
 calendarDefinition : 
 ID //include a calendar file
 |STRING_LITERAL //parse a iCalendar Definition
 |'REQUEST' //Manual launch
 |groupDate //explicit calendar definition
 ;

 jobStatement returns [String jobId,RunTime runTime,String priority
 ,TWSJobStatement statement
 ] :
 {
 $runTime = new RunTime() ;
 
 } 
 id1=ID {$jobId=$id1.text ;
 $statement = new TWSJobStatement($id1.text) ;
 }
 (
 launchDefinition
 {
 $runTime.getPeriod().add($launchDefinition.period) ;
 }
 | untilDefinition  { $runTime.setEnd($untilDefinition.endTime) ;}
 | deadlineDefinition 
 | ('EVERY' NUMBER)
 | followsStatement {$statement.addFollow($followsStatement.jobId) ;}
 |'CONFIRMED'
 |'CRITICAL'
 |'KEYJOB'
 |needsStatement
 |priorityDefinition {$priority=$priorityDefinition.priority;}
 |opensStatement
 )*
 ;

 fdOptions :
 'FDIGNORE'
 |'FDPREV' 
 |'FDNEXT'
 ;
 
 
 groupDate :
 DATE_LITERAL (',' DATE_LITERAL)*
 ;
 
 
 needsStatement :
 'NEEDS' ((NUMBER)? ID)
 ;
 
 
 opensStatement : 
 'OPENS'  FILE_NAME qualifier*
 
 ;
 
 qualifier :  //A REVOIR  

  '(' ('\'')?(
  ('-d' '%p')
  |(('/')?ID)
  | ('-e' '%p') 
  | ('-f' '%p') 
  | ('-r' '%p') 
  | ('-s' '%p') 
  | ('-w' '%p')
  | ('-a')
  | ('-o')
  |('ls' |'`ls'| '%p' | '|' | 'wc' | '-w`'  | (('-gt'|'-eq'|'-ge') NUMBER))* //commande spécifique à air france
 
  )
  ('\'')?
  ')'
  ;
 
 
 launchDefinition returns [Period period] :
 {$period = new Period() ;}
 (atStatement{$period.setBegin($atStatement.atTime);})
 |schedtimeStatement 
 
 ;
 
 atStatement returns [String atTime]:
  ('AT' time=NUMBER timeZoneDefinition? ('+' NUMBER day)?)
  {
  $atTime = Launcher.normalizeTime($time.text) ;
  }
 ;
 
 schedtimeStatement :
 ('SCHEDTIME' NUMBER timeZoneDefinition? ('+' NUMBER day)?)
 ;
 
 
 untilDefinition  returns [String endTime]: //provisoirement
 'UNTIL' time=NUMBER  timeZoneDefinition? ('+' NUMBER day)? ('ONUNTIL' action)?
  
  {$endTime = Launcher.normalizeTime($time.text) ;}
  
  ;
  
  deadlineDefinition :
  'DEADLINE' NUMBER  timeZoneDefinition? ('+' NUMBER day)?
  ;
 
 day :
 'DAY' 
 |'DAYS'
 ;
 

action :
'CANC'
|'SUPPR'
|'CONT'
;
 
COMMENT
  :
  '#' .*
  (
    '\n'
    | '\r'
  )
  
  {
   $channel = HIDDEN;
  }
  ;

timeZoneDefinition:
('tz' ID) 
| ('TIMEZONE' (ID('/'ID)?))
;



  STRING_LITERAL
  :
  '"'
  (
    ~(
      '"'
      | '\r'
      | '\n'
     )
     |('\\"')
  )*
  '"'
  ;
  


WS
  :
  (' '|'\n'
    | '\t'
    | '\r'
    | '\\')+ 
        {
         $channel = HIDDEN;
        }
  ;


ID
  :
 (
    'a'..'z'
    | 'A'..'Z'
  )
  (
    'a'..'z'
    | 'A'..'Z'
    | '0'..'9'
    | '-'
    | '_'
    | '@'
    | '.'
    | '#'
    |'\''
    |'%'
  )*
  ;

//NEW_LINE
//  :
//  (
//    '\n'
//    | '\t'
//    | '\r'
//    | '\\'
//  )+
//  
//  {
//   $channel = HIDDEN;
//  }
//  ;

NUMBER
  :
  ('0'..'9')+
  ;

//HASH_ID : ID'#' ;

//SPECIFIC_ID: HASH_ID? ID
//  ;

//QUALIFIER_LITERAL :
//STRING*
//;
FILE_NAME
  :
  ID?STRING_LITERAL
  ;

DATE_LITERAL
  :
  ('0'..'9') ('0'..'9') '/' ('0'..'9') ('0'..'9') '/' ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9')
  ;
 