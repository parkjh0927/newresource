package ch6;

public class DataEx2 {

	public static void main(String arg[]) {
		
		Data d = new Data();
		d.x = 10;
		copy(d);
	}
	static Data copy(Data d) {
		Data temp = new Data();
		temp.x = d.x;
		return temp;
	}
}
