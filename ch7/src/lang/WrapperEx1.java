package lang;

/* 타입
 * 1)기본형 : byte, short ...
 * 2)참조형 : 배열, 클래스, 인터페이스
 * 
 * Wrapper 클래스
 *  - 8개의 기본형을 객체로 다룰 때 사용
 */


public class WrapperEx1 {

	public static void main(String[] args) {
		int a = 3;
		
		// 참조형 : 클래스(인터페이스) 만들어져 있다(메소드를 사용할 수 있다)
		//Integer i = new Integer(3);
		Integer i2 = 3;
		Integer i3 = 3;
		Character ch2 = 'a';
		Byte b2 = 4;
		Float f2 = 4.15f;
		Double de = 4.5;
		Boolean b4 = false;
		Long l2 = 123L;
		
		System.out.println(i2.equals(i3));
		System.out.println(i2 == i3);
		System.out.println("문자형태의 숫자를 정수로 Integer.parseInt()"+Integer.parseInt("10"));
		System.out.println("문자형태의 숫자를 실수로 Double.parseDouble()"+Double.parseDouble("10"));
		
		Integer i4 = a;
		
	}

}
