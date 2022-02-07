package com.oops.AddressBook;

public class AddressBook{
	//Variables
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNo;
	private String email;

	public  String getFirstName() {
		return firstName;
	}

	public  void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public  String getLastName() {
		return lastName;
	}

	public  void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public  String getAddress() {
		return address;
	}

	public  void setAddress(String address) {
		this.address = address;
	}

	public  String getCity() {
		return city;
	}

	public  void setCity(String city) {
		this.city = city;
	}

	public  String getState() {
		return state;
	}

	public  void setState(String state) {
		this.state = state;
	}

	public  String getZip() {
		return zip;
	}

	public  void setZip(String zip) {
		this.zip = zip;
	}

	public  String getPhoneNo() {
		return phoneNo;
	}
	public  void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public  String getEmail() {
		return email;
	}

	public  void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return  ("first Name="+firstName+"  Last Name ="+lastName
				+ "  Address="+address+ "  city="+city+ "  State = "+state+ ""
				+ " zip="+zip+ " phone Number="+phoneNo+ " Email="+email);
	}

	public static void main(String[] args) {
		AddressBook en1= new AddressBook() ;	
		en1.setFirstName("Nikita");
		en1.setLastName("Khapare");
		en1.setAddress("Amravati");
		en1.setCity("Amravati");
		en1.setState("Maharashtra");
		en1.setZip("Amravati");
		en1.setPhoneNo("9075194857");
		en1.setEmail("nikitakhapare@gmail.com");
		System.out.println(en1.toString());
	}
}
