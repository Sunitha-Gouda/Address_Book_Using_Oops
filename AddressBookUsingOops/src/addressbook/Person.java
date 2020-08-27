package addressbook;

//pojo class
public class Person {
	public String firstName;
	public String lastName;
	public String city;
	public String state;
	public int zipcode;
	public String phoneNumber;

//Constructor
	public Person(String firstName, String lastName , String city, String state, int zipcode, String phoneNumber) {
		this.firstName = firstName;
		this.lastName=lastName;
		this.city = city;
		this.state = state;
		this.zipcode =zipcode ;
		this.phoneNumber = phoneNumber;
		}


//getter setter methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {  
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//toString method 
	@Override
	public String toString() {
		return " \n\tFirstName: " + firstName + " \n\tLastName: " + lastName + " \n\tCity: " + city + 
				" \n\tState: " + state + "\n\tZipCode: " + zipcode + "\n\tPhoneNumber: " + phoneNumber;
	}

}
