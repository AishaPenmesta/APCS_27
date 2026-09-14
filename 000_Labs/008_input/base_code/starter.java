/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = sc.nextLine();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("What is the month of your birthday?(ex:May)");
		String month = sc.nextLine();
		System.out.println("What's the day of your birthday");
		int birthday_day = sc.nextInt();
		sc.nextLine();
		System.out.println("What's the year of your birthday?");
		int birthday_yr = sc.nextInt();
		sc.nextLine();
		System.out.println("How much money is a buck fifty? (In numbers! ex: 1.0)");
		double buck_fifty = sc.nextDouble();
		sc.nextLine();



	}
}
