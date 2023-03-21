package abstr;

public class Marine extends Unit{

	void stimPack() {}

	@Override
	void move(int x, int y) {
		System.out.println("Marine[x="+x+", y="+y+"]");
		
	}
	
}

class Tank{
	void move(int x,int y) {}
	void changeMode() {}
}

class DropShip{
	void move(int x,int y) {}
	void load() {}
	void unload() {}
}
