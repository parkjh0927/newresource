package exam;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Num1 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("Input Num2 : ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.print("Input operator : ");
		String c = sc.nextLine();
		Calc calc = null;
		switch(c) {
		case "+" :
			calc = new Add();
			break;
		case "-" :
			calc = new Sub();
			break;
		case "*" :
			calc = new Mul();
			break;
		case "/" :
			calc = new Div();
			break;
		}
		calc.setValue(a, b);
		System.out.println("결과 "+calc.calculate());
	}

}
