package ch6;

public class Member {
	String id;
	String password;
	String confirmpassword;
	String phonenumber;
	String address;

	
	public Member(String id, String password, String confirmpassword, String phonenumber) {
		super();
		this.id = id;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.phonenumber = phonenumber;
		address = "empty";
	}
	
	public Member(String id, String password, String confirmpassword, String phonenumber, String address) {
		this(id,password,confirmpassword, phonenumber);
		this.address = address;
	}

	boolean passwordAndConfirmPasswordEquals() {
		return password.equals(confirmpassword);
	}
	



	

}
