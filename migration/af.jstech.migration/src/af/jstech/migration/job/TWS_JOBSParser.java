// $ANTLR 3.5.2 /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g 2014-08-17 18:24:44

 
package af.jstech.migration.job;
import  af.jstech.migration.jaxb.scheduler.* ;
import af.jstech.migration.Launcher ;
import  af.jstech.migration.jaxb.scheduler.Job.Description ;
import  af.jstech.migration.jaxb.scheduler.JobChain.JobChainNode ;
import java.util.HashMap ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class TWS_JOBSParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DATE_LITERAL", "FILE_NAME", "ID", 
		"NUMBER", "STRING_LITERAL", "WS", "'$JOBS'", "'ABENDPROMPT'", "'AFTER'", 
		"'CONTINUE'", "'DESCRIPTION'", "'DOCOMMAND'", "'INTERACTIVE'", "'RCCONDSUCC'", 
		"'RECOVERY'", "'RERUN'", "'SCRIPTNAME'", "'STOP'", "'STREAMLOGON'", "'TASKTYPE'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int DATE_LITERAL=4;
	public static final int FILE_NAME=5;
	public static final int ID=6;
	public static final int NUMBER=7;
	public static final int STRING_LITERAL=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TWS_JOBSParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TWS_JOBSParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return TWS_JOBSParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g"; }


	public static class jobs_return extends ParserRuleReturnScope {
		public HashMap<String,Job> jobs;
		public HashMap<String,JobChainNode> states;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "jobs"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:25:1: jobs returns [HashMap<String,Job> jobs,HashMap<String,JobChainNode> states ] : '$JOBS' ( jobDefinition )* ;
	public final TWS_JOBSParser.jobs_return jobs() throws RecognitionException {
		TWS_JOBSParser.jobs_return retval = new TWS_JOBSParser.jobs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		ParserRuleReturnScope jobDefinition2 =null;

		Object string_literal1_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:25:77: ( '$JOBS' ( jobDefinition )* )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:26:2: '$JOBS' ( jobDefinition )*
			{
			root_0 = (Object)adaptor.nil();



			 retval.jobs = new HashMap<String,Job>() ;
			 retval.states = new HashMap<String,JobChainNode>() ;
			 
			string_literal1=(Token)match(input,10,FOLLOW_10_in_jobs62); 
			string_literal1_tree = (Object)adaptor.create(string_literal1);
			adaptor.addChild(root_0, string_literal1_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:32:2: ( jobDefinition )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:32:2: jobDefinition
					{
					pushFollow(FOLLOW_jobDefinition_in_jobs66);
					jobDefinition2=jobDefinition();
					state._fsp--;

					adaptor.addChild(root_0, jobDefinition2.getTree());


					retval.jobs.put((jobDefinition2!=null?((TWS_JOBSParser.jobDefinition_return)jobDefinition2).fullId:null), (jobDefinition2!=null?((TWS_JOBSParser.jobDefinition_return)jobDefinition2).job:null)) ;
					Launcher.states.put((jobDefinition2!=null?((TWS_JOBSParser.jobDefinition_return)jobDefinition2).fullId:null), (jobDefinition2!=null?((TWS_JOBSParser.jobDefinition_return)jobDefinition2).state:null)) ;

					}
					break;

				default :
					break loop1;
				}
			}


			Launcher.logger.info(Launcher.states.size()+" states collected") ;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "jobs"


	public static class jobDefinition_return extends ParserRuleReturnScope {
		public String fullId;
		public Job job;
		public JobChainNode state;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "jobDefinition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:45:1: jobDefinition returns [String fullId,Job job,JobChainNode state] :jobId= ID ( ( 'DOCOMMAND' command= STRING_LITERAL ) | ( 'SCRIPTNAME' path= STRING_LITERAL ) ) 'STREAMLOGON' ( ID | STRING_LITERAL ) ( description )? ( tasktype )? ( 'INTERACTIVE' )? ( successCondition )? ( recoveryOptions )? ;
	public final TWS_JOBSParser.jobDefinition_return jobDefinition() throws RecognitionException {
		TWS_JOBSParser.jobDefinition_return retval = new TWS_JOBSParser.jobDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token jobId=null;
		Token command=null;
		Token path=null;
		Token string_literal3=null;
		Token string_literal4=null;
		Token string_literal5=null;
		Token set6=null;
		Token string_literal9=null;
		ParserRuleReturnScope description7 =null;
		ParserRuleReturnScope tasktype8 =null;
		ParserRuleReturnScope successCondition10 =null;
		ParserRuleReturnScope recoveryOptions11 =null;

		Object jobId_tree=null;
		Object command_tree=null;
		Object path_tree=null;
		Object string_literal3_tree=null;
		Object string_literal4_tree=null;
		Object string_literal5_tree=null;
		Object set6_tree=null;
		Object string_literal9_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:45:66: (jobId= ID ( ( 'DOCOMMAND' command= STRING_LITERAL ) | ( 'SCRIPTNAME' path= STRING_LITERAL ) ) 'STREAMLOGON' ( ID | STRING_LITERAL ) ( description )? ( tasktype )? ( 'INTERACTIVE' )? ( successCondition )? ( recoveryOptions )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:47:1: jobId= ID ( ( 'DOCOMMAND' command= STRING_LITERAL ) | ( 'SCRIPTNAME' path= STRING_LITERAL ) ) 'STREAMLOGON' ( ID | STRING_LITERAL ) ( description )? ( tasktype )? ( 'INTERACTIVE' )? ( successCondition )? ( recoveryOptions )?
			{
			root_0 = (Object)adaptor.nil();



			retval.job = new Job() ;
			retval.state = new JobChainNode() ;
			retval.job.setOrder("yes") ;

			jobId=(Token)match(input,ID,FOLLOW_ID_in_jobDefinition94); 
			jobId_tree = (Object)adaptor.create(jobId);
			adaptor.addChild(root_0, jobId_tree);


			//a modifier
			retval.fullId = (jobId!=null?jobId.getText():null) ;
			retval.job.setName( (jobId!=null?jobId.getText():null).split("#")[1]);
			retval.state.setJob((jobId!=null?jobId.getText():null).split("#")[1]) ;
			//Launcher.logger.info("Parsing of the Job " + (jobId!=null?jobId.getText():null));

			Script script = new Script();
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:64:2: ( ( 'DOCOMMAND' command= STRING_LITERAL ) | ( 'SCRIPTNAME' path= STRING_LITERAL ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==15) ) {
				alt2=1;
			}
			else if ( (LA2_0==20) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:66:2: ( 'DOCOMMAND' command= STRING_LITERAL )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:66:2: ( 'DOCOMMAND' command= STRING_LITERAL )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:66:2: 'DOCOMMAND' command= STRING_LITERAL
					{
					string_literal3=(Token)match(input,15,FOLLOW_15_in_jobDefinition107); 
					string_literal3_tree = (Object)adaptor.create(string_literal3);
					adaptor.addChild(root_0, string_literal3_tree);

					command=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_jobDefinition111); 
					command_tree = (Object)adaptor.create(command);
					adaptor.addChild(root_0, command_tree);


					script.getContent().add(Launcher.getString((command!=null?command.getText():null)));

					}

					}
					break;
				case 2 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:72:2: ( 'SCRIPTNAME' path= STRING_LITERAL )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:72:2: ( 'SCRIPTNAME' path= STRING_LITERAL )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:72:3: 'SCRIPTNAME' path= STRING_LITERAL
					{
					string_literal4=(Token)match(input,20,FOLLOW_20_in_jobDefinition120); 
					string_literal4_tree = (Object)adaptor.create(string_literal4);
					adaptor.addChild(root_0, string_literal4_tree);

					path=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_jobDefinition124); 
					path_tree = (Object)adaptor.create(path);
					adaptor.addChild(root_0, path_tree);


					Include include = new Include() ;
					include.setFile(Launcher.getString((path!=null?path.getText():null))) ;
					script.getContent().add(include);

					}

					}
					break;

			}


			retval.job.setScript(script) ;

			string_literal5=(Token)match(input,22,FOLLOW_22_in_jobDefinition134); 
			string_literal5_tree = (Object)adaptor.create(string_literal5);
			adaptor.addChild(root_0, string_literal5_tree);

			set6=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==STRING_LITERAL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set6));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:85:2: ( description )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==14) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:85:3: description
					{
					pushFollow(FOLLOW_description_in_jobDefinition146);
					description7=description();
					state._fsp--;

					adaptor.addChild(root_0, description7.getTree());

					retval.job.setDescription((description7!=null?((TWS_JOBSParser.description_return)description7).description:null));
					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:87:2: ( tasktype )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==23) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:87:2: tasktype
					{
					pushFollow(FOLLOW_tasktype_in_jobDefinition155);
					tasktype8=tasktype();
					state._fsp--;

					adaptor.addChild(root_0, tasktype8.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:89:2: ( 'INTERACTIVE' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==16) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:89:2: 'INTERACTIVE'
					{
					string_literal9=(Token)match(input,16,FOLLOW_16_in_jobDefinition161); 
					string_literal9_tree = (Object)adaptor.create(string_literal9);
					adaptor.addChild(root_0, string_literal9_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:91:2: ( successCondition )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==17) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:91:2: successCondition
					{
					pushFollow(FOLLOW_successCondition_in_jobDefinition167);
					successCondition10=successCondition();
					state._fsp--;

					adaptor.addChild(root_0, successCondition10.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:93:2: ( recoveryOptions )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==18) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:93:2: recoveryOptions
					{
					pushFollow(FOLLOW_recoveryOptions_in_jobDefinition173);
					recoveryOptions11=recoveryOptions();
					state._fsp--;

					adaptor.addChild(root_0, recoveryOptions11.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "jobDefinition"


	public static class recoveryOptions_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "recoveryOptions"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:96:1: recoveryOptions : 'RECOVERY' ( 'STOP' | 'RERUN' | 'CONTINUE' ) ( 'AFTER' ID )? ( 'ABENDPROMPT' STRING_LITERAL )? ;
	public final TWS_JOBSParser.recoveryOptions_return recoveryOptions() throws RecognitionException {
		TWS_JOBSParser.recoveryOptions_return retval = new TWS_JOBSParser.recoveryOptions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal12=null;
		Token set13=null;
		Token string_literal14=null;
		Token ID15=null;
		Token string_literal16=null;
		Token STRING_LITERAL17=null;

		Object string_literal12_tree=null;
		Object set13_tree=null;
		Object string_literal14_tree=null;
		Object ID15_tree=null;
		Object string_literal16_tree=null;
		Object STRING_LITERAL17_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:96:17: ( 'RECOVERY' ( 'STOP' | 'RERUN' | 'CONTINUE' ) ( 'AFTER' ID )? ( 'ABENDPROMPT' STRING_LITERAL )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:97:1: 'RECOVERY' ( 'STOP' | 'RERUN' | 'CONTINUE' ) ( 'AFTER' ID )? ( 'ABENDPROMPT' STRING_LITERAL )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal12=(Token)match(input,18,FOLLOW_18_in_recoveryOptions183); 
			string_literal12_tree = (Object)adaptor.create(string_literal12);
			adaptor.addChild(root_0, string_literal12_tree);

			set13=input.LT(1);
			if ( input.LA(1)==13||input.LA(1)==19||input.LA(1)==21 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set13));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:103:3: ( 'AFTER' ID )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==12) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:103:4: 'AFTER' ID
					{
					string_literal14=(Token)match(input,12,FOLLOW_12_in_recoveryOptions212); 
					string_literal14_tree = (Object)adaptor.create(string_literal14);
					adaptor.addChild(root_0, string_literal14_tree);

					ID15=(Token)match(input,ID,FOLLOW_ID_in_recoveryOptions214); 
					ID15_tree = (Object)adaptor.create(ID15);
					adaptor.addChild(root_0, ID15_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:104:3: ( 'ABENDPROMPT' STRING_LITERAL )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==11) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:104:4: 'ABENDPROMPT' STRING_LITERAL
					{
					string_literal16=(Token)match(input,11,FOLLOW_11_in_recoveryOptions222); 
					string_literal16_tree = (Object)adaptor.create(string_literal16);
					adaptor.addChild(root_0, string_literal16_tree);

					STRING_LITERAL17=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_recoveryOptions224); 
					STRING_LITERAL17_tree = (Object)adaptor.create(STRING_LITERAL17);
					adaptor.addChild(root_0, STRING_LITERAL17_tree);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recoveryOptions"


	public static class successCondition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "successCondition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:108:1: successCondition : 'RCCONDSUCC' STRING_LITERAL ;
	public final TWS_JOBSParser.successCondition_return successCondition() throws RecognitionException {
		TWS_JOBSParser.successCondition_return retval = new TWS_JOBSParser.successCondition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal18=null;
		Token STRING_LITERAL19=null;

		Object string_literal18_tree=null;
		Object STRING_LITERAL19_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:108:18: ( 'RCCONDSUCC' STRING_LITERAL )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:110:1: 'RCCONDSUCC' STRING_LITERAL
			{
			root_0 = (Object)adaptor.nil();


			string_literal18=(Token)match(input,17,FOLLOW_17_in_successCondition237); 
			string_literal18_tree = (Object)adaptor.create(string_literal18);
			adaptor.addChild(root_0, string_literal18_tree);

			STRING_LITERAL19=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_successCondition239); 
			STRING_LITERAL19_tree = (Object)adaptor.create(STRING_LITERAL19);
			adaptor.addChild(root_0, STRING_LITERAL19_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "successCondition"


	public static class tasktype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tasktype"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:116:1: tasktype : 'TASKTYPE' ID ;
	public final TWS_JOBSParser.tasktype_return tasktype() throws RecognitionException {
		TWS_JOBSParser.tasktype_return retval = new TWS_JOBSParser.tasktype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal20=null;
		Token ID21=null;

		Object string_literal20_tree=null;
		Object ID21_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:116:10: ( 'TASKTYPE' ID )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:117:1: 'TASKTYPE' ID
			{
			root_0 = (Object)adaptor.nil();


			string_literal20=(Token)match(input,23,FOLLOW_23_in_tasktype251); 
			string_literal20_tree = (Object)adaptor.create(string_literal20);
			adaptor.addChild(root_0, string_literal20_tree);

			ID21=(Token)match(input,ID,FOLLOW_ID_in_tasktype253); 
			ID21_tree = (Object)adaptor.create(ID21);
			adaptor.addChild(root_0, ID21_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tasktype"


	public static class description_return extends ParserRuleReturnScope {
		public Description description;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "description"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:120:1: description returns [Description description] : 'DESCRIPTION' desc= STRING_LITERAL ;
	public final TWS_JOBSParser.description_return description() throws RecognitionException {
		TWS_JOBSParser.description_return retval = new TWS_JOBSParser.description_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token desc=null;
		Token string_literal22=null;

		Object desc_tree=null;
		Object string_literal22_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:120:47: ( 'DESCRIPTION' desc= STRING_LITERAL )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/job/TWS_JOBS.g:121:1: 'DESCRIPTION' desc= STRING_LITERAL
			{
			root_0 = (Object)adaptor.nil();


			string_literal22=(Token)match(input,14,FOLLOW_14_in_description267); 
			string_literal22_tree = (Object)adaptor.create(string_literal22);
			adaptor.addChild(root_0, string_literal22_tree);

			desc=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_description271); 
			desc_tree = (Object)adaptor.create(desc);
			adaptor.addChild(root_0, desc_tree);


			retval.description = new Description() ;
			retval.description.getContent().add(Launcher.getString((desc!=null?desc.getText():null))) ;


			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "description"

	// Delegated rules



	public static final BitSet FOLLOW_10_in_jobs62 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_jobDefinition_in_jobs66 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_ID_in_jobDefinition94 = new BitSet(new long[]{0x0000000000108000L});
	public static final BitSet FOLLOW_15_in_jobDefinition107 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_jobDefinition111 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_20_in_jobDefinition120 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_jobDefinition124 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_jobDefinition134 = new BitSet(new long[]{0x0000000000000140L});
	public static final BitSet FOLLOW_set_in_jobDefinition136 = new BitSet(new long[]{0x0000000000874002L});
	public static final BitSet FOLLOW_description_in_jobDefinition146 = new BitSet(new long[]{0x0000000000870002L});
	public static final BitSet FOLLOW_tasktype_in_jobDefinition155 = new BitSet(new long[]{0x0000000000070002L});
	public static final BitSet FOLLOW_16_in_jobDefinition161 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_successCondition_in_jobDefinition167 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_recoveryOptions_in_jobDefinition173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_recoveryOptions183 = new BitSet(new long[]{0x0000000000282000L});
	public static final BitSet FOLLOW_set_in_recoveryOptions187 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_12_in_recoveryOptions212 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_recoveryOptions214 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_recoveryOptions222 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_recoveryOptions224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_successCondition237 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_successCondition239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_tasktype251 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_tasktype253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_description267 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_description271 = new BitSet(new long[]{0x0000000000000002L});
}
