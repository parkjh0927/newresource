package interitance;

public class CheckingAccount extends Account {

	private String cardNo;
	
	
	
	public CheckingAccount(String ano, String owner, int balance, String cardNo) {
		super(ano, owner, balance);
		this.cardNo = cardNo;
	}
	
	public int pay (String cardNo, int amount) {
		if(cardNo.equals(this.cardNo)) {
			if(getBalance()>=amount) {
				setBalance(getBalance()-amount);
				return getBalance();
			}else {
				System.out.println("잔액이 부족하여 지불할 수 없습니다.");
				return 0;
			}
		}
		return 0;
	}
	public String getcardNo() {
		return cardNo;
	}

}
