package ch7;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			Class.forName("");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행");
		}
		
		try {
			
		} finally {
			
		}

	}

}
