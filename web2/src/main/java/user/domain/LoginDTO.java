package user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor
@Setter @Getter @ToString
public class LoginDTO {
	public LoginDTO() {
		super();
	}
	public LoginDTO(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}
	private String userID;
	private String password;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDTO [userID=" + userID + ", password=" + password + "]";
	}
	
	
	
}
