package Encapsulation;

import java.util.Scanner;

public class BankAccount {
	
	private int accountNumber;
	private double balance;
	
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	void Deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit Successful. New Balance: " + balance);
		} else {
			System.out.println("Inavalid Deposit Amount ");
		}
	}
	
	void Withdraw (double amount) {
		if (amount == 0) {
			System.out.println("Enter Invalid Number");
		} else if(amount > 0 && amount <= balance){
			balance = balance-amount;
			System.out.println("Withdraw Successful . New Balance: " + balance);
		}else {
			System.out.println("Invalid Amount ." + balance);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Bank Account Details :");
			
		Scanner sc = new Scanner(System.in);
		
		BankAccount bk = new BankAccount(12,78000.90);
		
			System.out.println("Enter Deposit Amount :");
			
			double bal = sc.nextDouble();
			bk.Deposit(bal);

	        System.out.println("Enter withdraw amount:");
	        		double bal1 = sc.nextDouble();
	        		bk.Withdraw(bal1);
	        System.out.println("Final Balance: " + bk.getBalance());
	}
}

//Encapsulation
//
//Create a BankAccount class with private fields: accountNumber, balance.
//
//Provide public methods: deposit(), withdraw(), and getBalance().
//
//Ensure balance cannot be directly accessed outside the class.
