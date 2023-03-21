package ch6;

public class TimeEx {

	public static void main(String[] args) {
		Time time = new Time();
		
		System.out.println("현재상태");
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		
		time.setHour(16);
		time.setMinute(40);
		time.setSecond(50);
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		

	}

}
