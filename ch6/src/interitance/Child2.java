package interitance;

public class Child2 extends Parent2 {
	String field2;
	
	@Override
	public void method2() {
		System.out.println("Child-method2()");
		super.method2();
	}
	
	public void method3() {
		System.out.println("Child-method3");
	}

}
