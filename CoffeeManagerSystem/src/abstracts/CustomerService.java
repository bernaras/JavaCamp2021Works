package abstracts;

import entities.Customer;

public interface CustomerService {

	void save(Customer customer);
	
	//�ki firma da m��terileri kaydedecek.
	//Interface bir i�i ger�ekle�tirecek t�m s�n�flar�n (nero ve starbucks)
	//ayn� metod tan�mlar�n� i�ermesini sa�lar.
	
}
