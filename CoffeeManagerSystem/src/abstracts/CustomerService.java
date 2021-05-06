package abstracts;

import entities.Customer;

public interface CustomerService {

	void save(Customer customer);
	
	//Ýki firma da müþterileri kaydedecek.
	//Interface bir iþi gerçekleþtirecek tüm sýnýflarýn (nero ve starbucks)
	//ayný metod tanýmlarýný içermesini saðlar.
	
}
