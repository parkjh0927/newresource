package ch6;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account("110-10-10000", "홍길동", 100000);
		
		System.out.println(account.deposit(1000));
		System.out.println(account.withdraw(200000));
		System.out.println(account.withdraw(10000));
		
		
	}

}
