package ch6;

public class Person {

	String name;
	float height;
	float weight;
	
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
	public void setName(String name) {
		if(name.equals("")||name==null)
			this.name = "홍길동";
		else 
			this.name = name;
	}
	
	static void print2() {
		Person p = new Person();
		p.setName("");
	}
}
