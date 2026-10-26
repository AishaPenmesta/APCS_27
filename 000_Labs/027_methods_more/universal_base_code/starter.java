/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Aisha ATM!");
		System.out.println("We're going to create a bank account! What info do we know?(input: 1/2/3)");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int infoKnown = sc.nextInt();
		sc.nextLine();

		BankAccount account1 = null;
		if(infoKnown == 1){
			System.out.println("Account successfully created!");
			account1 = new BankAccount();
			account1.displayAccountInfo();
		}
		else if(infoKnown==2){
			System.out.println("What is the name of the owner of this bank account?");
			String owner = sc.nextLine();
			account1 = new BankAccount(owner);
			account1.displayAccountInfo();

		}
		else if(infoKnown==3){
        System.out.println("What is the name of the owner of this bank account?");
			String owner = sc.nextLine();
		System.out.println("How much are you initally depositing into this account? ");
		    double balance = sc.nextDouble();
			sc.nextLine();
			account1 = new BankAccount(owner,balance);
			account1.displayAccountInfo();
		}
		else{
			System.out.println("Account unsuccessfuly created!");
		}
		System.out.println("Would you like to check you account balance?(yes/no)");
        String checkB = sc.nextLine();
		if(checkB.equals("yes")){
		account1.checkBalance();
		}	
		else if(checkB.equals("no")){
			System.out.println("Great, no balance checked!");
		}
		else{
			System.out.println("You don't like listening to instructions...");
		}
		System.out.println("Thank you for coming to the Aisha ATM!");

		
	}
}
