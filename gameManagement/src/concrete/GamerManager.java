package concrete;

import abstracts.BaseManager;
import abstracts.GamerCheckService;
import entities.Gamer;

public class GamerManager extends BaseManager {

 	
	GamerCheckService gamerCheckService;
	
	public void GamerCheckService(GamerCheckService gamerCheckService) {
		
		this.gamerCheckService=gamerCheckService;
	
	}
	
	
 	public  void  add(Gamer gamer) {
		
		System.out.println("Gamer saved.");
		
	}
	
    public void delete(Gamer gamer) {
		
		System.out.println("Gamer deleted.");
		
	}

     public void update(Gamer gamer) {
	
	    System.out.println("Gamer updated.");
	
}
	
}
