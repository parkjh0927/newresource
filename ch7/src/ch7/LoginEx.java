package ch7;

import java.util.Scanner;

public class LoginEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.nextLine();
		try {
			login(id,pwd);
		} catch (NotExistIdException | WrongPasswordException e) {
			e.printStackTrace();
		}
	}
	public static void login(String id, String pwd) throws NotExistIdException, WrongPasswordException {
		if(!IdCheck(id)) {
			throw new NotExistIdException("아이디가 틀렸습니다.");
		}else if(!PasswordCheck(pwd)) {
			throw new WrongPasswordException("비밀번호가 틀렸습니다.");
		}
	}
	private static boolean PasswordCheck(String pwd) {
		if(pwd.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	private static boolean IdCheck(String id) {
		if(id.equals("blue")) {
			return true;
		}else {
			return false;
		}
		
	}

}
