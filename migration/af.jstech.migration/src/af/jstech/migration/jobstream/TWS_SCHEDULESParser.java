// $ANTLR 3.5.2 /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g 2014-08-17 18:26:40
 
package af.jstech.migration.jobstream;
import af.jstech.migration.* ;
import java.util.LinkedList ;
import  af.jstech.migration.jaxb.scheduler.* ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class TWS_SCHEDULESParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DATE_LITERAL", "FILE_NAME", 
		"ID", "NUMBER", "STRING_LITERAL", "WS", "'%p'", "'('", "')'", "'+'", "','", 
		"'-'", "'-SA'", "'-SU'", "'-a'", "'-d'", "'-e'", "'-eq'", "'-f'", "'-ge'", 
		"'-gt'", "'-o'", "'-r'", "'-s'", "'-w'", "'-w`'", "'/'", "':'", "'AT'", 
		"'CANC'", "'CARRYFORWARD'", "'CONFIRMED'", "'CONT'", "'CRITICAL'", "'DAY'", 
		"'DAYS'", "'DEADLINE'", "'DESCRIPTION'", "'DRAFT'", "'END'", "'EVERY'", 
		"'EXCEPT'", "'FDIGNORE'", "'FDNEXT'", "'FDPREV'", "'FOLLOWS'", "'FREEDAYS'", 
		"'FROM'", "'GO'", "'HI'", "'KEYJOB'", "'KEYSCHED'", "'LIMIT'", "'MATCHING'", 
		"'NEEDS'", "'ON'", "'ONUNTIL'", "'OPENS'", "'PREVIOUS'", "'PRIORITY'", 
		"'RELATIVE'", "'REQUEST'", "'RUNCYCLE'", "'SAMEDAY'", "'SCHEDTIME'", "'SCHEDULE'", 
		"'SUPPR'", "'TIMEZONE'", "'TO'", "'UNTIL'", "'VALIDFROM'", "'VALIDTO'", 
		"'VARTABLE'", "'\\''", "'`ls'", "'ls'", "'tz'", "'wc'", "'|'"
	};
	public static final int EOF=-1;
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
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int COMMENT=4;
	public static final int DATE_LITERAL=5;
	public static final int FILE_NAME=6;
	public static final int ID=7;
	public static final int NUMBER=8;
	public static final int STRING_LITERAL=9;
	public static final int WS=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TWS_SCHEDULESParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TWS_SCHEDULESParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return TWS_SCHEDULESParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g"; }


	public static class schedules_return extends ParserRuleReturnScope {
		public LinkedList<TWSJobStream> streams;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "schedules"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:24:1: schedules returns [LinkedList<TWSJobStream> streams] : ( scheduleDefinition )* ;
	public final TWS_SCHEDULESParser.schedules_return schedules() throws RecognitionException {
		TWS_SCHEDULESParser.schedules_return retval = new TWS_SCHEDULESParser.schedules_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope scheduleDefinition1 =null;


		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:24:54: ( ( scheduleDefinition )* )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:25:1: ( scheduleDefinition )*
			{
			root_0 = (Object)adaptor.nil();



			retval.streams = new LinkedList<TWSJobStream>() ;

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:28:2: ( scheduleDefinition )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==70) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:28:2: scheduleDefinition
					{
					pushFollow(FOLLOW_scheduleDefinition_in_schedules66);
					scheduleDefinition1=scheduleDefinition();
					state._fsp--;

					adaptor.addChild(root_0, scheduleDefinition1.getTree());

					retval.streams.add((scheduleDefinition1!=null?((TWS_SCHEDULESParser.scheduleDefinition_return)scheduleDefinition1).stream:null));
					}
					break;

				default :
					break loop1;
				}
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
	// $ANTLR end "schedules"


	public static class scheduleDefinition_return extends ParserRuleReturnScope {
		public TWSJobStream stream;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "scheduleDefinition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:33:1: scheduleDefinition returns [TWSJobStream stream] : 'SCHEDULE' sdId= ID ( 'VALIDFROM' DATE_LITERAL )? ( timeZoneDefinition )? ( 'DESCRIPTION' STRING_LITERAL )? ( 'DRAFT' )? ( varTableDefinition )? ( freeDaysDefinition )? ( onStatement )* ( exceptStatement )* ( launchDefinition )? ( untilDefinition )? ( deadlineDefinition )? ( 'CARRYFORWARD' )? ( matchingStatement )* ( followsStatement )* ( 'KEYSCHED' )? ( 'LIMIT' NUMBER )? ( needsStatement )* ( opensStatement )* ( priorityDefinition )? ':' ( jobStatement )* 'END' ;
	public final TWS_SCHEDULESParser.scheduleDefinition_return scheduleDefinition() throws RecognitionException {
		TWS_SCHEDULESParser.scheduleDefinition_return retval = new TWS_SCHEDULESParser.scheduleDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token sdId=null;
		Token string_literal2=null;
		Token string_literal3=null;
		Token DATE_LITERAL4=null;
		Token string_literal6=null;
		Token STRING_LITERAL7=null;
		Token string_literal8=null;
		Token string_literal16=null;
		Token string_literal19=null;
		Token string_literal20=null;
		Token NUMBER21=null;
		Token char_literal25=null;
		Token string_literal27=null;
		ParserRuleReturnScope timeZoneDefinition5 =null;
		ParserRuleReturnScope varTableDefinition9 =null;
		ParserRuleReturnScope freeDaysDefinition10 =null;
		ParserRuleReturnScope onStatement11 =null;
		ParserRuleReturnScope exceptStatement12 =null;
		ParserRuleReturnScope launchDefinition13 =null;
		ParserRuleReturnScope untilDefinition14 =null;
		ParserRuleReturnScope deadlineDefinition15 =null;
		ParserRuleReturnScope matchingStatement17 =null;
		ParserRuleReturnScope followsStatement18 =null;
		ParserRuleReturnScope needsStatement22 =null;
		ParserRuleReturnScope opensStatement23 =null;
		ParserRuleReturnScope priorityDefinition24 =null;
		ParserRuleReturnScope jobStatement26 =null;

		Object sdId_tree=null;
		Object string_literal2_tree=null;
		Object string_literal3_tree=null;
		Object DATE_LITERAL4_tree=null;
		Object string_literal6_tree=null;
		Object STRING_LITERAL7_tree=null;
		Object string_literal8_tree=null;
		Object string_literal16_tree=null;
		Object string_literal19_tree=null;
		Object string_literal20_tree=null;
		Object NUMBER21_tree=null;
		Object char_literal25_tree=null;
		Object string_literal27_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:33:49: ( 'SCHEDULE' sdId= ID ( 'VALIDFROM' DATE_LITERAL )? ( timeZoneDefinition )? ( 'DESCRIPTION' STRING_LITERAL )? ( 'DRAFT' )? ( varTableDefinition )? ( freeDaysDefinition )? ( onStatement )* ( exceptStatement )* ( launchDefinition )? ( untilDefinition )? ( deadlineDefinition )? ( 'CARRYFORWARD' )? ( matchingStatement )* ( followsStatement )* ( 'KEYSCHED' )? ( 'LIMIT' NUMBER )? ( needsStatement )* ( opensStatement )* ( priorityDefinition )? ':' ( jobStatement )* 'END' )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:36:3: 'SCHEDULE' sdId= ID ( 'VALIDFROM' DATE_LITERAL )? ( timeZoneDefinition )? ( 'DESCRIPTION' STRING_LITERAL )? ( 'DRAFT' )? ( varTableDefinition )? ( freeDaysDefinition )? ( onStatement )* ( exceptStatement )* ( launchDefinition )? ( untilDefinition )? ( deadlineDefinition )? ( 'CARRYFORWARD' )? ( matchingStatement )* ( followsStatement )* ( 'KEYSCHED' )? ( 'LIMIT' NUMBER )? ( needsStatement )* ( opensStatement )* ( priorityDefinition )? ':' ( jobStatement )* 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal2=(Token)match(input,70,FOLLOW_70_in_scheduleDefinition89); 
			string_literal2_tree = (Object)adaptor.create(string_literal2);
			adaptor.addChild(root_0, string_literal2_tree);

			sdId=(Token)match(input,ID,FOLLOW_ID_in_scheduleDefinition93); 
			sdId_tree = (Object)adaptor.create(sdId);
			adaptor.addChild(root_0, sdId_tree);


			  retval.stream = new TWSJobStream((sdId!=null?sdId.getText():null)) ;
			  Launcher.createApplicationDirectory((sdId!=null?sdId.getText():null));
			  JobChain jobChain = new JobChain() ;
			  
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:43:2: ( 'VALIDFROM' DATE_LITERAL )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==75) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:43:3: 'VALIDFROM' DATE_LITERAL
					{
					string_literal3=(Token)match(input,75,FOLLOW_75_in_scheduleDefinition105); 
					string_literal3_tree = (Object)adaptor.create(string_literal3);
					adaptor.addChild(root_0, string_literal3_tree);

					DATE_LITERAL4=(Token)match(input,DATE_LITERAL,FOLLOW_DATE_LITERAL_in_scheduleDefinition107); 
					DATE_LITERAL4_tree = (Object)adaptor.create(DATE_LITERAL4);
					adaptor.addChild(root_0, DATE_LITERAL4_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:45:3: ( timeZoneDefinition )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==72||LA3_0==81) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:45:3: timeZoneDefinition
					{
					pushFollow(FOLLOW_timeZoneDefinition_in_scheduleDefinition115);
					timeZoneDefinition5=timeZoneDefinition();
					state._fsp--;

					adaptor.addChild(root_0, timeZoneDefinition5.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:47:2: ( 'DESCRIPTION' STRING_LITERAL )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==42) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:47:3: 'DESCRIPTION' STRING_LITERAL
					{
					string_literal6=(Token)match(input,42,FOLLOW_42_in_scheduleDefinition123); 
					string_literal6_tree = (Object)adaptor.create(string_literal6);
					adaptor.addChild(root_0, string_literal6_tree);

					STRING_LITERAL7=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_scheduleDefinition125); 
					STRING_LITERAL7_tree = (Object)adaptor.create(STRING_LITERAL7);
					adaptor.addChild(root_0, STRING_LITERAL7_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:49:2: ( 'DRAFT' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==43) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:49:3: 'DRAFT'
					{
					string_literal8=(Token)match(input,43,FOLLOW_43_in_scheduleDefinition133); 
					string_literal8_tree = (Object)adaptor.create(string_literal8);
					adaptor.addChild(root_0, string_literal8_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:51:2: ( varTableDefinition )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==77) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:51:2: varTableDefinition
					{
					pushFollow(FOLLOW_varTableDefinition_in_scheduleDefinition140);
					varTableDefinition9=varTableDefinition();
					state._fsp--;

					adaptor.addChild(root_0, varTableDefinition9.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:53:2: ( freeDaysDefinition )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==51) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:53:2: freeDaysDefinition
					{
					pushFollow(FOLLOW_freeDaysDefinition_in_scheduleDefinition146);
					freeDaysDefinition10=freeDaysDefinition();
					state._fsp--;

					adaptor.addChild(root_0, freeDaysDefinition10.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:55:2: ( onStatement )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==60) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:55:2: onStatement
					{
					pushFollow(FOLLOW_onStatement_in_scheduleDefinition152);
					onStatement11=onStatement();
					state._fsp--;

					adaptor.addChild(root_0, onStatement11.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:57:2: ( exceptStatement )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==46) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:57:2: exceptStatement
					{
					pushFollow(FOLLOW_exceptStatement_in_scheduleDefinition158);
					exceptStatement12=exceptStatement();
					state._fsp--;

					adaptor.addChild(root_0, exceptStatement12.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:59:2: ( launchDefinition )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==33||LA10_0==69) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:59:2: launchDefinition
					{
					pushFollow(FOLLOW_launchDefinition_in_scheduleDefinition164);
					launchDefinition13=launchDefinition();
					state._fsp--;

					adaptor.addChild(root_0, launchDefinition13.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:61:2: ( untilDefinition )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==74) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:61:2: untilDefinition
					{
					pushFollow(FOLLOW_untilDefinition_in_scheduleDefinition170);
					untilDefinition14=untilDefinition();
					state._fsp--;

					adaptor.addChild(root_0, untilDefinition14.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:63:2: ( deadlineDefinition )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==41) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:63:2: deadlineDefinition
					{
					pushFollow(FOLLOW_deadlineDefinition_in_scheduleDefinition176);
					deadlineDefinition15=deadlineDefinition();
					state._fsp--;

					adaptor.addChild(root_0, deadlineDefinition15.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:65:2: ( 'CARRYFORWARD' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==35) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:65:2: 'CARRYFORWARD'
					{
					string_literal16=(Token)match(input,35,FOLLOW_35_in_scheduleDefinition182); 
					string_literal16_tree = (Object)adaptor.create(string_literal16);
					adaptor.addChild(root_0, string_literal16_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:67:2: ( matchingStatement )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==58) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:67:2: matchingStatement
					{
					pushFollow(FOLLOW_matchingStatement_in_scheduleDefinition188);
					matchingStatement17=matchingStatement();
					state._fsp--;

					adaptor.addChild(root_0, matchingStatement17.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:69:2: ( followsStatement )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==50) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:69:2: followsStatement
					{
					pushFollow(FOLLOW_followsStatement_in_scheduleDefinition194);
					followsStatement18=followsStatement();
					state._fsp--;

					adaptor.addChild(root_0, followsStatement18.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:71:2: ( 'KEYSCHED' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==56) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:71:3: 'KEYSCHED'
					{
					string_literal19=(Token)match(input,56,FOLLOW_56_in_scheduleDefinition201); 
					string_literal19_tree = (Object)adaptor.create(string_literal19);
					adaptor.addChild(root_0, string_literal19_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:73:2: ( 'LIMIT' NUMBER )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==57) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:73:3: 'LIMIT' NUMBER
					{
					string_literal20=(Token)match(input,57,FOLLOW_57_in_scheduleDefinition209); 
					string_literal20_tree = (Object)adaptor.create(string_literal20);
					adaptor.addChild(root_0, string_literal20_tree);

					NUMBER21=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_scheduleDefinition212); 
					NUMBER21_tree = (Object)adaptor.create(NUMBER21);
					adaptor.addChild(root_0, NUMBER21_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:75:2: ( needsStatement )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==59) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:75:2: needsStatement
					{
					pushFollow(FOLLOW_needsStatement_in_scheduleDefinition219);
					needsStatement22=needsStatement();
					state._fsp--;

					adaptor.addChild(root_0, needsStatement22.getTree());

					}
					break;

				default :
					break loop18;
				}
			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:77:2: ( opensStatement )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==62) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:77:2: opensStatement
					{
					pushFollow(FOLLOW_opensStatement_in_scheduleDefinition225);
					opensStatement23=opensStatement();
					state._fsp--;

					adaptor.addChild(root_0, opensStatement23.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:79:2: ( priorityDefinition )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==64) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:79:2: priorityDefinition
					{
					pushFollow(FOLLOW_priorityDefinition_in_scheduleDefinition231);
					priorityDefinition24=priorityDefinition();
					state._fsp--;

					adaptor.addChild(root_0, priorityDefinition24.getTree());

					}
					break;

			}

			char_literal25=(Token)match(input,32,FOLLOW_32_in_scheduleDefinition237); 
			char_literal25_tree = (Object)adaptor.create(char_literal25);
			adaptor.addChild(root_0, char_literal25_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:82:2: ( jobStatement )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==ID) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:82:3: jobStatement
					{
					pushFollow(FOLLOW_jobStatement_in_scheduleDefinition241);
					jobStatement26=jobStatement();
					state._fsp--;

					adaptor.addChild(root_0, jobStatement26.getTree());


					 Job job = Launcher.getJobById((sdId!=null?sdId.getText():null),(jobStatement26!=null?((TWS_SCHEDULESParser.jobStatement_return)jobStatement26).jobId:null)) ;
					 job.setRunTime((jobStatement26!=null?((TWS_SCHEDULESParser.jobStatement_return)jobStatement26).runTime:null)) ;
					 job.getPriority().add((jobStatement26!=null?((TWS_SCHEDULESParser.jobStatement_return)jobStatement26).priority:null)) ;
					 retval.stream.addJobStatement((jobStatement26!=null?((TWS_SCHEDULESParser.jobStatement_return)jobStatement26).statement:null)) ; 
					 Launcher.putJobIntoDir((sdId!=null?sdId.getText():null),(jobStatement26!=null?((TWS_SCHEDULESParser.jobStatement_return)jobStatement26).jobId:null)) ;
					 
					}
					break;

				default :
					break loop21;
				}
			}


			Launcher.generateJobChain(retval.stream,(sdId!=null?sdId.getText():null).split("#")[0]) ;

			string_literal27=(Token)match(input,44,FOLLOW_44_in_scheduleDefinition253); 
			string_literal27_tree = (Object)adaptor.create(string_literal27);
			adaptor.addChild(root_0, string_literal27_tree);

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
	// $ANTLR end "scheduleDefinition"


	public static class priorityDefinition_return extends ParserRuleReturnScope {
		public String priority;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "priorityDefinition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:100:2: priorityDefinition returns [String priority] : 'PRIORITY' (prio= NUMBER | 'HI' | 'GO' ) ;
	public final TWS_SCHEDULESParser.priorityDefinition_return priorityDefinition() throws RecognitionException {
		TWS_SCHEDULESParser.priorityDefinition_return retval = new TWS_SCHEDULESParser.priorityDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token prio=null;
		Token string_literal28=null;
		Token string_literal29=null;
		Token string_literal30=null;

		Object prio_tree=null;
		Object string_literal28_tree=null;
		Object string_literal29_tree=null;
		Object string_literal30_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:100:45: ( 'PRIORITY' (prio= NUMBER | 'HI' | 'GO' ) )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:101:2: 'PRIORITY' (prio= NUMBER | 'HI' | 'GO' )
			{
			root_0 = (Object)adaptor.nil();


			string_literal28=(Token)match(input,64,FOLLOW_64_in_priorityDefinition272); 
			string_literal28_tree = (Object)adaptor.create(string_literal28);
			adaptor.addChild(root_0, string_literal28_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:101:13: (prio= NUMBER | 'HI' | 'GO' )
			int alt22=3;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt22=1;
				}
				break;
			case 54:
				{
				alt22=2;
				}
				break;
			case 53:
				{
				alt22=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:101:14: prio= NUMBER
					{
					prio=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_priorityDefinition277); 
					prio_tree = (Object)adaptor.create(prio);
					adaptor.addChild(root_0, prio_tree);

					retval.priority = (prio!=null?prio.getText():null);
					}
					break;
				case 2 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:101:51: 'HI'
					{
					string_literal29=(Token)match(input,54,FOLLOW_54_in_priorityDefinition281); 
					string_literal29_tree = (Object)adaptor.create(string_literal29);
					adaptor.addChild(root_0, string_literal29_tree);

					retval.priority ="255"; 
					}
					break;
				case 3 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:101:75: 'GO'
					{
					string_literal30=(Token)match(input,53,FOLLOW_53_in_priorityDefinition284); 
					string_literal30_tree = (Object)adaptor.create(string_literal30);
					adaptor.addChild(root_0, string_literal30_tree);

					retval.priority ="255";
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
	// $ANTLR end "priorityDefinition"


	public static class varTableDefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "varTableDefinition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:105:2: varTableDefinition : 'VARTABLE' ID ;
	public final TWS_SCHEDULESParser.varTableDefinition_return varTableDefinition() throws RecognitionException {
		TWS_SCHEDULESParser.varTableDefinition_return retval = new TWS_SCHEDULESParser.varTableDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal31=null;
		Token ID32=null;

		Object string_literal31_tree=null;
		Object ID32_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:105:21: ( 'VARTABLE' ID )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:106:2: 'VARTABLE' ID
			{
			root_0 = (Object)adaptor.nil();


			string_literal31=(Token)match(input,77,FOLLOW_77_in_varTableDefinition302); 
			string_literal31_tree = (Object)adaptor.create(string_literal31);
			adaptor.addChild(root_0, string_literal31_tree);

			ID32=(Token)match(input,ID,FOLLOW_ID_in_varTableDefinition304); 
			ID32_tree = (Object)adaptor.create(ID32);
			adaptor.addChild(root_0, ID32_tree);

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
	// $ANTLR end "varTableDefinition"


	public static class freeDaysDefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "freeDaysDefinition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:109:2: freeDaysDefinition : 'FREEDAYS' ID ( '-SA' )? ( '-SU' )? ;
	public final TWS_SCHEDULESParser.freeDaysDefinition_return freeDaysDefinition() throws RecognitionException {
		TWS_SCHEDULESParser.freeDaysDefinition_return retval = new TWS_SCHEDULESParser.freeDaysDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal33=null;
		Token ID34=null;
		Token string_literal35=null;
		Token string_literal36=null;

		Object string_literal33_tree=null;
		Object ID34_tree=null;
		Object string_literal35_tree=null;
		Object string_literal36_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:109:21: ( 'FREEDAYS' ID ( '-SA' )? ( '-SU' )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:110:2: 'FREEDAYS' ID ( '-SA' )? ( '-SU' )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal33=(Token)match(input,51,FOLLOW_51_in_freeDaysDefinition317); 
			string_literal33_tree = (Object)adaptor.create(string_literal33);
			adaptor.addChild(root_0, string_literal33_tree);

			ID34=(Token)match(input,ID,FOLLOW_ID_in_freeDaysDefinition319); 
			ID34_tree = (Object)adaptor.create(ID34);
			adaptor.addChild(root_0, ID34_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:110:16: ( '-SA' )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==17) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:110:17: '-SA'
					{
					string_literal35=(Token)match(input,17,FOLLOW_17_in_freeDaysDefinition322); 
					string_literal35_tree = (Object)adaptor.create(string_literal35);
					adaptor.addChild(root_0, string_literal35_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:110:25: ( '-SU' )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==18) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:110:26: '-SU'
					{
					string_literal36=(Token)match(input,18,FOLLOW_18_in_freeDaysDefinition327); 
					string_literal36_tree = (Object)adaptor.create(string_literal36);
					adaptor.addChild(root_0, string_literal36_tree);

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
	// $ANTLR end "freeDaysDefinition"


	public static class onStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "onStatement"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:113:2: onStatement : 'ON' ( 'RUNCYCLE' ID )? ( 'VALIDFROM' DATE_LITERAL )? ( 'VALIDTO' DATE_LITERAL )? ( 'DESCRIPTION' STRING_LITERAL )? ( 'VARTABLE' ID )? ( calendarDefinition )* ( fdOptions )? ( '(' ( launchDefinition )? ( untilDefinition )? ( deadlineDefinition )? ')' )? ;
	public final TWS_SCHEDULESParser.onStatement_return onStatement() throws RecognitionException {
		TWS_SCHEDULESParser.onStatement_return retval = new TWS_SCHEDULESParser.onStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal37=null;
		Token string_literal38=null;
		Token ID39=null;
		Token string_literal40=null;
		Token DATE_LITERAL41=null;
		Token string_literal42=null;
		Token DATE_LITERAL43=null;
		Token string_literal44=null;
		Token STRING_LITERAL45=null;
		Token string_literal46=null;
		Token ID47=null;
		Token char_literal50=null;
		Token char_literal54=null;
		ParserRuleReturnScope calendarDefinition48 =null;
		ParserRuleReturnScope fdOptions49 =null;
		ParserRuleReturnScope launchDefinition51 =null;
		ParserRuleReturnScope untilDefinition52 =null;
		ParserRuleReturnScope deadlineDefinition53 =null;

		Object string_literal37_tree=null;
		Object string_literal38_tree=null;
		Object ID39_tree=null;
		Object string_literal40_tree=null;
		Object DATE_LITERAL41_tree=null;
		Object string_literal42_tree=null;
		Object DATE_LITERAL43_tree=null;
		Object string_literal44_tree=null;
		Object STRING_LITERAL45_tree=null;
		Object string_literal46_tree=null;
		Object ID47_tree=null;
		Object char_literal50_tree=null;
		Object char_literal54_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:113:14: ( 'ON' ( 'RUNCYCLE' ID )? ( 'VALIDFROM' DATE_LITERAL )? ( 'VALIDTO' DATE_LITERAL )? ( 'DESCRIPTION' STRING_LITERAL )? ( 'VARTABLE' ID )? ( calendarDefinition )* ( fdOptions )? ( '(' ( launchDefinition )? ( untilDefinition )? ( deadlineDefinition )? ')' )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:115:2: 'ON' ( 'RUNCYCLE' ID )? ( 'VALIDFROM' DATE_LITERAL )? ( 'VALIDTO' DATE_LITERAL )? ( 'DESCRIPTION' STRING_LITERAL )? ( 'VARTABLE' ID )? ( calendarDefinition )* ( fdOptions )? ( '(' ( launchDefinition )? ( untilDefinition )? ( deadlineDefinition )? ')' )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal37=(Token)match(input,60,FOLLOW_60_in_onStatement344); 
			string_literal37_tree = (Object)adaptor.create(string_literal37);
			adaptor.addChild(root_0, string_literal37_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:115:7: ( 'RUNCYCLE' ID )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==67) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:115:8: 'RUNCYCLE' ID
					{
					string_literal38=(Token)match(input,67,FOLLOW_67_in_onStatement347); 
					string_literal38_tree = (Object)adaptor.create(string_literal38);
					adaptor.addChild(root_0, string_literal38_tree);

					ID39=(Token)match(input,ID,FOLLOW_ID_in_onStatement349); 
					ID39_tree = (Object)adaptor.create(ID39);
					adaptor.addChild(root_0, ID39_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:117:2: ( 'VALIDFROM' DATE_LITERAL )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==75) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:117:3: 'VALIDFROM' DATE_LITERAL
					{
					string_literal40=(Token)match(input,75,FOLLOW_75_in_onStatement357); 
					string_literal40_tree = (Object)adaptor.create(string_literal40);
					adaptor.addChild(root_0, string_literal40_tree);

					DATE_LITERAL41=(Token)match(input,DATE_LITERAL,FOLLOW_DATE_LITERAL_in_onStatement359); 
					DATE_LITERAL41_tree = (Object)adaptor.create(DATE_LITERAL41);
					adaptor.addChild(root_0, DATE_LITERAL41_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:117:30: ( 'VALIDTO' DATE_LITERAL )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==76) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:117:31: 'VALIDTO' DATE_LITERAL
					{
					string_literal42=(Token)match(input,76,FOLLOW_76_in_onStatement364); 
					string_literal42_tree = (Object)adaptor.create(string_literal42);
					adaptor.addChild(root_0, string_literal42_tree);

					DATE_LITERAL43=(Token)match(input,DATE_LITERAL,FOLLOW_DATE_LITERAL_in_onStatement366); 
					DATE_LITERAL43_tree = (Object)adaptor.create(DATE_LITERAL43);
					adaptor.addChild(root_0, DATE_LITERAL43_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:119:2: ( 'DESCRIPTION' STRING_LITERAL )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==42) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:119:3: 'DESCRIPTION' STRING_LITERAL
					{
					string_literal44=(Token)match(input,42,FOLLOW_42_in_onStatement374); 
					string_literal44_tree = (Object)adaptor.create(string_literal44);
					adaptor.addChild(root_0, string_literal44_tree);

					STRING_LITERAL45=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_onStatement376); 
					STRING_LITERAL45_tree = (Object)adaptor.create(STRING_LITERAL45);
					adaptor.addChild(root_0, STRING_LITERAL45_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:121:2: ( 'VARTABLE' ID )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==77) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:121:3: 'VARTABLE' ID
					{
					string_literal46=(Token)match(input,77,FOLLOW_77_in_onStatement384); 
					string_literal46_tree = (Object)adaptor.create(string_literal46);
					adaptor.addChild(root_0, string_literal46_tree);

					ID47=(Token)match(input,ID,FOLLOW_ID_in_onStatement386); 
					ID47_tree = (Object)adaptor.create(ID47);
					adaptor.addChild(root_0, ID47_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:123:2: ( calendarDefinition )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==DATE_LITERAL||LA30_0==ID||LA30_0==STRING_LITERAL||LA30_0==66) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:123:2: calendarDefinition
					{
					pushFollow(FOLLOW_calendarDefinition_in_onStatement393);
					calendarDefinition48=calendarDefinition();
					state._fsp--;

					adaptor.addChild(root_0, calendarDefinition48.getTree());

					}
					break;

				default :
					break loop30;
				}
			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:125:2: ( fdOptions )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( ((LA31_0 >= 47 && LA31_0 <= 49)) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:125:2: fdOptions
					{
					pushFollow(FOLLOW_fdOptions_in_onStatement399);
					fdOptions49=fdOptions();
					state._fsp--;

					adaptor.addChild(root_0, fdOptions49.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:127:2: ( '(' ( launchDefinition )? ( untilDefinition )? ( deadlineDefinition )? ')' )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==12) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:127:3: '(' ( launchDefinition )? ( untilDefinition )? ( deadlineDefinition )? ')'
					{
					char_literal50=(Token)match(input,12,FOLLOW_12_in_onStatement406); 
					char_literal50_tree = (Object)adaptor.create(char_literal50);
					adaptor.addChild(root_0, char_literal50_tree);

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:128:2: ( launchDefinition )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==33||LA32_0==69) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:128:2: launchDefinition
							{
							pushFollow(FOLLOW_launchDefinition_in_onStatement409);
							launchDefinition51=launchDefinition();
							state._fsp--;

							adaptor.addChild(root_0, launchDefinition51.getTree());

							}
							break;

					}

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:130:2: ( untilDefinition )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==74) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:130:2: untilDefinition
							{
							pushFollow(FOLLOW_untilDefinition_in_onStatement415);
							untilDefinition52=untilDefinition();
							state._fsp--;

							adaptor.addChild(root_0, untilDefinition52.getTree());

							}
							break;

					}

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:132:2: ( deadlineDefinition )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==41) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:132:2: deadlineDefinition
							{
							pushFollow(FOLLOW_deadlineDefinition_in_onStatement421);
							deadlineDefinition53=deadlineDefinition();
							state._fsp--;

							adaptor.addChild(root_0, deadlineDefinition53.getTree());

							}
							break;

					}

					char_literal54=(Token)match(input,13,FOLLOW_13_in_onStatement427); 
					char_literal54_tree = (Object)adaptor.create(char_literal54);
					adaptor.addChild(root_0, char_literal54_tree);

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
	// $ANTLR end "onStatement"


	public static class exceptStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exceptStatement"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:138:2: exceptStatement : 'EXCEPT' ( 'RUNCYCLE' )? ( ID )? ( 'VALIDFROM' DATE_LITERAL )? ( 'VALIDTO' DATE_LITERAL )? ( 'DESCRIPTION' STRING_LITERAL )? ( 'VARTABLE' ID )? ( calendarDefinition )* ( fdOptions )? ( '(' ( launchDefinition )? ')' )? ;
	public final TWS_SCHEDULESParser.exceptStatement_return exceptStatement() throws RecognitionException {
		TWS_SCHEDULESParser.exceptStatement_return retval = new TWS_SCHEDULESParser.exceptStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal55=null;
		Token string_literal56=null;
		Token ID57=null;
		Token string_literal58=null;
		Token DATE_LITERAL59=null;
		Token string_literal60=null;
		Token DATE_LITERAL61=null;
		Token string_literal62=null;
		Token STRING_LITERAL63=null;
		Token string_literal64=null;
		Token ID65=null;
		Token char_literal68=null;
		Token char_literal70=null;
		ParserRuleReturnScope calendarDefinition66 =null;
		ParserRuleReturnScope fdOptions67 =null;
		ParserRuleReturnScope launchDefinition69 =null;

		Object string_literal55_tree=null;
		Object string_literal56_tree=null;
		Object ID57_tree=null;
		Object string_literal58_tree=null;
		Object DATE_LITERAL59_tree=null;
		Object string_literal60_tree=null;
		Object DATE_LITERAL61_tree=null;
		Object string_literal62_tree=null;
		Object STRING_LITERAL63_tree=null;
		Object string_literal64_tree=null;
		Object ID65_tree=null;
		Object char_literal68_tree=null;
		Object char_literal70_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:138:18: ( 'EXCEPT' ( 'RUNCYCLE' )? ( ID )? ( 'VALIDFROM' DATE_LITERAL )? ( 'VALIDTO' DATE_LITERAL )? ( 'DESCRIPTION' STRING_LITERAL )? ( 'VARTABLE' ID )? ( calendarDefinition )* ( fdOptions )? ( '(' ( launchDefinition )? ')' )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:140:2: 'EXCEPT' ( 'RUNCYCLE' )? ( ID )? ( 'VALIDFROM' DATE_LITERAL )? ( 'VALIDTO' DATE_LITERAL )? ( 'DESCRIPTION' STRING_LITERAL )? ( 'VARTABLE' ID )? ( calendarDefinition )* ( fdOptions )? ( '(' ( launchDefinition )? ')' )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal55=(Token)match(input,46,FOLLOW_46_in_exceptStatement447); 
			string_literal55_tree = (Object)adaptor.create(string_literal55);
			adaptor.addChild(root_0, string_literal55_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:140:11: ( 'RUNCYCLE' )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==67) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:140:12: 'RUNCYCLE'
					{
					string_literal56=(Token)match(input,67,FOLLOW_67_in_exceptStatement450); 
					string_literal56_tree = (Object)adaptor.create(string_literal56);
					adaptor.addChild(root_0, string_literal56_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:140:25: ( ID )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==ID) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:140:25: ID
					{
					ID57=(Token)match(input,ID,FOLLOW_ID_in_exceptStatement454); 
					ID57_tree = (Object)adaptor.create(ID57);
					adaptor.addChild(root_0, ID57_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:142:2: ( 'VALIDFROM' DATE_LITERAL )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==75) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:142:3: 'VALIDFROM' DATE_LITERAL
					{
					string_literal58=(Token)match(input,75,FOLLOW_75_in_exceptStatement461); 
					string_literal58_tree = (Object)adaptor.create(string_literal58);
					adaptor.addChild(root_0, string_literal58_tree);

					DATE_LITERAL59=(Token)match(input,DATE_LITERAL,FOLLOW_DATE_LITERAL_in_exceptStatement463); 
					DATE_LITERAL59_tree = (Object)adaptor.create(DATE_LITERAL59);
					adaptor.addChild(root_0, DATE_LITERAL59_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:142:30: ( 'VALIDTO' DATE_LITERAL )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==76) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:142:31: 'VALIDTO' DATE_LITERAL
					{
					string_literal60=(Token)match(input,76,FOLLOW_76_in_exceptStatement468); 
					string_literal60_tree = (Object)adaptor.create(string_literal60);
					adaptor.addChild(root_0, string_literal60_tree);

					DATE_LITERAL61=(Token)match(input,DATE_LITERAL,FOLLOW_DATE_LITERAL_in_exceptStatement470); 
					DATE_LITERAL61_tree = (Object)adaptor.create(DATE_LITERAL61);
					adaptor.addChild(root_0, DATE_LITERAL61_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:144:2: ( 'DESCRIPTION' STRING_LITERAL )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==42) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:144:3: 'DESCRIPTION' STRING_LITERAL
					{
					string_literal62=(Token)match(input,42,FOLLOW_42_in_exceptStatement478); 
					string_literal62_tree = (Object)adaptor.create(string_literal62);
					adaptor.addChild(root_0, string_literal62_tree);

					STRING_LITERAL63=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_exceptStatement480); 
					STRING_LITERAL63_tree = (Object)adaptor.create(STRING_LITERAL63);
					adaptor.addChild(root_0, STRING_LITERAL63_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:146:2: ( 'VARTABLE' ID )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==77) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:146:3: 'VARTABLE' ID
					{
					string_literal64=(Token)match(input,77,FOLLOW_77_in_exceptStatement488); 
					string_literal64_tree = (Object)adaptor.create(string_literal64);
					adaptor.addChild(root_0, string_literal64_tree);

					ID65=(Token)match(input,ID,FOLLOW_ID_in_exceptStatement490); 
					ID65_tree = (Object)adaptor.create(ID65);
					adaptor.addChild(root_0, ID65_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:148:2: ( calendarDefinition )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==DATE_LITERAL||LA42_0==ID||LA42_0==STRING_LITERAL||LA42_0==66) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:148:2: calendarDefinition
					{
					pushFollow(FOLLOW_calendarDefinition_in_exceptStatement497);
					calendarDefinition66=calendarDefinition();
					state._fsp--;

					adaptor.addChild(root_0, calendarDefinition66.getTree());

					}
					break;

				default :
					break loop42;
				}
			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:150:2: ( fdOptions )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( ((LA43_0 >= 47 && LA43_0 <= 49)) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:150:2: fdOptions
					{
					pushFollow(FOLLOW_fdOptions_in_exceptStatement503);
					fdOptions67=fdOptions();
					state._fsp--;

					adaptor.addChild(root_0, fdOptions67.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:152:2: ( '(' ( launchDefinition )? ')' )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==12) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:152:3: '(' ( launchDefinition )? ')'
					{
					char_literal68=(Token)match(input,12,FOLLOW_12_in_exceptStatement511); 
					char_literal68_tree = (Object)adaptor.create(char_literal68);
					adaptor.addChild(root_0, char_literal68_tree);

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:154:2: ( launchDefinition )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==33||LA44_0==69) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:154:2: launchDefinition
							{
							pushFollow(FOLLOW_launchDefinition_in_exceptStatement516);
							launchDefinition69=launchDefinition();
							state._fsp--;

							adaptor.addChild(root_0, launchDefinition69.getTree());

							}
							break;

					}

					char_literal70=(Token)match(input,13,FOLLOW_13_in_exceptStatement523); 
					char_literal70_tree = (Object)adaptor.create(char_literal70);
					adaptor.addChild(root_0, char_literal70_tree);

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
	// $ANTLR end "exceptStatement"


	public static class matchingStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "matchingStatement"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:160:2: matchingStatement : 'MATCHING' ( followsOrMatchingOptions )? ;
	public final TWS_SCHEDULESParser.matchingStatement_return matchingStatement() throws RecognitionException {
		TWS_SCHEDULESParser.matchingStatement_return retval = new TWS_SCHEDULESParser.matchingStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal71=null;
		ParserRuleReturnScope followsOrMatchingOptions72 =null;

		Object string_literal71_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:160:20: ( 'MATCHING' ( followsOrMatchingOptions )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:161:2: 'MATCHING' ( followsOrMatchingOptions )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal71=(Token)match(input,58,FOLLOW_58_in_matchingStatement541); 
			string_literal71_tree = (Object)adaptor.create(string_literal71);
			adaptor.addChild(root_0, string_literal71_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:162:2: ( followsOrMatchingOptions )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==52||LA46_0==63||LA46_0==65||LA46_0==68) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:162:2: followsOrMatchingOptions
					{
					pushFollow(FOLLOW_followsOrMatchingOptions_in_matchingStatement545);
					followsOrMatchingOptions72=followsOrMatchingOptions();
					state._fsp--;

					adaptor.addChild(root_0, followsOrMatchingOptions72.getTree());

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
	// $ANTLR end "matchingStatement"


	public static class followsStatement_return extends ParserRuleReturnScope {
		public String jobId;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "followsStatement"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:165:2: followsStatement returns [String jobId] : 'FOLLOWS' id= ID ( followsOrMatchingOptions )? ;
	public final TWS_SCHEDULESParser.followsStatement_return followsStatement() throws RecognitionException {
		TWS_SCHEDULESParser.followsStatement_return retval = new TWS_SCHEDULESParser.followsStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token id=null;
		Token string_literal73=null;
		ParserRuleReturnScope followsOrMatchingOptions74 =null;

		Object id_tree=null;
		Object string_literal73_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:165:41: ( 'FOLLOWS' id= ID ( followsOrMatchingOptions )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:166:2: 'FOLLOWS' id= ID ( followsOrMatchingOptions )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal73=(Token)match(input,50,FOLLOW_50_in_followsStatement563); 
			string_literal73_tree = (Object)adaptor.create(string_literal73);
			adaptor.addChild(root_0, string_literal73_tree);

			id=(Token)match(input,ID,FOLLOW_ID_in_followsStatement567); 
			id_tree = (Object)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);

			retval.jobId = (id!=null?id.getText():null);
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:167:2: ( followsOrMatchingOptions )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==52||LA47_0==63||LA47_0==65||LA47_0==68) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:167:2: followsOrMatchingOptions
					{
					pushFollow(FOLLOW_followsOrMatchingOptions_in_followsStatement572);
					followsOrMatchingOptions74=followsOrMatchingOptions();
					state._fsp--;

					adaptor.addChild(root_0, followsOrMatchingOptions74.getTree());

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
	// $ANTLR end "followsStatement"


	public static class followsOrMatchingOptions_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "followsOrMatchingOptions"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:170:2: followsOrMatchingOptions : ( 'SAMEDAY' | 'PREVIOUS' | ( 'RELATIVE' 'FROM' ( '+' | '-' )? NUMBER 'TO' ( '+' | '-' )? NUMBER ) | ( 'FROM' ( '+' | '-' )? NUMBER ( ( '+' | '-' )? NUMBER day )? 'TO' ( '+' | '-' )? NUMBER ( ( '+' | '-' )? NUMBER day )? ) );
	public final TWS_SCHEDULESParser.followsOrMatchingOptions_return followsOrMatchingOptions() throws RecognitionException {
		TWS_SCHEDULESParser.followsOrMatchingOptions_return retval = new TWS_SCHEDULESParser.followsOrMatchingOptions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal75=null;
		Token string_literal76=null;
		Token string_literal77=null;
		Token string_literal78=null;
		Token set79=null;
		Token NUMBER80=null;
		Token string_literal81=null;
		Token set82=null;
		Token NUMBER83=null;
		Token string_literal84=null;
		Token set85=null;
		Token NUMBER86=null;
		Token set87=null;
		Token NUMBER88=null;
		Token string_literal90=null;
		Token set91=null;
		Token NUMBER92=null;
		Token set93=null;
		Token NUMBER94=null;
		ParserRuleReturnScope day89 =null;
		ParserRuleReturnScope day95 =null;

		Object string_literal75_tree=null;
		Object string_literal76_tree=null;
		Object string_literal77_tree=null;
		Object string_literal78_tree=null;
		Object set79_tree=null;
		Object NUMBER80_tree=null;
		Object string_literal81_tree=null;
		Object set82_tree=null;
		Object NUMBER83_tree=null;
		Object string_literal84_tree=null;
		Object set85_tree=null;
		Object NUMBER86_tree=null;
		Object set87_tree=null;
		Object NUMBER88_tree=null;
		Object string_literal90_tree=null;
		Object set91_tree=null;
		Object NUMBER92_tree=null;
		Object set93_tree=null;
		Object NUMBER94_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:170:27: ( 'SAMEDAY' | 'PREVIOUS' | ( 'RELATIVE' 'FROM' ( '+' | '-' )? NUMBER 'TO' ( '+' | '-' )? NUMBER ) | ( 'FROM' ( '+' | '-' )? NUMBER ( ( '+' | '-' )? NUMBER day )? 'TO' ( '+' | '-' )? NUMBER ( ( '+' | '-' )? NUMBER day )? ) )
			int alt56=4;
			switch ( input.LA(1) ) {
			case 68:
				{
				alt56=1;
				}
				break;
			case 63:
				{
				alt56=2;
				}
				break;
			case 65:
				{
				alt56=3;
				}
				break;
			case 52:
				{
				alt56=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:171:2: 'SAMEDAY'
					{
					root_0 = (Object)adaptor.nil();


					string_literal75=(Token)match(input,68,FOLLOW_68_in_followsOrMatchingOptions587); 
					string_literal75_tree = (Object)adaptor.create(string_literal75);
					adaptor.addChild(root_0, string_literal75_tree);

					}
					break;
				case 2 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:172:3: 'PREVIOUS'
					{
					root_0 = (Object)adaptor.nil();


					string_literal76=(Token)match(input,63,FOLLOW_63_in_followsOrMatchingOptions591); 
					string_literal76_tree = (Object)adaptor.create(string_literal76);
					adaptor.addChild(root_0, string_literal76_tree);

					}
					break;
				case 3 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:173:3: ( 'RELATIVE' 'FROM' ( '+' | '-' )? NUMBER 'TO' ( '+' | '-' )? NUMBER )
					{
					root_0 = (Object)adaptor.nil();


					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:173:3: ( 'RELATIVE' 'FROM' ( '+' | '-' )? NUMBER 'TO' ( '+' | '-' )? NUMBER )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:173:4: 'RELATIVE' 'FROM' ( '+' | '-' )? NUMBER 'TO' ( '+' | '-' )? NUMBER
					{
					string_literal77=(Token)match(input,65,FOLLOW_65_in_followsOrMatchingOptions596); 
					string_literal77_tree = (Object)adaptor.create(string_literal77);
					adaptor.addChild(root_0, string_literal77_tree);

					string_literal78=(Token)match(input,52,FOLLOW_52_in_followsOrMatchingOptions598); 
					string_literal78_tree = (Object)adaptor.create(string_literal78);
					adaptor.addChild(root_0, string_literal78_tree);

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:173:22: ( '+' | '-' )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==14||LA48_0==16) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:
							{
							set79=input.LT(1);
							if ( input.LA(1)==14||input.LA(1)==16 ) {
								input.consume();
								adaptor.addChild(root_0, (Object)adaptor.create(set79));
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					NUMBER80=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_followsOrMatchingOptions607); 
					NUMBER80_tree = (Object)adaptor.create(NUMBER80);
					adaptor.addChild(root_0, NUMBER80_tree);

					string_literal81=(Token)match(input,73,FOLLOW_73_in_followsOrMatchingOptions609); 
					string_literal81_tree = (Object)adaptor.create(string_literal81);
					adaptor.addChild(root_0, string_literal81_tree);

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:173:45: ( '+' | '-' )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==14||LA49_0==16) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:
							{
							set82=input.LT(1);
							if ( input.LA(1)==14||input.LA(1)==16 ) {
								input.consume();
								adaptor.addChild(root_0, (Object)adaptor.create(set82));
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					NUMBER83=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_followsOrMatchingOptions618); 
					NUMBER83_tree = (Object)adaptor.create(NUMBER83);
					adaptor.addChild(root_0, NUMBER83_tree);

					}

					}
					break;
				case 4 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:3: ( 'FROM' ( '+' | '-' )? NUMBER ( ( '+' | '-' )? NUMBER day )? 'TO' ( '+' | '-' )? NUMBER ( ( '+' | '-' )? NUMBER day )? )
					{
					root_0 = (Object)adaptor.nil();


					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:3: ( 'FROM' ( '+' | '-' )? NUMBER ( ( '+' | '-' )? NUMBER day )? 'TO' ( '+' | '-' )? NUMBER ( ( '+' | '-' )? NUMBER day )? )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:4: 'FROM' ( '+' | '-' )? NUMBER ( ( '+' | '-' )? NUMBER day )? 'TO' ( '+' | '-' )? NUMBER ( ( '+' | '-' )? NUMBER day )?
					{
					string_literal84=(Token)match(input,52,FOLLOW_52_in_followsOrMatchingOptions624); 
					string_literal84_tree = (Object)adaptor.create(string_literal84);
					adaptor.addChild(root_0, string_literal84_tree);

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:11: ( '+' | '-' )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==14||LA50_0==16) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:
							{
							set85=input.LT(1);
							if ( input.LA(1)==14||input.LA(1)==16 ) {
								input.consume();
								adaptor.addChild(root_0, (Object)adaptor.create(set85));
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					NUMBER86=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_followsOrMatchingOptions633); 
					NUMBER86_tree = (Object)adaptor.create(NUMBER86);
					adaptor.addChild(root_0, NUMBER86_tree);

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:29: ( ( '+' | '-' )? NUMBER day )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==NUMBER||LA52_0==14||LA52_0==16) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:30: ( '+' | '-' )? NUMBER day
							{
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:30: ( '+' | '-' )?
							int alt51=2;
							int LA51_0 = input.LA(1);
							if ( (LA51_0==14||LA51_0==16) ) {
								alt51=1;
							}
							switch (alt51) {
								case 1 :
									// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:
									{
									set87=input.LT(1);
									if ( input.LA(1)==14||input.LA(1)==16 ) {
										input.consume();
										adaptor.addChild(root_0, (Object)adaptor.create(set87));
										state.errorRecovery=false;
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									}
									break;

							}

							NUMBER88=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_followsOrMatchingOptions643); 
							NUMBER88_tree = (Object)adaptor.create(NUMBER88);
							adaptor.addChild(root_0, NUMBER88_tree);

							pushFollow(FOLLOW_day_in_followsOrMatchingOptions645);
							day89=day();
							state._fsp--;

							adaptor.addChild(root_0, day89.getTree());

							}
							break;

					}

					string_literal90=(Token)match(input,73,FOLLOW_73_in_followsOrMatchingOptions649); 
					string_literal90_tree = (Object)adaptor.create(string_literal90);
					adaptor.addChild(root_0, string_literal90_tree);

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:59: ( '+' | '-' )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==14||LA53_0==16) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:
							{
							set91=input.LT(1);
							if ( input.LA(1)==14||input.LA(1)==16 ) {
								input.consume();
								adaptor.addChild(root_0, (Object)adaptor.create(set91));
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					NUMBER92=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_followsOrMatchingOptions658); 
					NUMBER92_tree = (Object)adaptor.create(NUMBER92);
					adaptor.addChild(root_0, NUMBER92_tree);

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:77: ( ( '+' | '-' )? NUMBER day )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==NUMBER||LA55_0==14||LA55_0==16) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:78: ( '+' | '-' )? NUMBER day
							{
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:174:78: ( '+' | '-' )?
							int alt54=2;
							int LA54_0 = input.LA(1);
							if ( (LA54_0==14||LA54_0==16) ) {
								alt54=1;
							}
							switch (alt54) {
								case 1 :
									// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:
									{
									set93=input.LT(1);
									if ( input.LA(1)==14||input.LA(1)==16 ) {
										input.consume();
										adaptor.addChild(root_0, (Object)adaptor.create(set93));
										state.errorRecovery=false;
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									}
									break;

							}

							NUMBER94=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_followsOrMatchingOptions668); 
							NUMBER94_tree = (Object)adaptor.create(NUMBER94);
							adaptor.addChild(root_0, NUMBER94_tree);

							pushFollow(FOLLOW_day_in_followsOrMatchingOptions670);
							day95=day();
							state._fsp--;

							adaptor.addChild(root_0, day95.getTree());

							}
							break;

					}

					}

					}
					break;

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
	// $ANTLR end "followsOrMatchingOptions"


	public static class calendarDefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "calendarDefinition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:179:2: calendarDefinition : ( ID | STRING_LITERAL | 'REQUEST' | groupDate );
	public final TWS_SCHEDULESParser.calendarDefinition_return calendarDefinition() throws RecognitionException {
		TWS_SCHEDULESParser.calendarDefinition_return retval = new TWS_SCHEDULESParser.calendarDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID96=null;
		Token STRING_LITERAL97=null;
		Token string_literal98=null;
		ParserRuleReturnScope groupDate99 =null;

		Object ID96_tree=null;
		Object STRING_LITERAL97_tree=null;
		Object string_literal98_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:179:21: ( ID | STRING_LITERAL | 'REQUEST' | groupDate )
			int alt57=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt57=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt57=2;
				}
				break;
			case 66:
				{
				alt57=3;
				}
				break;
			case DATE_LITERAL:
				{
				alt57=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:180:2: ID
					{
					root_0 = (Object)adaptor.nil();


					ID96=(Token)match(input,ID,FOLLOW_ID_in_calendarDefinition692); 
					ID96_tree = (Object)adaptor.create(ID96);
					adaptor.addChild(root_0, ID96_tree);

					}
					break;
				case 2 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:181:3: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL97=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_calendarDefinition697); 
					STRING_LITERAL97_tree = (Object)adaptor.create(STRING_LITERAL97);
					adaptor.addChild(root_0, STRING_LITERAL97_tree);

					}
					break;
				case 3 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:182:3: 'REQUEST'
					{
					root_0 = (Object)adaptor.nil();


					string_literal98=(Token)match(input,66,FOLLOW_66_in_calendarDefinition702); 
					string_literal98_tree = (Object)adaptor.create(string_literal98);
					adaptor.addChild(root_0, string_literal98_tree);

					}
					break;
				case 4 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:183:3: groupDate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_groupDate_in_calendarDefinition707);
					groupDate99=groupDate();
					state._fsp--;

					adaptor.addChild(root_0, groupDate99.getTree());

					}
					break;

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
	// $ANTLR end "calendarDefinition"


	public static class jobStatement_return extends ParserRuleReturnScope {
		public String jobId;
		public RunTime runTime;
		public String priority;
		public TWSJobStatement statement;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "jobStatement"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:186:2: jobStatement returns [String jobId,RunTime runTime,String priority\n ,TWSJobStatement statement\n ] :id1= ID ( launchDefinition | untilDefinition | deadlineDefinition | ( 'EVERY' NUMBER ) | followsStatement | 'CONFIRMED' | 'CRITICAL' | 'KEYJOB' | needsStatement | priorityDefinition | opensStatement )* ;
	public final TWS_SCHEDULESParser.jobStatement_return jobStatement() throws RecognitionException {
		TWS_SCHEDULESParser.jobStatement_return retval = new TWS_SCHEDULESParser.jobStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token id1=null;
		Token string_literal103=null;
		Token NUMBER104=null;
		Token string_literal106=null;
		Token string_literal107=null;
		Token string_literal108=null;
		ParserRuleReturnScope launchDefinition100 =null;
		ParserRuleReturnScope untilDefinition101 =null;
		ParserRuleReturnScope deadlineDefinition102 =null;
		ParserRuleReturnScope followsStatement105 =null;
		ParserRuleReturnScope needsStatement109 =null;
		ParserRuleReturnScope priorityDefinition110 =null;
		ParserRuleReturnScope opensStatement111 =null;

		Object id1_tree=null;
		Object string_literal103_tree=null;
		Object NUMBER104_tree=null;
		Object string_literal106_tree=null;
		Object string_literal107_tree=null;
		Object string_literal108_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:188:4: (id1= ID ( launchDefinition | untilDefinition | deadlineDefinition | ( 'EVERY' NUMBER ) | followsStatement | 'CONFIRMED' | 'CRITICAL' | 'KEYJOB' | needsStatement | priorityDefinition | opensStatement )* )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:189:2: id1= ID ( launchDefinition | untilDefinition | deadlineDefinition | ( 'EVERY' NUMBER ) | followsStatement | 'CONFIRMED' | 'CRITICAL' | 'KEYJOB' | needsStatement | priorityDefinition | opensStatement )*
			{
			root_0 = (Object)adaptor.nil();



			 retval.runTime = new RunTime() ;
			 
			 
			id1=(Token)match(input,ID,FOLLOW_ID_in_jobStatement730); 
			id1_tree = (Object)adaptor.create(id1);
			adaptor.addChild(root_0, id1_tree);

			retval.jobId =(id1!=null?id1.getText():null) ;
			 retval.statement = new TWSJobStatement((id1!=null?id1.getText():null)) ;
			 
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:196:2: ( launchDefinition | untilDefinition | deadlineDefinition | ( 'EVERY' NUMBER ) | followsStatement | 'CONFIRMED' | 'CRITICAL' | 'KEYJOB' | needsStatement | priorityDefinition | opensStatement )*
			loop58:
			while (true) {
				int alt58=12;
				switch ( input.LA(1) ) {
				case 33:
				case 69:
					{
					alt58=1;
					}
					break;
				case 74:
					{
					alt58=2;
					}
					break;
				case 41:
					{
					alt58=3;
					}
					break;
				case 45:
					{
					alt58=4;
					}
					break;
				case 50:
					{
					alt58=5;
					}
					break;
				case 36:
					{
					alt58=6;
					}
					break;
				case 38:
					{
					alt58=7;
					}
					break;
				case 55:
					{
					alt58=8;
					}
					break;
				case 59:
					{
					alt58=9;
					}
					break;
				case 64:
					{
					alt58=10;
					}
					break;
				case 62:
					{
					alt58=11;
					}
					break;
				}
				switch (alt58) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:197:2: launchDefinition
					{
					pushFollow(FOLLOW_launchDefinition_in_jobStatement738);
					launchDefinition100=launchDefinition();
					state._fsp--;

					adaptor.addChild(root_0, launchDefinition100.getTree());


					 retval.runTime.getPeriod().add((launchDefinition100!=null?((TWS_SCHEDULESParser.launchDefinition_return)launchDefinition100).period:null)) ;
					 
					}
					break;
				case 2 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:201:4: untilDefinition
					{
					pushFollow(FOLLOW_untilDefinition_in_jobStatement746);
					untilDefinition101=untilDefinition();
					state._fsp--;

					adaptor.addChild(root_0, untilDefinition101.getTree());

					 retval.runTime.setEnd((untilDefinition101!=null?((TWS_SCHEDULESParser.untilDefinition_return)untilDefinition101).endTime:null)) ;
					}
					break;
				case 3 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:202:4: deadlineDefinition
					{
					pushFollow(FOLLOW_deadlineDefinition_in_jobStatement754);
					deadlineDefinition102=deadlineDefinition();
					state._fsp--;

					adaptor.addChild(root_0, deadlineDefinition102.getTree());

					}
					break;
				case 4 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:203:4: ( 'EVERY' NUMBER )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:203:4: ( 'EVERY' NUMBER )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:203:5: 'EVERY' NUMBER
					{
					string_literal103=(Token)match(input,45,FOLLOW_45_in_jobStatement761); 
					string_literal103_tree = (Object)adaptor.create(string_literal103);
					adaptor.addChild(root_0, string_literal103_tree);

					NUMBER104=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_jobStatement763); 
					NUMBER104_tree = (Object)adaptor.create(NUMBER104);
					adaptor.addChild(root_0, NUMBER104_tree);

					}

					}
					break;
				case 5 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:204:4: followsStatement
					{
					pushFollow(FOLLOW_followsStatement_in_jobStatement769);
					followsStatement105=followsStatement();
					state._fsp--;

					adaptor.addChild(root_0, followsStatement105.getTree());

					retval.statement.addFollow((followsStatement105!=null?((TWS_SCHEDULESParser.followsStatement_return)followsStatement105).jobId:null)) ;
					}
					break;
				case 6 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:205:3: 'CONFIRMED'
					{
					string_literal106=(Token)match(input,36,FOLLOW_36_in_jobStatement775); 
					string_literal106_tree = (Object)adaptor.create(string_literal106);
					adaptor.addChild(root_0, string_literal106_tree);

					}
					break;
				case 7 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:206:3: 'CRITICAL'
					{
					string_literal107=(Token)match(input,38,FOLLOW_38_in_jobStatement779); 
					string_literal107_tree = (Object)adaptor.create(string_literal107);
					adaptor.addChild(root_0, string_literal107_tree);

					}
					break;
				case 8 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:207:3: 'KEYJOB'
					{
					string_literal108=(Token)match(input,55,FOLLOW_55_in_jobStatement783); 
					string_literal108_tree = (Object)adaptor.create(string_literal108);
					adaptor.addChild(root_0, string_literal108_tree);

					}
					break;
				case 9 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:208:3: needsStatement
					{
					pushFollow(FOLLOW_needsStatement_in_jobStatement787);
					needsStatement109=needsStatement();
					state._fsp--;

					adaptor.addChild(root_0, needsStatement109.getTree());

					}
					break;
				case 10 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:209:3: priorityDefinition
					{
					pushFollow(FOLLOW_priorityDefinition_in_jobStatement791);
					priorityDefinition110=priorityDefinition();
					state._fsp--;

					adaptor.addChild(root_0, priorityDefinition110.getTree());

					retval.priority =(priorityDefinition110!=null?((TWS_SCHEDULESParser.priorityDefinition_return)priorityDefinition110).priority:null);
					}
					break;
				case 11 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:210:3: opensStatement
					{
					pushFollow(FOLLOW_opensStatement_in_jobStatement797);
					opensStatement111=opensStatement();
					state._fsp--;

					adaptor.addChild(root_0, opensStatement111.getTree());

					}
					break;

				default :
					break loop58;
				}
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
	// $ANTLR end "jobStatement"


	public static class fdOptions_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fdOptions"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:214:2: fdOptions : ( 'FDIGNORE' | 'FDPREV' | 'FDNEXT' );
	public final TWS_SCHEDULESParser.fdOptions_return fdOptions() throws RecognitionException {
		TWS_SCHEDULESParser.fdOptions_return retval = new TWS_SCHEDULESParser.fdOptions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set112=null;

		Object set112_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:214:12: ( 'FDIGNORE' | 'FDPREV' | 'FDNEXT' )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:
			{
			root_0 = (Object)adaptor.nil();


			set112=input.LT(1);
			if ( (input.LA(1) >= 47 && input.LA(1) <= 49) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set112));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "fdOptions"


	public static class groupDate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "groupDate"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:221:2: groupDate : DATE_LITERAL ( ',' DATE_LITERAL )* ;
	public final TWS_SCHEDULESParser.groupDate_return groupDate() throws RecognitionException {
		TWS_SCHEDULESParser.groupDate_return retval = new TWS_SCHEDULESParser.groupDate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DATE_LITERAL113=null;
		Token char_literal114=null;
		Token DATE_LITERAL115=null;

		Object DATE_LITERAL113_tree=null;
		Object char_literal114_tree=null;
		Object DATE_LITERAL115_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:221:12: ( DATE_LITERAL ( ',' DATE_LITERAL )* )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:222:2: DATE_LITERAL ( ',' DATE_LITERAL )*
			{
			root_0 = (Object)adaptor.nil();


			DATE_LITERAL113=(Token)match(input,DATE_LITERAL,FOLLOW_DATE_LITERAL_in_groupDate837); 
			DATE_LITERAL113_tree = (Object)adaptor.create(DATE_LITERAL113);
			adaptor.addChild(root_0, DATE_LITERAL113_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:222:15: ( ',' DATE_LITERAL )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==15) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:222:16: ',' DATE_LITERAL
					{
					char_literal114=(Token)match(input,15,FOLLOW_15_in_groupDate840); 
					char_literal114_tree = (Object)adaptor.create(char_literal114);
					adaptor.addChild(root_0, char_literal114_tree);

					DATE_LITERAL115=(Token)match(input,DATE_LITERAL,FOLLOW_DATE_LITERAL_in_groupDate842); 
					DATE_LITERAL115_tree = (Object)adaptor.create(DATE_LITERAL115);
					adaptor.addChild(root_0, DATE_LITERAL115_tree);

					}
					break;

				default :
					break loop59;
				}
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
	// $ANTLR end "groupDate"


	public static class needsStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "needsStatement"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:226:2: needsStatement : 'NEEDS' ( ( NUMBER )? ID ) ;
	public final TWS_SCHEDULESParser.needsStatement_return needsStatement() throws RecognitionException {
		TWS_SCHEDULESParser.needsStatement_return retval = new TWS_SCHEDULESParser.needsStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal116=null;
		Token NUMBER117=null;
		Token ID118=null;

		Object string_literal116_tree=null;
		Object NUMBER117_tree=null;
		Object ID118_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:226:17: ( 'NEEDS' ( ( NUMBER )? ID ) )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:227:2: 'NEEDS' ( ( NUMBER )? ID )
			{
			root_0 = (Object)adaptor.nil();


			string_literal116=(Token)match(input,59,FOLLOW_59_in_needsStatement859); 
			string_literal116_tree = (Object)adaptor.create(string_literal116);
			adaptor.addChild(root_0, string_literal116_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:227:10: ( ( NUMBER )? ID )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:227:11: ( NUMBER )? ID
			{
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:227:11: ( NUMBER )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==NUMBER) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:227:12: NUMBER
					{
					NUMBER117=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_needsStatement863); 
					NUMBER117_tree = (Object)adaptor.create(NUMBER117);
					adaptor.addChild(root_0, NUMBER117_tree);

					}
					break;

			}

			ID118=(Token)match(input,ID,FOLLOW_ID_in_needsStatement867); 
			ID118_tree = (Object)adaptor.create(ID118);
			adaptor.addChild(root_0, ID118_tree);

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
	// $ANTLR end "needsStatement"


	public static class opensStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "opensStatement"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:231:2: opensStatement : 'OPENS' FILE_NAME ( qualifier )* ;
	public final TWS_SCHEDULESParser.opensStatement_return opensStatement() throws RecognitionException {
		TWS_SCHEDULESParser.opensStatement_return retval = new TWS_SCHEDULESParser.opensStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal119=null;
		Token FILE_NAME120=null;
		ParserRuleReturnScope qualifier121 =null;

		Object string_literal119_tree=null;
		Object FILE_NAME120_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:231:17: ( 'OPENS' FILE_NAME ( qualifier )* )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:232:2: 'OPENS' FILE_NAME ( qualifier )*
			{
			root_0 = (Object)adaptor.nil();


			string_literal119=(Token)match(input,62,FOLLOW_62_in_opensStatement884); 
			string_literal119_tree = (Object)adaptor.create(string_literal119);
			adaptor.addChild(root_0, string_literal119_tree);

			FILE_NAME120=(Token)match(input,FILE_NAME,FOLLOW_FILE_NAME_in_opensStatement887); 
			FILE_NAME120_tree = (Object)adaptor.create(FILE_NAME120);
			adaptor.addChild(root_0, FILE_NAME120_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:232:21: ( qualifier )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==12) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:232:21: qualifier
					{
					pushFollow(FOLLOW_qualifier_in_opensStatement889);
					qualifier121=qualifier();
					state._fsp--;

					adaptor.addChild(root_0, qualifier121.getTree());

					}
					break;

				default :
					break loop61;
				}
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
	// $ANTLR end "opensStatement"


	public static class qualifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qualifier"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:236:2: qualifier : '(' ( '\\'' )? ( ( '-d' '%p' ) | ( ( '/' )? ID ) | ( '-e' '%p' ) | ( '-f' '%p' ) | ( '-r' '%p' ) | ( '-s' '%p' ) | ( '-w' '%p' ) | ( '-a' ) | ( '-o' ) | ( 'ls' | '`ls' | '%p' | '|' | 'wc' | '-w`' | ( ( '-gt' | '-eq' | '-ge' ) NUMBER ) )* ) ( '\\'' )? ')' ;
	public final TWS_SCHEDULESParser.qualifier_return qualifier() throws RecognitionException {
		TWS_SCHEDULESParser.qualifier_return retval = new TWS_SCHEDULESParser.qualifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal122=null;
		Token char_literal123=null;
		Token string_literal124=null;
		Token string_literal125=null;
		Token char_literal126=null;
		Token ID127=null;
		Token string_literal128=null;
		Token string_literal129=null;
		Token string_literal130=null;
		Token string_literal131=null;
		Token string_literal132=null;
		Token string_literal133=null;
		Token string_literal134=null;
		Token string_literal135=null;
		Token string_literal136=null;
		Token string_literal137=null;
		Token string_literal138=null;
		Token string_literal139=null;
		Token string_literal140=null;
		Token string_literal141=null;
		Token string_literal142=null;
		Token char_literal143=null;
		Token string_literal144=null;
		Token string_literal145=null;
		Token set146=null;
		Token NUMBER147=null;
		Token char_literal148=null;
		Token char_literal149=null;

		Object char_literal122_tree=null;
		Object char_literal123_tree=null;
		Object string_literal124_tree=null;
		Object string_literal125_tree=null;
		Object char_literal126_tree=null;
		Object ID127_tree=null;
		Object string_literal128_tree=null;
		Object string_literal129_tree=null;
		Object string_literal130_tree=null;
		Object string_literal131_tree=null;
		Object string_literal132_tree=null;
		Object string_literal133_tree=null;
		Object string_literal134_tree=null;
		Object string_literal135_tree=null;
		Object string_literal136_tree=null;
		Object string_literal137_tree=null;
		Object string_literal138_tree=null;
		Object string_literal139_tree=null;
		Object string_literal140_tree=null;
		Object string_literal141_tree=null;
		Object string_literal142_tree=null;
		Object char_literal143_tree=null;
		Object string_literal144_tree=null;
		Object string_literal145_tree=null;
		Object set146_tree=null;
		Object NUMBER147_tree=null;
		Object char_literal148_tree=null;
		Object char_literal149_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:236:12: ( '(' ( '\\'' )? ( ( '-d' '%p' ) | ( ( '/' )? ID ) | ( '-e' '%p' ) | ( '-f' '%p' ) | ( '-r' '%p' ) | ( '-s' '%p' ) | ( '-w' '%p' ) | ( '-a' ) | ( '-o' ) | ( 'ls' | '`ls' | '%p' | '|' | 'wc' | '-w`' | ( ( '-gt' | '-eq' | '-ge' ) NUMBER ) )* ) ( '\\'' )? ')' )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:238:3: '(' ( '\\'' )? ( ( '-d' '%p' ) | ( ( '/' )? ID ) | ( '-e' '%p' ) | ( '-f' '%p' ) | ( '-r' '%p' ) | ( '-s' '%p' ) | ( '-w' '%p' ) | ( '-a' ) | ( '-o' ) | ( 'ls' | '`ls' | '%p' | '|' | 'wc' | '-w`' | ( ( '-gt' | '-eq' | '-ge' ) NUMBER ) )* ) ( '\\'' )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal122=(Token)match(input,12,FOLLOW_12_in_qualifier909); 
			char_literal122_tree = (Object)adaptor.create(char_literal122);
			adaptor.addChild(root_0, char_literal122_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:238:7: ( '\\'' )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==78) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:238:8: '\\''
					{
					char_literal123=(Token)match(input,78,FOLLOW_78_in_qualifier912); 
					char_literal123_tree = (Object)adaptor.create(char_literal123);
					adaptor.addChild(root_0, char_literal123_tree);

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:238:14: ( ( '-d' '%p' ) | ( ( '/' )? ID ) | ( '-e' '%p' ) | ( '-f' '%p' ) | ( '-r' '%p' ) | ( '-s' '%p' ) | ( '-w' '%p' ) | ( '-a' ) | ( '-o' ) | ( 'ls' | '`ls' | '%p' | '|' | 'wc' | '-w`' | ( ( '-gt' | '-eq' | '-ge' ) NUMBER ) )* )
			int alt65=10;
			switch ( input.LA(1) ) {
			case 20:
				{
				alt65=1;
				}
				break;
			case ID:
			case 31:
				{
				alt65=2;
				}
				break;
			case 21:
				{
				alt65=3;
				}
				break;
			case 23:
				{
				alt65=4;
				}
				break;
			case 27:
				{
				alt65=5;
				}
				break;
			case 28:
				{
				alt65=6;
				}
				break;
			case 29:
				{
				alt65=7;
				}
				break;
			case 19:
				{
				alt65=8;
				}
				break;
			case 26:
				{
				alt65=9;
				}
				break;
			case 11:
			case 13:
			case 22:
			case 24:
			case 25:
			case 30:
			case 78:
			case 79:
			case 80:
			case 82:
			case 83:
				{
				alt65=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:239:3: ( '-d' '%p' )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:239:3: ( '-d' '%p' )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:239:4: '-d' '%p'
					{
					string_literal124=(Token)match(input,20,FOLLOW_20_in_qualifier920); 
					string_literal124_tree = (Object)adaptor.create(string_literal124);
					adaptor.addChild(root_0, string_literal124_tree);

					string_literal125=(Token)match(input,11,FOLLOW_11_in_qualifier922); 
					string_literal125_tree = (Object)adaptor.create(string_literal125);
					adaptor.addChild(root_0, string_literal125_tree);

					}

					}
					break;
				case 2 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:240:4: ( ( '/' )? ID )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:240:4: ( ( '/' )? ID )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:240:5: ( '/' )? ID
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:240:5: ( '/' )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==31) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:240:6: '/'
							{
							char_literal126=(Token)match(input,31,FOLLOW_31_in_qualifier930); 
							char_literal126_tree = (Object)adaptor.create(char_literal126);
							adaptor.addChild(root_0, char_literal126_tree);

							}
							break;

					}

					ID127=(Token)match(input,ID,FOLLOW_ID_in_qualifier933); 
					ID127_tree = (Object)adaptor.create(ID127);
					adaptor.addChild(root_0, ID127_tree);

					}

					}
					break;
				case 3 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:241:5: ( '-e' '%p' )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:241:5: ( '-e' '%p' )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:241:6: '-e' '%p'
					{
					string_literal128=(Token)match(input,21,FOLLOW_21_in_qualifier941); 
					string_literal128_tree = (Object)adaptor.create(string_literal128);
					adaptor.addChild(root_0, string_literal128_tree);

					string_literal129=(Token)match(input,11,FOLLOW_11_in_qualifier943); 
					string_literal129_tree = (Object)adaptor.create(string_literal129);
					adaptor.addChild(root_0, string_literal129_tree);

					}

					}
					break;
				case 4 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:242:5: ( '-f' '%p' )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:242:5: ( '-f' '%p' )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:242:6: '-f' '%p'
					{
					string_literal130=(Token)match(input,23,FOLLOW_23_in_qualifier952); 
					string_literal130_tree = (Object)adaptor.create(string_literal130);
					adaptor.addChild(root_0, string_literal130_tree);

					string_literal131=(Token)match(input,11,FOLLOW_11_in_qualifier954); 
					string_literal131_tree = (Object)adaptor.create(string_literal131);
					adaptor.addChild(root_0, string_literal131_tree);

					}

					}
					break;
				case 5 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:243:5: ( '-r' '%p' )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:243:5: ( '-r' '%p' )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:243:6: '-r' '%p'
					{
					string_literal132=(Token)match(input,27,FOLLOW_27_in_qualifier963); 
					string_literal132_tree = (Object)adaptor.create(string_literal132);
					adaptor.addChild(root_0, string_literal132_tree);

					string_literal133=(Token)match(input,11,FOLLOW_11_in_qualifier965); 
					string_literal133_tree = (Object)adaptor.create(string_literal133);
					adaptor.addChild(root_0, string_literal133_tree);

					}

					}
					break;
				case 6 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:244:5: ( '-s' '%p' )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:244:5: ( '-s' '%p' )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:244:6: '-s' '%p'
					{
					string_literal134=(Token)match(input,28,FOLLOW_28_in_qualifier974); 
					string_literal134_tree = (Object)adaptor.create(string_literal134);
					adaptor.addChild(root_0, string_literal134_tree);

					string_literal135=(Token)match(input,11,FOLLOW_11_in_qualifier976); 
					string_literal135_tree = (Object)adaptor.create(string_literal135);
					adaptor.addChild(root_0, string_literal135_tree);

					}

					}
					break;
				case 7 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:245:5: ( '-w' '%p' )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:245:5: ( '-w' '%p' )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:245:6: '-w' '%p'
					{
					string_literal136=(Token)match(input,29,FOLLOW_29_in_qualifier985); 
					string_literal136_tree = (Object)adaptor.create(string_literal136);
					adaptor.addChild(root_0, string_literal136_tree);

					string_literal137=(Token)match(input,11,FOLLOW_11_in_qualifier987); 
					string_literal137_tree = (Object)adaptor.create(string_literal137);
					adaptor.addChild(root_0, string_literal137_tree);

					}

					}
					break;
				case 8 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:246:5: ( '-a' )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:246:5: ( '-a' )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:246:6: '-a'
					{
					string_literal138=(Token)match(input,19,FOLLOW_19_in_qualifier995); 
					string_literal138_tree = (Object)adaptor.create(string_literal138);
					adaptor.addChild(root_0, string_literal138_tree);

					}

					}
					break;
				case 9 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:247:5: ( '-o' )
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:247:5: ( '-o' )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:247:6: '-o'
					{
					string_literal139=(Token)match(input,26,FOLLOW_26_in_qualifier1003); 
					string_literal139_tree = (Object)adaptor.create(string_literal139);
					adaptor.addChild(root_0, string_literal139_tree);

					}

					}
					break;
				case 10 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:4: ( 'ls' | '`ls' | '%p' | '|' | 'wc' | '-w`' | ( ( '-gt' | '-eq' | '-ge' ) NUMBER ) )*
					{
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:4: ( 'ls' | '`ls' | '%p' | '|' | 'wc' | '-w`' | ( ( '-gt' | '-eq' | '-ge' ) NUMBER ) )*
					loop64:
					while (true) {
						int alt64=8;
						switch ( input.LA(1) ) {
						case 80:
							{
							alt64=1;
							}
							break;
						case 79:
							{
							alt64=2;
							}
							break;
						case 11:
							{
							alt64=3;
							}
							break;
						case 83:
							{
							alt64=4;
							}
							break;
						case 82:
							{
							alt64=5;
							}
							break;
						case 30:
							{
							alt64=6;
							}
							break;
						case 22:
						case 24:
						case 25:
							{
							alt64=7;
							}
							break;
						}
						switch (alt64) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:5: 'ls'
							{
							string_literal140=(Token)match(input,80,FOLLOW_80_in_qualifier1010); 
							string_literal140_tree = (Object)adaptor.create(string_literal140);
							adaptor.addChild(root_0, string_literal140_tree);

							}
							break;
						case 2 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:11: '`ls'
							{
							string_literal141=(Token)match(input,79,FOLLOW_79_in_qualifier1013); 
							string_literal141_tree = (Object)adaptor.create(string_literal141);
							adaptor.addChild(root_0, string_literal141_tree);

							}
							break;
						case 3 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:18: '%p'
							{
							string_literal142=(Token)match(input,11,FOLLOW_11_in_qualifier1016); 
							string_literal142_tree = (Object)adaptor.create(string_literal142);
							adaptor.addChild(root_0, string_literal142_tree);

							}
							break;
						case 4 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:25: '|'
							{
							char_literal143=(Token)match(input,83,FOLLOW_83_in_qualifier1020); 
							char_literal143_tree = (Object)adaptor.create(char_literal143);
							adaptor.addChild(root_0, char_literal143_tree);

							}
							break;
						case 5 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:31: 'wc'
							{
							string_literal144=(Token)match(input,82,FOLLOW_82_in_qualifier1024); 
							string_literal144_tree = (Object)adaptor.create(string_literal144);
							adaptor.addChild(root_0, string_literal144_tree);

							}
							break;
						case 6 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:38: '-w`'
							{
							string_literal145=(Token)match(input,30,FOLLOW_30_in_qualifier1028); 
							string_literal145_tree = (Object)adaptor.create(string_literal145);
							adaptor.addChild(root_0, string_literal145_tree);

							}
							break;
						case 7 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:47: ( ( '-gt' | '-eq' | '-ge' ) NUMBER )
							{
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:47: ( ( '-gt' | '-eq' | '-ge' ) NUMBER )
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:248:48: ( '-gt' | '-eq' | '-ge' ) NUMBER
							{
							set146=input.LT(1);
							if ( input.LA(1)==22||(input.LA(1) >= 24 && input.LA(1) <= 25) ) {
								input.consume();
								adaptor.addChild(root_0, (Object)adaptor.create(set146));
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							NUMBER147=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_qualifier1042); 
							NUMBER147_tree = (Object)adaptor.create(NUMBER147);
							adaptor.addChild(root_0, NUMBER147_tree);

							}

							}
							break;

						default :
							break loop64;
						}
					}

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:251:3: ( '\\'' )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==78) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:251:4: '\\''
					{
					char_literal148=(Token)match(input,78,FOLLOW_78_in_qualifier1057); 
					char_literal148_tree = (Object)adaptor.create(char_literal148);
					adaptor.addChild(root_0, char_literal148_tree);

					}
					break;

			}

			char_literal149=(Token)match(input,13,FOLLOW_13_in_qualifier1063); 
			char_literal149_tree = (Object)adaptor.create(char_literal149);
			adaptor.addChild(root_0, char_literal149_tree);

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
	// $ANTLR end "qualifier"


	public static class launchDefinition_return extends ParserRuleReturnScope {
		public Period period;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "launchDefinition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:256:2: launchDefinition returns [Period period] : ( ( atStatement ) | schedtimeStatement );
	public final TWS_SCHEDULESParser.launchDefinition_return launchDefinition() throws RecognitionException {
		TWS_SCHEDULESParser.launchDefinition_return retval = new TWS_SCHEDULESParser.launchDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope atStatement150 =null;
		ParserRuleReturnScope schedtimeStatement151 =null;


		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:256:43: ( ( atStatement ) | schedtimeStatement )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==33) ) {
				alt67=1;
			}
			else if ( (LA67_0==69) ) {
				alt67=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:257:2: ( atStatement )
					{
					root_0 = (Object)adaptor.nil();


					retval.period = new Period() ;
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:258:2: ( atStatement )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:258:3: atStatement
					{
					pushFollow(FOLLOW_atStatement_in_launchDefinition1087);
					atStatement150=atStatement();
					state._fsp--;

					adaptor.addChild(root_0, atStatement150.getTree());

					retval.period.setBegin((atStatement150!=null?((TWS_SCHEDULESParser.atStatement_return)atStatement150).atTime:null));
					}

					}
					break;
				case 2 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:259:3: schedtimeStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_schedtimeStatement_in_launchDefinition1093);
					schedtimeStatement151=schedtimeStatement();
					state._fsp--;

					adaptor.addChild(root_0, schedtimeStatement151.getTree());

					}
					break;

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
	// $ANTLR end "launchDefinition"


	public static class atStatement_return extends ParserRuleReturnScope {
		public String atTime;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atStatement"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:263:2: atStatement returns [String atTime] : ( 'AT' time= NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? ) ;
	public final TWS_SCHEDULESParser.atStatement_return atStatement() throws RecognitionException {
		TWS_SCHEDULESParser.atStatement_return retval = new TWS_SCHEDULESParser.atStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token time=null;
		Token string_literal152=null;
		Token char_literal154=null;
		Token NUMBER155=null;
		ParserRuleReturnScope timeZoneDefinition153 =null;
		ParserRuleReturnScope day156 =null;

		Object time_tree=null;
		Object string_literal152_tree=null;
		Object char_literal154_tree=null;
		Object NUMBER155_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:263:37: ( ( 'AT' time= NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? ) )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:264:3: ( 'AT' time= NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? )
			{
			root_0 = (Object)adaptor.nil();


			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:264:3: ( 'AT' time= NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:264:4: 'AT' time= NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )?
			{
			string_literal152=(Token)match(input,33,FOLLOW_33_in_atStatement1114); 
			string_literal152_tree = (Object)adaptor.create(string_literal152);
			adaptor.addChild(root_0, string_literal152_tree);

			time=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atStatement1118); 
			time_tree = (Object)adaptor.create(time);
			adaptor.addChild(root_0, time_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:264:21: ( timeZoneDefinition )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==72||LA68_0==81) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:264:21: timeZoneDefinition
					{
					pushFollow(FOLLOW_timeZoneDefinition_in_atStatement1120);
					timeZoneDefinition153=timeZoneDefinition();
					state._fsp--;

					adaptor.addChild(root_0, timeZoneDefinition153.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:264:41: ( '+' NUMBER day )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==14) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:264:42: '+' NUMBER day
					{
					char_literal154=(Token)match(input,14,FOLLOW_14_in_atStatement1124); 
					char_literal154_tree = (Object)adaptor.create(char_literal154);
					adaptor.addChild(root_0, char_literal154_tree);

					NUMBER155=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atStatement1126); 
					NUMBER155_tree = (Object)adaptor.create(NUMBER155);
					adaptor.addChild(root_0, NUMBER155_tree);

					pushFollow(FOLLOW_day_in_atStatement1128);
					day156=day();
					state._fsp--;

					adaptor.addChild(root_0, day156.getTree());

					}
					break;

			}

			}


			  retval.atTime = Launcher.normalizeTime((time!=null?time.getText():null)) ;
			  
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
	// $ANTLR end "atStatement"


	public static class schedtimeStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "schedtimeStatement"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:270:2: schedtimeStatement : ( 'SCHEDTIME' NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? ) ;
	public final TWS_SCHEDULESParser.schedtimeStatement_return schedtimeStatement() throws RecognitionException {
		TWS_SCHEDULESParser.schedtimeStatement_return retval = new TWS_SCHEDULESParser.schedtimeStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal157=null;
		Token NUMBER158=null;
		Token char_literal160=null;
		Token NUMBER161=null;
		ParserRuleReturnScope timeZoneDefinition159 =null;
		ParserRuleReturnScope day162 =null;

		Object string_literal157_tree=null;
		Object NUMBER158_tree=null;
		Object char_literal160_tree=null;
		Object NUMBER161_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:270:21: ( ( 'SCHEDTIME' NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? ) )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:271:2: ( 'SCHEDTIME' NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? )
			{
			root_0 = (Object)adaptor.nil();


			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:271:2: ( 'SCHEDTIME' NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:271:3: 'SCHEDTIME' NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )?
			{
			string_literal157=(Token)match(input,69,FOLLOW_69_in_schedtimeStatement1149); 
			string_literal157_tree = (Object)adaptor.create(string_literal157);
			adaptor.addChild(root_0, string_literal157_tree);

			NUMBER158=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_schedtimeStatement1151); 
			NUMBER158_tree = (Object)adaptor.create(NUMBER158);
			adaptor.addChild(root_0, NUMBER158_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:271:22: ( timeZoneDefinition )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==72||LA70_0==81) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:271:22: timeZoneDefinition
					{
					pushFollow(FOLLOW_timeZoneDefinition_in_schedtimeStatement1153);
					timeZoneDefinition159=timeZoneDefinition();
					state._fsp--;

					adaptor.addChild(root_0, timeZoneDefinition159.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:271:42: ( '+' NUMBER day )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==14) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:271:43: '+' NUMBER day
					{
					char_literal160=(Token)match(input,14,FOLLOW_14_in_schedtimeStatement1157); 
					char_literal160_tree = (Object)adaptor.create(char_literal160);
					adaptor.addChild(root_0, char_literal160_tree);

					NUMBER161=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_schedtimeStatement1159); 
					NUMBER161_tree = (Object)adaptor.create(NUMBER161);
					adaptor.addChild(root_0, NUMBER161_tree);

					pushFollow(FOLLOW_day_in_schedtimeStatement1161);
					day162=day();
					state._fsp--;

					adaptor.addChild(root_0, day162.getTree());

					}
					break;

			}

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
	// $ANTLR end "schedtimeStatement"


	public static class untilDefinition_return extends ParserRuleReturnScope {
		public String endTime;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "untilDefinition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:275:2: untilDefinition returns [String endTime] : 'UNTIL' time= NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? ( 'ONUNTIL' action )? ;
	public final TWS_SCHEDULESParser.untilDefinition_return untilDefinition() throws RecognitionException {
		TWS_SCHEDULESParser.untilDefinition_return retval = new TWS_SCHEDULESParser.untilDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token time=null;
		Token string_literal163=null;
		Token char_literal165=null;
		Token NUMBER166=null;
		Token string_literal168=null;
		ParserRuleReturnScope timeZoneDefinition164 =null;
		ParserRuleReturnScope day167 =null;
		ParserRuleReturnScope action169 =null;

		Object time_tree=null;
		Object string_literal163_tree=null;
		Object char_literal165_tree=null;
		Object NUMBER166_tree=null;
		Object string_literal168_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:275:43: ( 'UNTIL' time= NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? ( 'ONUNTIL' action )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:276:2: 'UNTIL' time= NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? ( 'ONUNTIL' action )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal163=(Token)match(input,74,FOLLOW_74_in_untilDefinition1184); 
			string_literal163_tree = (Object)adaptor.create(string_literal163);
			adaptor.addChild(root_0, string_literal163_tree);

			time=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_untilDefinition1188); 
			time_tree = (Object)adaptor.create(time);
			adaptor.addChild(root_0, time_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:276:23: ( timeZoneDefinition )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==72||LA72_0==81) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:276:23: timeZoneDefinition
					{
					pushFollow(FOLLOW_timeZoneDefinition_in_untilDefinition1191);
					timeZoneDefinition164=timeZoneDefinition();
					state._fsp--;

					adaptor.addChild(root_0, timeZoneDefinition164.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:276:43: ( '+' NUMBER day )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==14) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:276:44: '+' NUMBER day
					{
					char_literal165=(Token)match(input,14,FOLLOW_14_in_untilDefinition1195); 
					char_literal165_tree = (Object)adaptor.create(char_literal165);
					adaptor.addChild(root_0, char_literal165_tree);

					NUMBER166=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_untilDefinition1197); 
					NUMBER166_tree = (Object)adaptor.create(NUMBER166);
					adaptor.addChild(root_0, NUMBER166_tree);

					pushFollow(FOLLOW_day_in_untilDefinition1199);
					day167=day();
					state._fsp--;

					adaptor.addChild(root_0, day167.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:276:61: ( 'ONUNTIL' action )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==61) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:276:62: 'ONUNTIL' action
					{
					string_literal168=(Token)match(input,61,FOLLOW_61_in_untilDefinition1204); 
					string_literal168_tree = (Object)adaptor.create(string_literal168);
					adaptor.addChild(root_0, string_literal168_tree);

					pushFollow(FOLLOW_action_in_untilDefinition1206);
					action169=action();
					state._fsp--;

					adaptor.addChild(root_0, action169.getTree());

					}
					break;

			}

			retval.endTime = Launcher.normalizeTime((time!=null?time.getText():null)) ;
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
	// $ANTLR end "untilDefinition"


	public static class deadlineDefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "deadlineDefinition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:282:3: deadlineDefinition : 'DEADLINE' NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? ;
	public final TWS_SCHEDULESParser.deadlineDefinition_return deadlineDefinition() throws RecognitionException {
		TWS_SCHEDULESParser.deadlineDefinition_return retval = new TWS_SCHEDULESParser.deadlineDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal170=null;
		Token NUMBER171=null;
		Token char_literal173=null;
		Token NUMBER174=null;
		ParserRuleReturnScope timeZoneDefinition172 =null;
		ParserRuleReturnScope day175 =null;

		Object string_literal170_tree=null;
		Object NUMBER171_tree=null;
		Object char_literal173_tree=null;
		Object NUMBER174_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:282:22: ( 'DEADLINE' NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )? )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:283:3: 'DEADLINE' NUMBER ( timeZoneDefinition )? ( '+' NUMBER day )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal170=(Token)match(input,41,FOLLOW_41_in_deadlineDefinition1235); 
			string_literal170_tree = (Object)adaptor.create(string_literal170);
			adaptor.addChild(root_0, string_literal170_tree);

			NUMBER171=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_deadlineDefinition1237); 
			NUMBER171_tree = (Object)adaptor.create(NUMBER171);
			adaptor.addChild(root_0, NUMBER171_tree);

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:283:22: ( timeZoneDefinition )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==72||LA75_0==81) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:283:22: timeZoneDefinition
					{
					pushFollow(FOLLOW_timeZoneDefinition_in_deadlineDefinition1240);
					timeZoneDefinition172=timeZoneDefinition();
					state._fsp--;

					adaptor.addChild(root_0, timeZoneDefinition172.getTree());

					}
					break;

			}

			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:283:42: ( '+' NUMBER day )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==14) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:283:43: '+' NUMBER day
					{
					char_literal173=(Token)match(input,14,FOLLOW_14_in_deadlineDefinition1244); 
					char_literal173_tree = (Object)adaptor.create(char_literal173);
					adaptor.addChild(root_0, char_literal173_tree);

					NUMBER174=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_deadlineDefinition1246); 
					NUMBER174_tree = (Object)adaptor.create(NUMBER174);
					adaptor.addChild(root_0, NUMBER174_tree);

					pushFollow(FOLLOW_day_in_deadlineDefinition1248);
					day175=day();
					state._fsp--;

					adaptor.addChild(root_0, day175.getTree());

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
	// $ANTLR end "deadlineDefinition"


	public static class day_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "day"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:286:2: day : ( 'DAY' | 'DAYS' );
	public final TWS_SCHEDULESParser.day_return day() throws RecognitionException {
		TWS_SCHEDULESParser.day_return retval = new TWS_SCHEDULESParser.day_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set176=null;

		Object set176_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:286:6: ( 'DAY' | 'DAYS' )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:
			{
			root_0 = (Object)adaptor.nil();


			set176=input.LT(1);
			if ( (input.LA(1) >= 39 && input.LA(1) <= 40) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set176));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "day"


	public static class action_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "action"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:292:1: action : ( 'CANC' | 'SUPPR' | 'CONT' );
	public final TWS_SCHEDULESParser.action_return action() throws RecognitionException {
		TWS_SCHEDULESParser.action_return retval = new TWS_SCHEDULESParser.action_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set177=null;

		Object set177_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:292:8: ( 'CANC' | 'SUPPR' | 'CONT' )
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:
			{
			root_0 = (Object)adaptor.nil();


			set177=input.LT(1);
			if ( input.LA(1)==34||input.LA(1)==37||input.LA(1)==71 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set177));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "action"


	public static class timeZoneDefinition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timeZoneDefinition"
	// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:311:1: timeZoneDefinition : ( ( 'tz' ID ) | ( 'TIMEZONE' ( ID ( '/' ID )? ) ) );
	public final TWS_SCHEDULESParser.timeZoneDefinition_return timeZoneDefinition() throws RecognitionException {
		TWS_SCHEDULESParser.timeZoneDefinition_return retval = new TWS_SCHEDULESParser.timeZoneDefinition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal178=null;
		Token ID179=null;
		Token string_literal180=null;
		Token ID181=null;
		Token char_literal182=null;
		Token ID183=null;

		Object string_literal178_tree=null;
		Object ID179_tree=null;
		Object string_literal180_tree=null;
		Object ID181_tree=null;
		Object char_literal182_tree=null;
		Object ID183_tree=null;

		try {
			// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:311:19: ( ( 'tz' ID ) | ( 'TIMEZONE' ( ID ( '/' ID )? ) ) )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==81) ) {
				alt78=1;
			}
			else if ( (LA78_0==72) ) {
				alt78=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:312:2: ( 'tz' ID )
					{
					root_0 = (Object)adaptor.nil();


					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:312:2: ( 'tz' ID )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:312:2: 'tz' ID
					{
					string_literal178=(Token)match(input,81,FOLLOW_81_in_timeZoneDefinition1344); 
					string_literal178_tree = (Object)adaptor.create(string_literal178);
					adaptor.addChild(root_0, string_literal178_tree);

					ID179=(Token)match(input,ID,FOLLOW_ID_in_timeZoneDefinition1346); 
					ID179_tree = (Object)adaptor.create(ID179);
					adaptor.addChild(root_0, ID179_tree);

					}

					}
					break;
				case 2 :
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:313:3: ( 'TIMEZONE' ( ID ( '/' ID )? ) )
					{
					root_0 = (Object)adaptor.nil();


					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:313:3: ( 'TIMEZONE' ( ID ( '/' ID )? ) )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:313:4: 'TIMEZONE' ( ID ( '/' ID )? )
					{
					string_literal180=(Token)match(input,72,FOLLOW_72_in_timeZoneDefinition1353); 
					string_literal180_tree = (Object)adaptor.create(string_literal180);
					adaptor.addChild(root_0, string_literal180_tree);

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:313:15: ( ID ( '/' ID )? )
					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:313:16: ID ( '/' ID )?
					{
					ID181=(Token)match(input,ID,FOLLOW_ID_in_timeZoneDefinition1356); 
					ID181_tree = (Object)adaptor.create(ID181);
					adaptor.addChild(root_0, ID181_tree);

					// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:313:18: ( '/' ID )?
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0==31) ) {
						alt77=1;
					}
					switch (alt77) {
						case 1 :
							// /home/fferchic/workspace_antlr/af.jstech.migration/src/af/jstech/migration/jobstream/TWS_SCHEDULES.g:313:19: '/' ID
							{
							char_literal182=(Token)match(input,31,FOLLOW_31_in_timeZoneDefinition1358); 
							char_literal182_tree = (Object)adaptor.create(char_literal182);
							adaptor.addChild(root_0, char_literal182_tree);

							ID183=(Token)match(input,ID,FOLLOW_ID_in_timeZoneDefinition1359); 
							ID183_tree = (Object)adaptor.create(ID183);
							adaptor.addChild(root_0, ID183_tree);

							}
							break;

					}

					}

					}

					}
					break;

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
	// $ANTLR end "timeZoneDefinition"

	// Delegated rules



	public static final BitSet FOLLOW_scheduleDefinition_in_schedules66 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_scheduleDefinition89 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_scheduleDefinition93 = new BitSet(new long[]{0x5F0C4E0B00000000L,0x0000000000022D21L});
	public static final BitSet FOLLOW_75_in_scheduleDefinition105 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_LITERAL_in_scheduleDefinition107 = new BitSet(new long[]{0x5F0C4E0B00000000L,0x0000000000022521L});
	public static final BitSet FOLLOW_timeZoneDefinition_in_scheduleDefinition115 = new BitSet(new long[]{0x5F0C4E0B00000000L,0x0000000000002421L});
	public static final BitSet FOLLOW_42_in_scheduleDefinition123 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_scheduleDefinition125 = new BitSet(new long[]{0x5F0C4A0B00000000L,0x0000000000002421L});
	public static final BitSet FOLLOW_43_in_scheduleDefinition133 = new BitSet(new long[]{0x5F0C420B00000000L,0x0000000000002421L});
	public static final BitSet FOLLOW_varTableDefinition_in_scheduleDefinition140 = new BitSet(new long[]{0x5F0C420B00000000L,0x0000000000000421L});
	public static final BitSet FOLLOW_freeDaysDefinition_in_scheduleDefinition146 = new BitSet(new long[]{0x5F04420B00000000L,0x0000000000000421L});
	public static final BitSet FOLLOW_onStatement_in_scheduleDefinition152 = new BitSet(new long[]{0x5F04420B00000000L,0x0000000000000421L});
	public static final BitSet FOLLOW_exceptStatement_in_scheduleDefinition158 = new BitSet(new long[]{0x4F04420B00000000L,0x0000000000000421L});
	public static final BitSet FOLLOW_launchDefinition_in_scheduleDefinition164 = new BitSet(new long[]{0x4F04020900000000L,0x0000000000000401L});
	public static final BitSet FOLLOW_untilDefinition_in_scheduleDefinition170 = new BitSet(new long[]{0x4F04020900000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_deadlineDefinition_in_scheduleDefinition176 = new BitSet(new long[]{0x4F04000900000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_35_in_scheduleDefinition182 = new BitSet(new long[]{0x4F04000100000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_matchingStatement_in_scheduleDefinition188 = new BitSet(new long[]{0x4F04000100000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_followsStatement_in_scheduleDefinition194 = new BitSet(new long[]{0x4B04000100000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_56_in_scheduleDefinition201 = new BitSet(new long[]{0x4A00000100000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_57_in_scheduleDefinition209 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_scheduleDefinition212 = new BitSet(new long[]{0x4800000100000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_needsStatement_in_scheduleDefinition219 = new BitSet(new long[]{0x4800000100000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_opensStatement_in_scheduleDefinition225 = new BitSet(new long[]{0x4000000100000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_priorityDefinition_in_scheduleDefinition231 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_scheduleDefinition237 = new BitSet(new long[]{0x0000100000000080L});
	public static final BitSet FOLLOW_jobStatement_in_scheduleDefinition241 = new BitSet(new long[]{0x0000100000000080L});
	public static final BitSet FOLLOW_44_in_scheduleDefinition253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_priorityDefinition272 = new BitSet(new long[]{0x0060000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_priorityDefinition277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_priorityDefinition281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_priorityDefinition284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_varTableDefinition302 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_varTableDefinition304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_freeDaysDefinition317 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_freeDaysDefinition319 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_17_in_freeDaysDefinition322 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_freeDaysDefinition327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_onStatement344 = new BitSet(new long[]{0x00038400000012A2L,0x000000000000380CL});
	public static final BitSet FOLLOW_67_in_onStatement347 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_onStatement349 = new BitSet(new long[]{0x00038400000012A2L,0x0000000000003804L});
	public static final BitSet FOLLOW_75_in_onStatement357 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_LITERAL_in_onStatement359 = new BitSet(new long[]{0x00038400000012A2L,0x0000000000003004L});
	public static final BitSet FOLLOW_76_in_onStatement364 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_LITERAL_in_onStatement366 = new BitSet(new long[]{0x00038400000012A2L,0x0000000000002004L});
	public static final BitSet FOLLOW_42_in_onStatement374 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_onStatement376 = new BitSet(new long[]{0x00038000000012A2L,0x0000000000002004L});
	public static final BitSet FOLLOW_77_in_onStatement384 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_onStatement386 = new BitSet(new long[]{0x00038000000012A2L,0x0000000000000004L});
	public static final BitSet FOLLOW_calendarDefinition_in_onStatement393 = new BitSet(new long[]{0x00038000000012A2L,0x0000000000000004L});
	public static final BitSet FOLLOW_fdOptions_in_onStatement399 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_onStatement406 = new BitSet(new long[]{0x0000020200002000L,0x0000000000000420L});
	public static final BitSet FOLLOW_launchDefinition_in_onStatement409 = new BitSet(new long[]{0x0000020000002000L,0x0000000000000400L});
	public static final BitSet FOLLOW_untilDefinition_in_onStatement415 = new BitSet(new long[]{0x0000020000002000L});
	public static final BitSet FOLLOW_deadlineDefinition_in_onStatement421 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_onStatement427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_exceptStatement447 = new BitSet(new long[]{0x00038400000012A2L,0x000000000000380CL});
	public static final BitSet FOLLOW_67_in_exceptStatement450 = new BitSet(new long[]{0x00038400000012A2L,0x0000000000003804L});
	public static final BitSet FOLLOW_ID_in_exceptStatement454 = new BitSet(new long[]{0x00038400000012A2L,0x0000000000003804L});
	public static final BitSet FOLLOW_75_in_exceptStatement461 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_LITERAL_in_exceptStatement463 = new BitSet(new long[]{0x00038400000012A2L,0x0000000000003004L});
	public static final BitSet FOLLOW_76_in_exceptStatement468 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_LITERAL_in_exceptStatement470 = new BitSet(new long[]{0x00038400000012A2L,0x0000000000002004L});
	public static final BitSet FOLLOW_42_in_exceptStatement478 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_exceptStatement480 = new BitSet(new long[]{0x00038000000012A2L,0x0000000000002004L});
	public static final BitSet FOLLOW_77_in_exceptStatement488 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_exceptStatement490 = new BitSet(new long[]{0x00038000000012A2L,0x0000000000000004L});
	public static final BitSet FOLLOW_calendarDefinition_in_exceptStatement497 = new BitSet(new long[]{0x00038000000012A2L,0x0000000000000004L});
	public static final BitSet FOLLOW_fdOptions_in_exceptStatement503 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_exceptStatement511 = new BitSet(new long[]{0x0000000200002000L,0x0000000000000020L});
	public static final BitSet FOLLOW_launchDefinition_in_exceptStatement516 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_exceptStatement523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_matchingStatement541 = new BitSet(new long[]{0x8010000000000002L,0x0000000000000012L});
	public static final BitSet FOLLOW_followsOrMatchingOptions_in_matchingStatement545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_followsStatement563 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_followsStatement567 = new BitSet(new long[]{0x8010000000000002L,0x0000000000000012L});
	public static final BitSet FOLLOW_followsOrMatchingOptions_in_followsStatement572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_followsOrMatchingOptions587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_followsOrMatchingOptions591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_followsOrMatchingOptions596 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_followsOrMatchingOptions598 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_NUMBER_in_followsOrMatchingOptions607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_followsOrMatchingOptions609 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_NUMBER_in_followsOrMatchingOptions618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_followsOrMatchingOptions624 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_NUMBER_in_followsOrMatchingOptions633 = new BitSet(new long[]{0x0000000000014100L,0x0000000000000200L});
	public static final BitSet FOLLOW_NUMBER_in_followsOrMatchingOptions643 = new BitSet(new long[]{0x0000018000000000L});
	public static final BitSet FOLLOW_day_in_followsOrMatchingOptions645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_followsOrMatchingOptions649 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_NUMBER_in_followsOrMatchingOptions658 = new BitSet(new long[]{0x0000000000014102L});
	public static final BitSet FOLLOW_NUMBER_in_followsOrMatchingOptions668 = new BitSet(new long[]{0x0000018000000000L});
	public static final BitSet FOLLOW_day_in_followsOrMatchingOptions670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_calendarDefinition692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_calendarDefinition697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_calendarDefinition702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_groupDate_in_calendarDefinition707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_jobStatement730 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_launchDefinition_in_jobStatement738 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_untilDefinition_in_jobStatement746 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_deadlineDefinition_in_jobStatement754 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_45_in_jobStatement761 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_jobStatement763 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_followsStatement_in_jobStatement769 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_36_in_jobStatement775 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_38_in_jobStatement779 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_55_in_jobStatement783 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_needsStatement_in_jobStatement787 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_priorityDefinition_in_jobStatement791 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_opensStatement_in_jobStatement797 = new BitSet(new long[]{0x4884225200000002L,0x0000000000000421L});
	public static final BitSet FOLLOW_DATE_LITERAL_in_groupDate837 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_groupDate840 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATE_LITERAL_in_groupDate842 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_59_in_needsStatement859 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_NUMBER_in_needsStatement863 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_needsStatement867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_opensStatement884 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_FILE_NAME_in_opensStatement887 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_qualifier_in_opensStatement889 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_qualifier909 = new BitSet(new long[]{0x00000000FFF82880L,0x00000000000DC000L});
	public static final BitSet FOLLOW_78_in_qualifier912 = new BitSet(new long[]{0x00000000FFF82880L,0x00000000000DC000L});
	public static final BitSet FOLLOW_20_in_qualifier920 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_qualifier922 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_31_in_qualifier930 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_qualifier933 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_21_in_qualifier941 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_qualifier943 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_23_in_qualifier952 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_qualifier954 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_27_in_qualifier963 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_qualifier965 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_28_in_qualifier974 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_qualifier976 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_29_in_qualifier985 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_qualifier987 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_19_in_qualifier995 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_26_in_qualifier1003 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
	public static final BitSet FOLLOW_80_in_qualifier1010 = new BitSet(new long[]{0x0000000043402800L,0x00000000000DC000L});
	public static final BitSet FOLLOW_79_in_qualifier1013 = new BitSet(new long[]{0x0000000043402800L,0x00000000000DC000L});
	public static final BitSet FOLLOW_11_in_qualifier1016 = new BitSet(new long[]{0x0000000043402800L,0x00000000000DC000L});
	public static final BitSet FOLLOW_83_in_qualifier1020 = new BitSet(new long[]{0x0000000043402800L,0x00000000000DC000L});
	public static final BitSet FOLLOW_82_in_qualifier1024 = new BitSet(new long[]{0x0000000043402800L,0x00000000000DC000L});
	public static final BitSet FOLLOW_30_in_qualifier1028 = new BitSet(new long[]{0x0000000043402800L,0x00000000000DC000L});
	public static final BitSet FOLLOW_set_in_qualifier1034 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_qualifier1042 = new BitSet(new long[]{0x0000000043402800L,0x00000000000DC000L});
	public static final BitSet FOLLOW_78_in_qualifier1057 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_qualifier1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atStatement_in_launchDefinition1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schedtimeStatement_in_launchDefinition1093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_atStatement1114 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_atStatement1118 = new BitSet(new long[]{0x0000000000004002L,0x0000000000020100L});
	public static final BitSet FOLLOW_timeZoneDefinition_in_atStatement1120 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_atStatement1124 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_atStatement1126 = new BitSet(new long[]{0x0000018000000000L});
	public static final BitSet FOLLOW_day_in_atStatement1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_schedtimeStatement1149 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_schedtimeStatement1151 = new BitSet(new long[]{0x0000000000004002L,0x0000000000020100L});
	public static final BitSet FOLLOW_timeZoneDefinition_in_schedtimeStatement1153 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_schedtimeStatement1157 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_schedtimeStatement1159 = new BitSet(new long[]{0x0000018000000000L});
	public static final BitSet FOLLOW_day_in_schedtimeStatement1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_untilDefinition1184 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_untilDefinition1188 = new BitSet(new long[]{0x2000000000004002L,0x0000000000020100L});
	public static final BitSet FOLLOW_timeZoneDefinition_in_untilDefinition1191 = new BitSet(new long[]{0x2000000000004002L});
	public static final BitSet FOLLOW_14_in_untilDefinition1195 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_untilDefinition1197 = new BitSet(new long[]{0x0000018000000000L});
	public static final BitSet FOLLOW_day_in_untilDefinition1199 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_61_in_untilDefinition1204 = new BitSet(new long[]{0x0000002400000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_action_in_untilDefinition1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_deadlineDefinition1235 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_deadlineDefinition1237 = new BitSet(new long[]{0x0000000000004002L,0x0000000000020100L});
	public static final BitSet FOLLOW_timeZoneDefinition_in_deadlineDefinition1240 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_deadlineDefinition1244 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_NUMBER_in_deadlineDefinition1246 = new BitSet(new long[]{0x0000018000000000L});
	public static final BitSet FOLLOW_day_in_deadlineDefinition1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_timeZoneDefinition1344 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_timeZoneDefinition1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_timeZoneDefinition1353 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_timeZoneDefinition1356 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_timeZoneDefinition1358 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_timeZoneDefinition1359 = new BitSet(new long[]{0x0000000000000002L});
}
