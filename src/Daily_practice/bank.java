package Daily_practice;

public class bank {
	
	static int currentBalance=1000;
	
	public static void greetcustomer() {
		System.out.println("Welcome to bank");
		
		
	}
	public void deposit(int amount) {
	
	currentBalance =	currentBalance+amount;
		System.out.println("amount is deposited successfully");
	}
	public static void withdraw(int amount) 
	{
		currentBalance =	currentBalance - amount;
		System.out.println("amount is withdrew successfully");
	}
	public int getcurrentBalance() {
		return currentBalance;
	}
	public static void main(String[] args) {
	
		greetcustomer();
		bank Bank = new bank();
		Bank.deposit(500);
		
		System.out.println("currentBalance is :" + Bank.getcurrentBalance());
			bank.withdraw(300);
			System.out.println("currentBalance is :" + Bank.getcurrentBalance());
	}
	
	
	
	
	
	
	
	

}
