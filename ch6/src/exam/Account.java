package exam;

public class Account {
	String accountNum;
	String name;
	int money;
	
	public Account(String accountNum, String name, int money) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.money = money;
	}
	
	public String getAno() {
		return accountNum;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return money;
	}

}
