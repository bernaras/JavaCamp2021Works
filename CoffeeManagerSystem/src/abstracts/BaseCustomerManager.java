package abstracts;

import entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Müþteri veritabanýna kaydedildi."+customer.getFirstName()+" "+customer.getLastName());
	
	}
	
}
