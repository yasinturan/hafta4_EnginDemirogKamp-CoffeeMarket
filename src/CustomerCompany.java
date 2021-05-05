
public class CustomerCompany implements CustomerCompanyManager{

	@Override
	public void add(Customer customer, Company company) {
		// TODO Auto-generated method stub
		System.out.println(customer.name+" "+company.name+" eklendi");
	}

}
