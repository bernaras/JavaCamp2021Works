package entities;

import abstracts.Entity;

//CAMPAIGN add delete update olacak GAMER gibi


public class Campaigns implements Entity{

	int id;
	String campaignName;
	int discount;
	
	
	public Campaigns(int id, String campaignName, int discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	
}
