package ch6;

public class Account {
	String accountNo;
	String owner;
	int balance;
	
	public Account() {
		
	}
	
	public Account(String accountNo, String owner, int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	int deposit(int money) {
		balance+=money;
		return balance;
	}
	
	int withdraw(int money) {
		if(balance>=money) {
			balance-=money;
		}else {
			System.out.println("잔액 부족");
		}
		return balance;
	}

}
