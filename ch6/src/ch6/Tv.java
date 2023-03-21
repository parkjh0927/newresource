package ch6;

public class Tv {
	int channel;
	boolean power;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}	
}
