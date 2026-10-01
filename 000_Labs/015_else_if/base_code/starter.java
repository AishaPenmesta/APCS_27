/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a integer from 1-1000:");
		int y = (int)(Math.random()*(1000)+1);
		int x = sc.nextInt();
		sc.nextLine();
		if(y==x){
			System.out.println("You are not higher or lower than the number!");
		}
		else{if(x<y){
			System.out.println("You guessed lower than the number!");
				
			}
			if(x>y){
				System.out.println("You guessed higher than the number!");
		}

		}
		System.out.println("The number was " + y);
		
	}
}
