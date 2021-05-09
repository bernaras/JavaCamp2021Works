package abstracts;

import entities.Campaigns;
import entities.Game;
import entities.Gamer;

public interface SalesService {
 
	void sale(Game game, Gamer gamer, Campaigns campaigns);
	 
}
