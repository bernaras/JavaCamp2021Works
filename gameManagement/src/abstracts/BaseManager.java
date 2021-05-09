package abstracts;

import entities.Campaigns;
import entities.Game;
import entities.Gamer;

public class BaseManager implements CampaignService, SalesService, GamerCheckService{

	 
	@Override
	public void sale(Game game, Gamer gamer, Campaigns campaigns) {
		 
		System.out.println(game.getName()+" game has been sold to "+ gamer.getFirstName()+" "+gamer.getLastName()
		+" includes the "+campaigns.getCampaignName()+" campaign");
	}

	@Override
	public void add(Campaigns campaigns) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaigns campaigns) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaigns campaigns) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
