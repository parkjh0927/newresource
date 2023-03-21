package ch7;

public class ExceptionEx5 {

	public static void main(String[] args) {
		int arr[]=new int[0];
		try{
			getAverage(arr);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	static double getAverage(int arr[]) throws Exception{
		if(arr.length == 0) {
			throw new Exception("비어있는 배열입니다.");
		}
		return getTotal(arr)/arr.length;
	}
	static int getTotal(int arr[]) {
		int total = 0;
		for (int i = 0; i<arr.length;i++) {
			total += arr[i];
		}
		return total;
	}
}
