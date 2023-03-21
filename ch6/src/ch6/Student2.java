package ch6;

public class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	public Student2(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this(name,ban,no);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	

}
