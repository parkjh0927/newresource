package ch5;

import java.util.Arrays;

public class ArrayEx6 {

	public static void main(String[] args) {
		int lotto[] = new int[45];
		int num = 0, temp=0;
		for (int i = 0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		for(int i = 0;i<6; i++) {
			num = (int)(Math.random()*45);
			temp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num] = temp;
		}
		for(int i = 0;i<6;i++) {
			System.out.print(lotto[i] + "  ");
		}
		
	}
}
