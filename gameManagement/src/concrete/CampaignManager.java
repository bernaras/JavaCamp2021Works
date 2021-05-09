package concrete;

import abstracts.BaseManager;
import entities.Campaigns;

public class CampaignManager  extends BaseManager {
	 
	
	public void add(Campaigns campaigns) {
		
		System.out.println("Campaing saved.");
		
	}
	
	public void delete(Campaigns campaigns) {
		
		System.out.println("Campaign deleted");
		
	}
	
	public void update(Campaigns campaigns) {
		
		System.out.println("Campaing updated.");
		
	}
	
	
}
