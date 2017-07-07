
public class PhoneBookEntry {
	private String firstname;
	private String lastname;
	private String phonenumber;
	
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneNumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public PhoneBookEntry(String firstname,String lastname, String phonenumber) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
	}

}
