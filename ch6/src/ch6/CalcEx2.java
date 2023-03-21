package ch6;

public class CalcEx2 {

	public static void main(String[] args) {
		Calc2 calc = new Calc2();
		
		System.out.println(calc.add(5,3));
		
		System.out.println(calc.add(5,3L));
		
		System.out.println(calc.add(5L,3));
		
		System.out.println(calc.add(5,3.0f));
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(calc.add(arr));
	}

}
