
public class User {

	  int id;
	  String userName;
	  String password;
	  String email;
	  
	  public User (int id, String userName, String password, String email) {
		  this.id=id;
		  this.userName=userName;
		  this.password=password;
		  this.email=email;		  
	  }
	  
	  public User() { //constructor
		  
	  }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
