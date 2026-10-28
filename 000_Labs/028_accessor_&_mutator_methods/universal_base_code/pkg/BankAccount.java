/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String owner;
	private int accountNumber;
	private double balance;
	private boolean isActive;
	private static int nextAccountNumber = (int)(Math.random()*951)+50;


	// -------CONSTRUCTORS-------
	public BankAccount(){
	owner = "unknown";
	accountNumber = nextAccountNumber;
	balance = 0.0;
	isActive=true;
	}
	public BankAccount(String name){
		owner = name;
		balance = 0;
		isActive = true;
		accountNumber=nextAccountNumber=1;

	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String a){
		owner =a;
	}
	public double getBalance(){
		return balance;
	}
	public void closeAccount(){
		isActive = false;
	}
	public boolean isActive(){
		return isActive;
	}
	public void deposit(double amount){
if(isActive){
	balance+=amount;
}
	}
	public void withdraw(double amount){
		if(isActive&&(balance>=amount)){
			balance-=amount;
		}
	}
	public BankAccount(String name, double initialBalance){
		owner = name;
		balance = initialBalance;
		isActive = true;
		accountNumber=nextAccountNumber+1;
	}
	public void checkBalance(){
		System.out.println("Current Account Balance: $"+balance);
	}
	public void displayAccountInfo(){
		System.out.println("---------------Account Info------------------");
		System.out.println("Owner name: "+ owner);
		System.out.println("Balance: $"+balance);
		if(isActive){
			System.out.println("Status: active");
		}
		System.out.println("Account number: "+accountNumber);
	}

}