
public class UserManager {
	
public void add(User user) {
	System.out.println(user.userName+" adlý kullanýcý eklendi.");
	
}

public void delete(User user) {
	System.out.println("Kullanýcý silindi.");
}
	
public void update(User user) {	
	System.out.println("Kullanýcý güncellendi.");
}

public void addMultiple(User [] users) {	
	for (User user : users) {
		add(user);
	//	System.out.println(user.userName+" Kullanýcýlar eklendi.");
	}
	
}
}