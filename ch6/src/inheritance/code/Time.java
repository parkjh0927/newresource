package inheritance.code;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(second < 0 || second > 59) return;
		this.second = second;
	}
}
