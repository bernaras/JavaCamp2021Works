
public class UserManager {
	
public void add(User user) {
	System.out.println(user.userName+" adl� kullan�c� eklendi.");
	
}

public void delete(User user) {
	System.out.println("Kullan�c� silindi.");
}
	
public void update(User user) {	
	System.out.println("Kullan�c� g�ncellendi.");
}

public void addMultiple(User [] users) {	
	for (User user : users) {
		add(user);
	//	System.out.println(user.userName+" Kullan�c�lar eklendi.");
	}
	
}
}