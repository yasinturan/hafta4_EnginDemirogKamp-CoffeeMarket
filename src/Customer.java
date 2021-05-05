


public class Customer {
	String name;
	String Surname;
	String nationalId;
	int date;
	
	public Customer(String name, String surname, String nationalId, int date) {
		super();
		this.name = name;
		Surname = surname;
		this.nationalId = nationalId;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
}
