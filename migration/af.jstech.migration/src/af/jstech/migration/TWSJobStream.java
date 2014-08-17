package af.jstech.migration;

import java.util.LinkedList;

import af.jstech.migration.jaxb.scheduler.JobChain;
import af.jstech.migration.jaxb.scheduler.JobChain.JobChainNode;

public class TWSJobStream {
	
	
	
	
	public LinkedList<TWSJobStatement> jobStream ;
	public String id ;
	
	public String getChainId(){
		return this.id.split("#")[0] ;
	}
	
	public TWSJobStream (String id_){
		this.id= id_ ;
		this.jobStream= new LinkedList<TWSJobStatement>() ;
	}
	
	public void addJobStatement(TWSJobStatement statement){
		this.jobStream.add(statement) ;
	}
	
	
	public boolean SameChain(){
		boolean retour = true  ;
		String chainId = this.getChainId() ;
		for (TWSJobStatement st : this.jobStream){
			retour = (st.id.split("#").length==1) || (st.id.split("#")[0].equals(chainId));
					if (!retour){
						break ;
					}
		}
		return retour ;
		
	}
	
	
	public JobChain toJobChain(){
		
		JobChain jc = new JobChain() ;
		jc.getJobChainNodeOrFileOrderSinkOrJobChainNodeEnd() ;
		jc.setName(id.split("#")[1]) ;
		for(TWSJobStatement st : this.jobStream){
			JobChainNode state = Launcher.states.get(st.id) ;
			if (state == null){
				Launcher.logger.fatal("no state Matching with "+st.id) ;
			}
			jc.getJobChainNodeOrFileOrderSinkOrJobChainNodeEnd().add(state);
			
		}
		return  jc;
	}
	
	public String toString(){
		return "ID :"+id+"\n Centralized chain : "+SameChain() ;
	}

}
