package shop;

public class SmartTv extends Product{
	
	String resolution;
	
	public SmartTv(String name, int price, String resolution) {
		super(name, price);
		this.resolution = resolution;
	}

	
	//해상도정보 출력
	public void printExtra() {
		System.out.println("통신사 정보 :"+resolution);
	}
}
