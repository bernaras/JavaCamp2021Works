package adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap client=new KPSPublicSoapProxy();
		
		boolean result =true;
		
		try { 
	 
		result = client.TCKimlikNoDogrula
				(Long.parseLong(customer.getNationalityId()),
						        customer.getFirstName().toUpperCase(new Locale("tr")),
						        customer.getLastName().toUpperCase(new Locale("tr")),
						        customer.getBirthYear());
		
		}catch(RemoteException e) {
		 
		 e.printStackTrace();
		 
		}
		
		System.out.println();
		
		return result;
		
		}
	
	
}
