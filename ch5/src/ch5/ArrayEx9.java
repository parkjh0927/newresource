package ch5;

public class ArrayEx9 {

	public static void main(String[] args) {
		int score[][] = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50},
		};
		int cal[][] = new int[score.length][2];
		int sum = 0, avg = 0;
		 
		for(int i = 0;i<score.length;i++) {
			for(int j = 0;j<score[0].length;j++) {
				sum+=score[i][j];
			}
			avg = sum/score[0].length;
			cal[i][0]=sum;
			cal[i][1]=avg;
			sum=0;
			avg=0;
		}
		System.out.printf("번호 국어 영어 수학 총점 평균\n");
		for(int i = 0;i<score.length;i++) {
			System.out.printf("%4d",i+1);
			for(int j = 0;j<score[0].length;j++) {
				System.out.printf("%4d",score[i][j]);
			}
			for(int j = 0;j<2;j++) {
				System.out.printf("%4d",cal[i][j]);
			}
			System.out.println();
		}
	
	}
}
