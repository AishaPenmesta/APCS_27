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

	}
	public BankAccount(String name, double initialBalance){
		owner = name;
		balance = initialBalance;
		isActive = true;
		accountNumber=nextAccountNumber+1;
	}

	// -------METHODS-------

}