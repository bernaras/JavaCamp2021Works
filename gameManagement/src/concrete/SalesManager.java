package concrete;
 
import abstracts.GamerCheckService;
import abstracts.SalesService;
import entities.Campaigns;
import entities.Game;
import entities.Gamer;

public class SalesManager implements SalesService  {
	 
	
	GamerCheckService gamerCheckService;
		
	public SalesManager(GamerCheckService gamerCheckService) {
	super();
	this.gamerCheckService = gamerCheckService;
	
}
 
	@Override
	public void sale(Game game, Gamer gamer, Campaigns campaigns) {
	   
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			
			System.out.println(game.getName()+
								" game has been sold to "+ 
								gamer.getFirstName()+
								" "+gamer.getLastName()+
								" includes the "+campaigns.getCampaignName()+" campaign.");
			
		}else {
			
			System.out.println(gamer.getFirstName()+" unkown person.");
		 
		}
		
		
		
		
	} 
}
