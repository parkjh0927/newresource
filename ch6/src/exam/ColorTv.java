package exam;

public class ColorTv extends Tv {
	private int col;

	public ColorTv (int size, int col) {
		super(size);
		this.col = col;
	}
	
	public void printProperty(){
		System.out.println(getSize() + "인치, " + col + "컬러");
	}
	
	public int getCol() {
		return col;
	}
}
