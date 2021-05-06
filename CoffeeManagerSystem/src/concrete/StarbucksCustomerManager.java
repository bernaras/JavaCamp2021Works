	package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService=customerCheckService;	
	}
	
	
	@Override
	public void save (Customer customer) {
		
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			
			System.out.println("Müþteri kaydedildi."+customer.getFirstName()+" "+customer.getLastName());
			  
		}else {
			
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" isimli müþteri kaydedilemedi.");
		}
	}
	
}
