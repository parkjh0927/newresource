package interitance;

public class CheckingTrafficCardAccount extends CheckingAccount {

	private boolean hasTrafficCard;
	
	public CheckingTrafficCardAccount(String ano, String owner, int balance, String cardNo, boolean hasTrafficCard) {
		super(ano, owner, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}
	
	public int payTrafficCard(String cardNo, int amount) {
		if(!hasTrafficCard){
			System.out.println("교통카드 기능이 없습니다.");
			return 0;
		}else if(!cardNo.equals(getcardNo())){
			return 0;
		}else {
			setBalance(getBalance() - amount);
			return getBalance();
		}
	}
}
