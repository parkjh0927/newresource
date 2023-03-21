package lang;

import static java.lang.Math.*;

// Math 클래스 : 기본적인 수학계산에 유용한 메서드로 구성
// 생성자가 없음 => new 가 안됨(인스턴스 새성 불가) ==> 모든 메서드, 필드들이 static 임
public class MathEx2 {

	public static void main(String[] args) {
		
		System.out.println(E);
		System.out.println(PI);

		double val = 90.7552;
		System.out.println("round("+val+") = "+round(val));
		System.out.println();
		
		System.out.printf("ceil(%3.1f) = %3.1f\n",1.1, ceil(1.1));
		System.out.printf("floor(%3.1f) = %3.1f\n",1.5, floor(1.5));
		
		System.out.printf("max(%d,%d) = %d",3,5,max(3, 5));
		System.out.printf("min(%d,%d) = %d",3,5,min(3, 5));
	}

}
