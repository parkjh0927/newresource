package ch7;

public class ExceptionEx {

	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException | MemoryException e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();
		}
		
	}
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	private static boolean enoughMemory() {
		return false;
	}
	private static boolean enoughSpace() {
		return false;
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}

}
