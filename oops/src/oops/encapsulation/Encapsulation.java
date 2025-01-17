package oops.encapsulation;

class BankAccount{
	private double balance;
	
	public BankAccount(double initialBalance) {
		if(initialBalance>=0) {
			this.balance=initialBalance;
		}
		else {
			System.out.println("Invalid initial balance.");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited: $"+amount);
		}
		else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount <=balance) {
			balance -= amount;
			System.out.println("Withdrawn: $"+amount);
		}
		else {
			System.out.println("Invalid withdrawal amount or insufficient balance.");
		}
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		BankAccount account=new BankAccount(1000);
		System.out.println("Current Balance: $"+account.getBalance());
		account.deposit(5000);
		System.out.println("Updated Balance: $"+account.getBalance());
		account.withdraw(4000);
		System.out.println("Final Balance: $"+account.getBalance());
	}
}
