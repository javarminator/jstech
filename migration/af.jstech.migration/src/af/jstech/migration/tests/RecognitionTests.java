package af.jstech.migration.tests;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import af.jstech.migration.job.TWS_JOBSLexer;
import af.jstech.migration.job.TWS_JOBSParser;
import af.jstech.migration.jobstream.TWS_SCHEDULESLexer;
import af.jstech.migration.jobstream.TWS_SCHEDULESParser; 


public class RecognitionTests {
	
	
	
	public static void recognizeSchedule(String file) throws IOException, RecognitionException{
		CharStream charStream = new ANTLRFileStream(file) ;
		TWS_SCHEDULESLexer lexer = new TWS_SCHEDULESLexer(charStream) ;
		TokenStream tokenStream = (TokenStream) new CommonTokenStream(lexer) ;
		TWS_SCHEDULESParser parser = new TWS_SCHEDULESParser((org.antlr.runtime.TokenStream) tokenStream) ;
		
		parser.schedules() ; 
	
	}
	
	
	
	public static void recognizeJobs(String file) throws IOException, RecognitionException{
		CharStream charStream = new ANTLRFileStream(file) ;
		TWS_JOBSLexer lexer = new TWS_JOBSLexer(charStream) ;
		TokenStream tokenStream = (TokenStream) new CommonTokenStream(lexer) ;
		TWS_JOBSParser parser = new TWS_JOBSParser((org.antlr.runtime.TokenStream) tokenStream) ;
		
		parser.jobs() ; 
	
	}
	
	public static void main(String[] args){
		try {
			
			recognizeSchedule(args[0]) ;

		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (RecognitionException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}
