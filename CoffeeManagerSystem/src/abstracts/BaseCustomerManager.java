package abstracts;

import entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("M��teri veritaban�na kaydedildi."+customer.getFirstName()+" "+customer.getLastName());
	
	}
	
}
