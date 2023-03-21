package ch6;

public class PysicalInfo {
	String name;
	int age;
	float height;
	float weight;
	public PysicalInfo(String name, int age, float height, float weight) {
		// super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public PysicalInfo(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	public PysicalInfo(float height, float weight) {
		//super();
		this.height = height;
		this.weight = weight;
	}
	

}
