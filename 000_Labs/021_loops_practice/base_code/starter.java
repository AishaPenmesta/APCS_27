/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the guessing game!");
		int rando = (int)(Math.random()*1001);
		System.out.print("Please guess a number (0-1000): ");
		int guess = sc.nextInt();
		while(rando!=guess){
		if(rando>guess){
			System.out.println("The number is higher");
			System.out.print("Please guess another number: ");
			guess = sc.nextInt();
		}
		else if (rando<guess){
			System.out.println("The number is lower");
			System.out.print("Please guess another number: ");
			guess = sc.nextInt();
		}
		}
		System.out.println("You got the number!");
		
		



		
	}
}
