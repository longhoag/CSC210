/*Name: Long Hoang (preferred name: Ryan)
Date: 11/10/2021

Project description: This program is designed to practice object-oriented coding with the purpose of creating a class for a bank account. 
The program simulates the method of creating and using a new bank account: generating a new id for a bank account, accepting deposits, withdrawals, print out the balance on request. 
This program can benefit account managers at banking companies.

Input: the deposit for your account 
Output: 
- account number
- current balance after deposit and withdrawal
- monthly interest rate
- account created date
Comment: - i choose to make user input the amount of deposit they want to put in their bank account
- i generate a random number for account id number from 1000 to 1000000 (to make things more interesting)
- i reformat the date format to make it easier to read and more professional for bank account data
*/


package novfour;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;


public class Hw9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// class to reformat date format 
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Scanner in  = new Scanner(System.in);
		
		// generate random id number for bank account
		Random num = new Random();
		int id = num.nextInt(1000001) + 1000;
		
		// ask input from the user for the deposit they want to put in the account 
		System.out.println("How much do you want to make the deposit for your account?");
		int deposit = in.nextInt();
		
		// use Account class to create a new bank account data with id, deposit amount, default interest rate 
		Account myAcc = new Account(id, deposit, 5.5);
		
		// method to withdraw money from the account
		myAcc.withdraw(1500);
		// method to put money to the account
		myAcc.deposit(2000);
		
		// print out the data 
		System.out.println("Account's ID: " + myAcc.getId());
		System.out.println("Balance: $" + myAcc.getBalance());
		System.out.println("Monthly interest rate: " + myAcc.getMonthlyInterestRate() +"%");
		System.out.println("Created date: " + formatter.format(myAcc.getdate()));
	}

}

class Account {
	
	// private data field 
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	// no-argument constructor that creates a default account
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	// constructor that creates an account with the specified id, initial balance, and default interest rate
	Account(int newId, double newBalance, double newRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newRate;
	}
	
	// accessor for id 
	int getId() {
		return id;
	}
	// accessor for balance 
	double getBalance() {
		return balance;
	}
	// accessor for interest rate 
	double getRate() {
		return annualInterestRate;
	}
	// mutator for id 
	void setId(int name) {
		id = name;
	}
	// mutator for balance 
	void setBalance(double num) {
		balance = num;
	}
	// mutator for interest rate 
	void setRate(double per) {
		annualInterestRate = per;
	}
	// accessor for date 
	Date getdate() {
		return dateCreated;
	}
	// method calculates and returns monthly interest rate
	double getMonthlyInterestRate() {
		return Math.round((annualInterestRate / 12) * 100.0) / 100.0;
	}
	// method withdraws a specified amount from the account.
	double withdraw(double amount) {
		return balance -= amount;
	}
	// method deposits a specified amount to the account.

	double deposit(double amount) {
		return balance += amount;
	}
}