package interitance;

public class CreditLineAccount extends Account{
	private int creditLine;
	
	public CreditLineAccount(String ano, String owner, int balance, int creditLine) {
		super(ano, owner, balance);
		this.creditLine = creditLine;
	}
	
//	@Override
//	public int withdraw(int amount) {
//		if(getBalance()+creditLine<amount) {
//			
//		}
//	}

}
