package interitance;

public class SmartTvEx1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		
		stv.channel = 10;
		stv.channelUp();
		System.out.println("현재 채널 " + stv.channel);
		
		stv.power();
		System.out.println("전원 상태 " + stv.power);
		
		stv.displayCaption("Hello world");
		stv.caption = true;
		stv.displayCaption("Hello world");

	}

}
