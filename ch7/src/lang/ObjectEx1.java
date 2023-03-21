package lang;

public class ObjectEx1 {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		if(obj1.equals(obj2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		System.out.println(obj1 == obj2 ? "같음":"다름");

		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		System.out.println(v1.equals(v2) ? "같음":"다름");
		
		
		Person p1 = new Person(80110581122L);
		Person p2 = new Person(80110581122L);
		System.out.println(p1.equals(p2)?"p1과 p2는 같은 사람":"p1과 p2는 다른 사람");
		
	}

}
