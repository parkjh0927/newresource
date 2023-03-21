package interitance;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance+=amount;
	}
	
	int withdraw(int amount) {
		if(balance<amount) {
			throw new RuntimeException("잔액부족");
		}else {
			return balance-amount;
		}
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
