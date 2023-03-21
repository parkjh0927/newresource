package interitance;

public class SubListString extends ListString {

	String name = "성춘향";
	
	@Override
	public void list() {
		super.list();
		System.out.println(name + "하위 클래스 이름");
	}
	
	public void writer() {
		System.out.println("하위 클래스 name 값" + this.name);
		System.out.println("상위 클래스 name 값" + super.name);
		list();
		super.list();
	}
}
