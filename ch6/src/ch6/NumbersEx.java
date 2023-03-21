package ch6;

public class NumbersEx {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5};
		Numbers numbers = new Numbers(num);
		
		System.out.println(numbers.getTotal() + ", " + numbers.getAverage());

	}

}
