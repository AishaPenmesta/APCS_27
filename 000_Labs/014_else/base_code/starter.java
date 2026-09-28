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
		int x = (int)(Math.random()*(1000-1)+1);
		System.out.println("Pick a random number from 1 to 1000: ");
		int y = sc.nextInt();
		sc.nextLine();
		if(x==y){
			System.out.print("Your number was the random number! The number was " + y + "!");
		}
		else{
			System.out.print("Your number wasn't the random number. The number was " + x + "!");
		}

	}
}
