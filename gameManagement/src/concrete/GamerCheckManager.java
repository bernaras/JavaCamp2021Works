package concrete;

import abstracts.GamerCheckService;
import entities.Gamer;

public class GamerCheckManager implements GamerCheckService{
	
	
public boolean checkIfRealPerson(Gamer gamer) {
	
	
		if(gamer.getFirstName()=="Berna") {     
			
			System.out.println("Gamer confirmed.");
	
			return true;
	
			
		}else {	
			 
	return false;
		
	
		}
}
}
