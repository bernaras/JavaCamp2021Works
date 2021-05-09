import abstracts.GamerCheckService;
import concrete.CampaignManager;
import concrete.GamerCheckManager;
import concrete.GamerManager;
import concrete.SalesManager;
import entities.Campaigns;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
 
		Gamer gamer=new Gamer("254631458759","Berna", "Aras", 1990);
	   
		GamerManager gamerManager= new GamerManager();
	    gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		gamerManager.checkIfRealPerson(gamer);
		
	 
		Campaigns campaigns=new Campaigns(1,"Happy World Day", 15);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaigns);
		
		
		Game game=new Game("Find Pale Blue Dot", 100);
		
		
		SalesManager salesManager =new SalesManager(new GamerCheckManager()) {
			
		
			
		};
		salesManager.sale(game, gamer, campaigns);
 		
		
		GamerCheckManager gamerCheckManager=new GamerCheckManager();
		gamerCheckManager.checkIfRealPerson(gamer); //gamer checked
		
		
		
		
		
		
	}

}
