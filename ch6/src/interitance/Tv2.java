package interitance;

public class Tv2 {
	boolean power;
	int channel;
	
	public Tv2() {
		super();
	}
	
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
