package generics;

class Fruit{
	
}
class FruitBox<T extends Fruit> extends Box3<T>{}

public class GenericsEx4{
	public static void main(String[] args) {
		FuritBox<Fruit> fruitBox = new FruitBox<>();
		FuritBox<Apple> appleBox = new FruitBox<>();
		FuritBox<Grape> grapeBox = new FruitBox<>();

		fruitBox.setItem(new Fruit());
		appleBox.setItem(new Apple());
		
	
	}
}
