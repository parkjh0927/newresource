package ch5;

import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		int score[] = {79, 88, 91, 33, 100, 55, 95};
		System.out.println(Arrays.toString(score));
		int max = score[0];
		int min = score[0];
		for (int i = 1;i<score.length;i++) {
			if(max<score[i]) {
				max = score[i];
			}
			if(min>score[i]) {
				min = score[i];
			}
		}
		System.out.printf("최대값은 %d, 최소값은 %d",max,min );
		
	}
}
