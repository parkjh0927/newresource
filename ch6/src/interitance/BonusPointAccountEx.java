package interitance;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		BonusPointAccount bonusPointAccount = new BonusPointAccount("123-321", "홍길동", 100000, 10);
		
		bonusPointAccount.deposit(100000);
		System.out.println("현재 포인트는 "+ bonusPointAccount.getBonusPoint() + "점입니다.");

	}

}
