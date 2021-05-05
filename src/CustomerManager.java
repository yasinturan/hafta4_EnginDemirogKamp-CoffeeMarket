
public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Eklendi " + customer.name+" "+customer.Surname);
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Silndi " + customer.name+" "+customer.Surname);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Güncellendi " + customer.name+" "+customer.Surname);
	}
	
}
