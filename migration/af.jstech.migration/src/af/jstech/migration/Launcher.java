package af.jstech.migration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import af.jstech.migration.jaxb.scheduler.Job;
import af.jstech.migration.jaxb.scheduler.JobChain;
import af.jstech.migration.jaxb.scheduler.JobChain.JobChainNode;
import af.jstech.migration.jaxb.scheduler.RunTime;
import af.jstech.migration.job.TWS_JOBSLexer;
import af.jstech.migration.job.TWS_JOBSParser;
import af.jstech.migration.jobstream.TWS_SCHEDULESLexer;
import af.jstech.migration.jobstream.TWS_SCHEDULESParser;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.apache.log4j.Logger;


public class Launcher {
	
	
	public static Logger logger = Logger.getLogger(Launcher.class);
	
	private static HashMap<String,Job> jobs ;
	public static HashMap<String,JobChainNode> states ;
	
	private static String baseDir  ="/home/fferchic/Bureau/tws/qvi/";
	
	public static String getBaseDir(){
		return baseDir ;
	}
	
	
	public static Job getJobById(String chainId,String jobId){
		String chekedJobId = checkJobId(chainId, jobId) ;
		return jobs.get(chekedJobId) ;
		
	}
	
	
	
	public static void putJobIntoDir(String chainId,String jobId){
		String chekedJobId = checkJobId(chainId, jobId) ;
		Job job = jobs.get(chekedJobId) ;	
		createApplicationDirectory(chekedJobId) ;
		marshallJob(chekedJobId, job) ;
	}
	
	
	public static String checkJobId(String chainId,String jobId){
		String[] jobIdelem = jobId.split("#") ;

		if (jobIdelem.length==1){
			
			return chainId.split("#")[0]+"#"+jobId ;
			
		}else{
			
		return jobId ;
			
		}
	}
	
	
	public static void marshallJob(String id, Job job){
		//at this level, we are sure thar the job id contains a #
		
		try {
			String[] elems = id.split("#") ;
			File jobFile = new File(baseDir+elems[0]+"/"+elems[1]+".job.xml") ;
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(Job.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			 
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 
			jaxbMarshaller.marshal(job, jobFile);
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
	
	}
	
	
	
	public static void MarshallJobChain(JobChain jc,String app){
		try {
			logger.info("Creating Job Chain "+baseDir+app+"/"+jc.getName()+".job_chain.xml");
			File jobFile = new File(baseDir+app+"/"+jc.getName()+".job_chain.xml") ;
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(JobChain.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			 
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 
			jaxbMarshaller.marshal(jc, jobFile);
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void putChainIntoDirectory(TWSJobStream stream,String app){
		MarshallJobChain(stream.toJobChain(), app) ;
	}
	public static void main(String[] args){
		
		if (args.length <4 ){
			logger.fatal("launch arguments :  jobsFilePath jobSchedulesFilePath calendarFilePath variablesFilePath TargerDirectory" ) ;
		}else{
			baseDir = args[3] ;
		}
		
		
		
		
		
	}
	
	
	public static void setPriority(Job job, String priority){
		if(!priority.equals("") && priority!= null){
			job.getPriority().add(priority) ;
		}
	}
	
	
	
	public static HashMap<String,Job> getJobs()  {
		return jobs ;
	}
	
	
	public static String getApplicationName(String fullName){
		return fullName.split("#")[0] ;
	}
	
	public static void createApplicationDirectory(String fullName){
		String fullPath = baseDir+getApplicationName(fullName) ;
		File file = new File(fullPath) ;
	if(!file.exists()){
		
		logger.info("Creating Directory for Application "+getApplicationName(fullName) );
		
		file.mkdir() ;
		}
	}
	
	public static void parseJobs(String file) throws IOException, RecognitionException{
		CharStream charStream = new ANTLRFileStream(file) ;
		TWS_JOBSLexer lexer = new TWS_JOBSLexer(charStream) ;
		TokenStream tokenStream = (TokenStream) new CommonTokenStream(lexer) ;
		TWS_JOBSParser parser = new TWS_JOBSParser((org.antlr.runtime.TokenStream) tokenStream) ;
		logger.info("Parsing of the jobs contained in "+file) ;
		states = new HashMap<String,JobChainNode>() ;
		jobs = parser.jobs().jobs ; 
		
	
	}
	
	
	public static void parseSchedule(String file) throws IOException, RecognitionException{
		CharStream charStream = new ANTLRFileStream(file) ;
		TWS_SCHEDULESLexer lexer = new TWS_SCHEDULESLexer(charStream) ;
		TokenStream tokenStream = (TokenStream) new CommonTokenStream(lexer) ;
		TWS_SCHEDULESParser parser = new TWS_SCHEDULESParser((org.antlr.runtime.TokenStream) tokenStream) ;
		
		parser.schedules() ; 
	
	}
	
	public static void setBseDir(String dir){
		baseDir = dir ;
	}
	
	public static String getString(String string){
		return string.substring(1, string.length()-1) ;
	}
	
	public static String normalizeDate(String date){
		String[] elements = date.split("/") ;
		return elements[2]+"-"+elements[0]+"-"+elements[1] ;
	}
	
	public static String normalizeTime(String time){
		return time.substring(0, 2)+":"+time.substring(2,4) ;
	}
	
	
	public static int failedChains = 0 ;
	public static int successChains = 0 ;
	
	
	public static void generateJobChain(TWSJobStream stream,String app){
		
		if(stream.SameChain()){
			
			putChainIntoDirectory(stream,app) ;
			successChains++ ;
		}else{
			logger.warn("The Job Chain "+stream.id+" is not centralized , marshalling is impossible for the moment, please contact Michael Koch for further information") ;
			failedChains++ ;
		}
	}
}
