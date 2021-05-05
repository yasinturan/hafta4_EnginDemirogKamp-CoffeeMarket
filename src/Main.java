import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException{
		
		Customer customer1= new Customer("Kenan", "Ünal", "43477085996", 2002);
		Long as=Long.valueOf(customer1.nationalId);
		KPSPublicSoapProxy kullanci=new KPSPublicSoapProxy();
		CustomerService customerService1=new StarbucksManager();
		CustomerCompany customerCompany=new CustomerCompany();		
		Company company1=new Company("1", "Starbucks");
		Company company2=new Company("2", "Nero");
		
		if(kullanci.TCKimlikNoDogrula(as, customer1.getName().toUpperCase(), customer1.getSurname().toUpperCase(), customer1.getDate())) {
			 customerCompany.add(customer1, company2);
		}
		else {
			System.out.println("Girdiğiniz bilgiler yanlış");
		}
		
		
		
	
	}

}
