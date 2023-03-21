package collection;

import java.util.Arrays;

/*
 * Arrays 클래스
 * - 배열을 다루는 데 유용한 메서드가 정의되어 있음
 * - 모든 메서드는 static 임
 */



public class ArraysEx1 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		
		int arr2[][] = {{11,12},{21,22}};
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(Arrays.deepToString(arr2));
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int arr3[]=new int[5];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr3));
		
		int arr4[] = Arrays.copyOf(arr3, arr.length);
		System.out.println(Arrays.toString(arr4));
		
		int arr5[] = Arrays.copyOf(arr3, 3);
		
		
		
	}

}
