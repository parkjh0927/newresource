package ch5;

import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		String words[][]= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		Scanner sc = new Scanner(System.in);
		String ans = "";
		for (int i = 0; i<words.length; i++) {
			System.out.printf("Q%d) %s 의 뜻은? ", i+1, words[i][0]);
			ans = sc.nextLine();
			if(ans.equals(words[i][1])) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
				System.out.println("정답은 " + words[i][1] + "입니다.");
			}
		}
		
	}
}
