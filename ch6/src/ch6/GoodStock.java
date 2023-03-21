package ch6;

public class GoodStock {
	
	String code;
	int stockNum;
	
	public GoodStock(String code, int stockNum) {
		super();
		this.code = code;
		this.stockNum = stockNum;
	}
	
	void addStock() {
		System.out.println("재고수량 감소");
	}
	
	
	
}
