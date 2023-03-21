package exam;

public class ColorTvEx {

	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();
		
		IpTv iptv = new IpTv(32,2048,"192.1.1.2");
		iptv.printProperty();
	}

}
