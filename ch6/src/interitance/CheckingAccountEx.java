package interitance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("11-11", "홍길동", 100000,"4444-5555");
		
		checkingAccount.pay("3333-5555",50000);
		
		int balance = checkingAccount.pay("4444-5555", 50000);
		System.out.println("사용액 지불 후 잔액 " + balance);

	}

}
