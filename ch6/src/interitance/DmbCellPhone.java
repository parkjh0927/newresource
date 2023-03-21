package interitance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	void turnOnDmb() {
		powerOn();
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
	}
	void turnOffDmb() {
		powerOff();
	}
}
