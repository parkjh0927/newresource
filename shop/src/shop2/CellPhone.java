package shop2;

public class CellPhone extends Product{
	
	String carrier;
	
	public CellPhone(String name, int price, String carrier) {
		super(name, price);
		this.carrier = carrier;
	}
	
	//통신사정보 출력
	public void printExtra() {
		System.out.println("통신사 정보 :"+carrier);
	}
	
	
	
}
