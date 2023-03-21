package ch6;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info(){
		int sum = kor+eng+math;
		double avg = (double)sum/3;
		String msg = name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + sum + "," + avg;
		return msg;
	}
}
