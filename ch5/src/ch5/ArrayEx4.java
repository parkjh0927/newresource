package ch5;

import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		int numArr[] = {0,1,2,3,4,5,6,7,8,9};
		int ran=0;
		int temp=0;
		for (int i = 0;i<100;i++) {
			ran = (int)(Math.random()*10);
			temp = numArr[0];
			numArr[0] = numArr[ran];
			numArr[ran] = temp;
		}
		System.out.println(Arrays.toString(numArr));
		
		
		
	}
}
