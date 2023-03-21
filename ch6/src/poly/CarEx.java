package poly;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new FireEngine();		
		Car car2 = new Ambulance();
		
		Car car = null;
		
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2 = null;
		
		fireEngine2 = (FireEngine)car;
		fireEngine2.water();
		
//		FireEngine fe = (FireEngine) new Car();
//		fe.drive();

//		FireEngine fe = new Ambulance();
	}

}
