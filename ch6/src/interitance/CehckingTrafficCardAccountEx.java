package interitance;

public class CehckingTrafficCardAccountEx {

	public static void main(String[] args) {
		CheckingTrafficCardAccount checkingTrafficCardAccount1
		= new CheckingTrafficCardAccount("110-22","성춘향", 1000000, "3333-4444", false);

		CheckingTrafficCardAccount checkingTrafficCardAccount2
		= new CheckingTrafficCardAccount("110-22","홍길동", 1000000, "5555-4444", true);
		
		System.out.println(checkingTrafficCardAccount1.payTrafficCard("3333-4444",25000));
		System.out.println(checkingTrafficCardAccount2.payTrafficCard("5555-4444",50000));
	
	}

}
