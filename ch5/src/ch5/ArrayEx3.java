package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {
		int score[] = {100, 90, 85, 78, 92};
		int total=0;
		double avg=0;
		for (int i=0;i<score.length;i++) {
			total+=score[i];
		}
		avg = ((double)total)/score.length;
		System.out.printf("총합은 %d점, 평균은 %.2f점입니다.",total,avg);

	}

}
