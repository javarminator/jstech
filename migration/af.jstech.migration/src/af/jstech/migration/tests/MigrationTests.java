package af.jstech.migration.tests;

import java.io.IOException;

import org.antlr.runtime.RecognitionException;

import af.jstech.migration.Launcher;

public class MigrationTests {
	
	
	public static void main(String[] args){
		try {
			Launcher.parseJobs(args[0]) ;
			Launcher.setBseDir(args[2]) ;
			Launcher.parseSchedule(args[1]) ;
			Launcher.logger.info(Launcher.successChains+" Created ");
			Launcher.logger.info(Launcher.failedChains+" Skipped ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
