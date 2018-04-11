package chapter6_2;

//Ryan
//Address class for the Address/Student program

public class Address {
	//Instance variables
	private String street;
	private String city;
	private String state;
	private String zip;
	//Constructor
	public Address(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	//toString method
	public String toString(){
		return street+"\n"+city+", "+state+" "+zip;
				
	}
}
