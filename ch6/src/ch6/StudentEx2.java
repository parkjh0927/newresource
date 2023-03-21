package ch6;

import java.util.Scanner;

public class StudentEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student2 st[] = new Student2[3];
		for(int i = 0; i<st.length; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("반 : ");
			int ban = Integer.parseInt(sc.nextLine());
			System.out.print("번호 : ");
			int no = Integer.parseInt(sc.nextLine());
			System.out.print("국어 : ");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("수학 : ");
			int math = Integer.parseInt(sc.nextLine());
			System.out.print("영어 : ");
			int eng = Integer.parseInt(sc.nextLine());
			st[i] = new Student2(name, ban, no, kor, math ,eng);
		}
		for(Student2 ar : st) {
			System.out.print(ar.name + " ");
			System.out.print(ar.ban + " ");
			System.out.print(ar.no + " ");
			System.out.print(ar.kor + " ");
			System.out.print(ar.math + " ");
			System.out.print(ar.eng + " ");
			System.out.println();
		}
		for(Student2 ar : st) {
			System.out.println(ar);
		}

	}

}
