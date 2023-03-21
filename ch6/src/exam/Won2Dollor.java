package exam;

import java.util.Scanner;

public class Won2Dollor extends Converter {
	private String src;
	private String dest;
	
	public Won2Dollor(String src, String dest) {
		super();
		this.src = src;
		this.dest = dest;
	}
	
	@Override
	public double convert(double src) {
		return src/1200;
	}

	@Override
	public String getSrcString() {
		return src;
	}

	@Override
	public String getdestString() {
		return dest;
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString()+" 을(를) "+ getdestString() + "로 바꿉니다.");
		System.out.print(getSrcString()+" 을(를) 입력하세요 >> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환결과 : " + res +  getdestString() + " 입니다.");
	}
	

}
