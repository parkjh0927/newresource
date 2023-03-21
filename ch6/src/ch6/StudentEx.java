package ch6;

public class StudentEx {

	public static void main(String[] args) {
		Student stu = new Student("홍길동",1,1,100,60,76);
		
		String msg = stu.info();
		System.out.println(msg);
		//홍길동,1,1,100,60,76,점수합게,평균
	}

}
