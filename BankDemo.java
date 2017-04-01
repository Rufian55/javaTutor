package tutor;

public class BankDemo {
	public static void main(String args[]) {
		CheckingAcct c = new CheckingAcct(101);
		System.out.println("Depositng $500.00");
		c.deposit(500.00);
		
		try {
			System.out.println("Withdrawing $100.00");
			c.withdraw(100.00);
			System.out.println("withdrawing 401.00");
			c.withdraw(401.00);
		} catch(InsufficientFundsException e) {
			System.out.println("You are short $" + e.getAmount() );
			e.printStackTrace();
		}
	
		System.out.println("Current Balance = " + c.getBalance());
	}
}
