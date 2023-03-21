package exam;

import java.util.Scanner;

public class BankApp {
	private static Account[] accountArray = new Account[5];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String arg[]) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------");
			System.out.println("선택 >> ");
			
			int selectNo = scanner.nextInt();
			
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			default:
				break;
			}
		}
	}
	private static void createAccount() {
		for(int i = 0; i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				System.out.print("계좌번호 입력 : ");
				String acNum = scanner.next();
				System.out.print("이름 입력 : ");
				String name = scanner.next();
				System.out.print("금액 입력 : ");
				int money = Integer.parseInt(scanner.next());
				accountArray[i] = new Account(acNum, name, money);
				break;
			}
		}
	}
	private static void accountList() {
		for(int i = 0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				break;
			}
			System.out.printf("%s\t%s\t%d\n",
					accountArray[i].getAno(),
					accountArray[i].getName(),
					accountArray[i].getBalance());
		}
	}
	private static void deposit() {
		System.out.print("계좌번호 입력 : ");
		String ano = scanner.next();
		for(int i = 0;i<accountArray.length;i++) {
			if(ano.equals(accountArray[i].accountNum)) {
				System.out.print("입금하실 금액 입력 : ");
				accountArray[i].money+=Integer.parseInt(scanner.next());
				System.out.println("현재 잔액은 " + accountArray[i].money + "원입니다.");
				break;
			}else if(accountArray[i]==null||i==accountArray.length-1) {
				System.out.println("일치하는 계좌가 없습니다.");
				break;
			}
		}
	}
	private static void withdraw() {
		System.out.print("계좌번호 입력 : ");
		String ano = scanner.next();
		for(int i = 0;i<accountArray.length;i++) {
			if(ano.equals(accountArray[i].accountNum)) {
				System.out.print("출금하실 금액 입력 : ");
				int temp =scanner.nextInt();
				if(accountArray[i].money<temp) {
					System.out.println("잔액이 부족합니다.");
					break;
				}else {
					accountArray[i].money-=temp;
				}
				System.out.println("현재 잔액은 " + accountArray[i].money + "원입니다.");
				break;
			}else if(accountArray[i]==null||i==accountArray.length-1) {
				System.out.println("일치하는 계좌가 없습니다.");
				break;
			}
		}
		
	}

}
