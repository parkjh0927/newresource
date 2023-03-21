package ch5;

public class ArrayEx2 {
	public static void main(String[] args) {
		int score[] = new int[5];
		
		for(int i=0;i<score.length;i++) {
			score[i] = i+10;
		}
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		int ran[] = new int [10];
		for(int i = 0; i<ran.length;i++) {
			ran[i] = (int)(Math.random()*10) + 1;
		}
		for(int i = 0; i<ran.length;i++) {
			System.out.print(ran[i]+ "  ");
		}
		
	}

}
