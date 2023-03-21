package exam;

public class IpTv extends ColorTv {
	private String address;
	
	
	public IpTv(int size, int col, String address) {
		super(size, col);
		this.address = address;
	}
	
	@Override
	public void printProperty() {
		System.out.println("나의 IpTv는 " + getSize() + "인치, " + getCol() + "컬러, 주소는 " + address + " 입니다");
		
	}
}
