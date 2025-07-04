package dayFive;


//Contained class
public class Address {

	private String street;
	private String city;
	private String state;
	private String postalCode;
	
	//non para constructor
	public Address() 
	{
		super();
	}

	//para constructor
	public Address(String street, String city, String state, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	//getter and setter
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	
	
	
	
	
}