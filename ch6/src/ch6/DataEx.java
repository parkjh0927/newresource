package ch6;

public class DataEx {

	public static void main(String[] args) {
		Data data = new Data();

		data.x = 10;
		System.out.println("main() : x = "+data.x);
		
		change(data);
		System.out.println("main() : x = "+data.x);
	}
	
	static void change(Data data) {
		data.x = 1000;
		System.out.println("change() : x = "+data.x);
	}

}
