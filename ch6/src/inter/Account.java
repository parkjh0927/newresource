package inter;

public interface Account {
	int x=0,y=0;
	void stop();
	
	static void print() {}
	default void add() {}

}
