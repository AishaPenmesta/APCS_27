/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number:");
		System.out.println("Please enter an integer: ");
		int one = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first): ");
		int two = sc.nextInt();
		System.out.println("Your range is " + one + "to" + two);
		System.out.println("Here are five numbers generated in that range,");
		System.out.println((int)(Math.random() * (two-one)+one) +","+(int)(Math.random() * (two-one)+one) +","+(int)(Math.random() * (two-one)+one) +","+(int)(Math.random() * (two-one)+one) +","+(int)(Math.random() * (two-one)+one));

	}
}
