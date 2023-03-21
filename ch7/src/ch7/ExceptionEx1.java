package ch7;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	
	}
}
