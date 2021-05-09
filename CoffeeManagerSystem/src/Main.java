import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
 
		BaseCustomerManager	baseManager =new StarbucksCustomerManager(new MernisServiceAdapter());
		baseManager.save(new Customer (1,"Berna","Aras",1990,"52154876304"));
		
	}

}
