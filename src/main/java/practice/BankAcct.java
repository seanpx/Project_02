package practice;

import main.InputOps;

public class BankAcct {
	private String owner;
	private double balance;
	private double depositAmount = 0.00;

	public void open() {
			System.out.println("Input Account Holder Name: ");
			this.owner = InputOps.getString();
			this.balance = 0.0;
			System.out.println("Account Created under: " + this.owner);
			System.out.println("Balance after Create: " + this.getBalance());
	}
	
	public void deposit() {
			System.out.println("Input Amount you want to deopsit: ");
			this.depositAmount = InputOps.getDouble();
		this.balance = this.balance + this.depositAmount;
		System.out.println("Balance after Deposit: " + this.getBalance());
	}

	
	public void printBalance() {
		System.out.println("Current Account Balance: " + this.getBalance());
	}
	
	public double getBalance() {
		return this.balance;
	}
	

}
