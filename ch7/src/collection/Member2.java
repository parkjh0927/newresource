package collection;

public class Member2 {
	String id="";
	String password= "";
	String name="";
	
	public Member2(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPassworkdCheck(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member2 [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	
}
