package af.jstech.migration;

import java.util.LinkedList;

public class TWSJobStatement {
	
	
	protected String id ; 
	//protected boolean isFirst ; 
	protected LinkedList<String> followsList ;
	
	
	public TWSJobStatement(String id_){
		this.followsList = new LinkedList<String>() ;
		this.id = id_ ;
	}
	
	public void addFollow(String follow){
		this.followsList.add(follow) ;
	}
 
	
	
	//cas spécial dans le cas ou un job doit attendre l'exécution de plusieurs jobs
	public boolean hasMultipleFollows() {
		return this.followsList.size()>1 ;
	}
	
	
	public boolean sameChainFollows(){
		boolean retour = true ;
		if(this.followsList.size()==0){
			
		}else{
			for(String follow : this.followsList){
				if(follow.split("#").length>1){
					retour = false ;
					break ;
				}
			}
		}
		return retour ;
	}
	
	public String toString(){
		String follows ="" ;
		for(String follow:this.followsList)
			follows += "FOLLOWS "+follow+"\n" ; 
			return "ID "+this.id+"\n"+follows+"multiple follows "+this.hasMultipleFollows()+"\n"+"same chain follows :" +this.sameChainFollows() ;
	}
}
