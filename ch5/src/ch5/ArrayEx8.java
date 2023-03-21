package ch5;

public class ArrayEx8 {

	public static void main(String[] args) {
			int[] score[] = {
					{1,2,3},
					{4,5,6}
			};
			for(int arr[]:score) {
				for(int j:arr) {
					System.out.print(j + " ");
				}
			}
		
	}
}
