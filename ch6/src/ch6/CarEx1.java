package ch6;

public class CarEx1 {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.company = "현대";
		car.model = "아반떼";
		car.color = "black";
		car.maxSpeed = 200;
		
		car.forward();
		
		System.out.println("제조사 " + car.company);
		System.out.println("모델명 " + car.model);
		System.out.println("생상 " + car.color);
		car.back();

	}

}
