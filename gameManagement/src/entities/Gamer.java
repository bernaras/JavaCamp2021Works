package entities;

import abstracts.Entity;


//GAMER    add  delete  update edilecek  --  SATIÞLAR DA 

//GAMER    kimlik doðrulanacak

public class Gamer implements Entity {

	String  nationalityId;
	String firstName;
	String lastName;
	int birthYear;
	
	
	public Gamer(String nationalityId, String firstName, String lastName, int birthYear) {
		super();
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	
	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	 
}
