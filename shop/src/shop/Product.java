package shop;

public abstract class Product {
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	private String name;
	private int price;
	
	
	
	public void printDetail() {
		System.out.println("제품명 : "+name);
		System.out.println("가격 : "+price);
	}
	public abstract void printExtra();
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}
