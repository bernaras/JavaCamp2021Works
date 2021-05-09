package adapters;

import abstracts.GamerCheckService;
import entities.Gamer;


public class EdevletCheck implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
 
		return true;
	}
 
	}


