package interitance;

public class BonusPointAccount extends Account {
	private int bonusPoint;

	public BonusPointAccount(String ano, String owner, int balance, int bonusPoint) {
		super(ano, owner, balance);
		this.bonusPoint = bonusPoint;
	}

	@Override
	public void deposit(int amount) {
		super.deposit(amount);
		bonusPoint+=amount*0.01;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
}
