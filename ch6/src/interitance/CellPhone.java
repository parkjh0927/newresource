package interitance;

public class CellPhone {

	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원 on");
	}
	void powerOff() {
		System.out.println("전원 off");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String msg) {
		System.out.println("본인의 메세지");
	}
	void receiveVoice(String msg) {
		System.out.println("상대의 메세지");
	}
	void hangUp() {
		System.out.println("전화를 겁니다.");
	}
}
