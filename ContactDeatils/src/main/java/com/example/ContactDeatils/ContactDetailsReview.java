package com.example.ContactDeatils;

public class ContactDetailsReview {
	public String id;
	public String MSISDN; 
    public String Name;
    public String DOB;
    public String Nationality;
    public String Occupation;
    public String Gender;
    public String Type;
    public String StreetAddress;
    public String PostBox;
    public String EmailAddress;
    public String MobileNumber;
    public String City;
    public String port;
    public String text;
    
	public ContactDetailsReview(String id, String mSISDN, String name, String dOB, String nationality,
			String occupation, String gender, String type, String streetAddress, String postBox, String emailAddress,
			String mobileNumber, String city) {
		super();
		this.id = id;
		MSISDN = mSISDN;
		Name = name;
		DOB = dOB;
		Nationality = nationality;
		Occupation = occupation;
		Gender = gender;
		Type = type;
		StreetAddress = streetAddress;
		PostBox = postBox;
		EmailAddress = emailAddress;
		MobileNumber = mobileNumber;
		City = city;
	}

	public String getId() {
		return id;
	}

	public void setPort(String port2) {
		this.port = port2;
	}
	
	public String getPort() {
		return port;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMSISDN() {
		return MSISDN;
	}

	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getStreetAddress() {
		return StreetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		StreetAddress = streetAddress;
	}

	public String getPostBox() {
		return PostBox;
	}

	public void setPostBox(String postBox) {
		PostBox = postBox;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	
	

}
