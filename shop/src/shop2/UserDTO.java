package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//생성자, getter/setter, toString

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class UserDTO {
	public UserDTO() {
		super();
	}
	public UserDTO(int userID, String name, int payNo) {
		super();
		this.userID = userID;
		this.name = name;
		this.payNo = payNo;
	}
	private int userID;
	private String name;
	private int payNo;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPayNo() {
		return payNo;
	}
	public void setPayNo(int payNo) {
		this.payNo = payNo;
	}
		
	
}
