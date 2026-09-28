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
		System.out.println("Please do not enter the same value for x, y, or z");
		System.out.println("Please enter an integer value for x");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter an integer value for y");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter an integer value for z");
		int z = sc.nextInt();
		sc.nextLine();
		if((x > y) && (x > z)) {
			System.out.println("variable x, " + x + " is the largest integer");
		}
		if((y > x) && (y > z)) {
			System.out.println("variable y, "+  y + " is the largest integer");
		}
		if((z > y) && (z > x)) {
			System.out.println("variable z, " + z + " is the largest integer");


		}
		if((x < y) && (x < z)) {
			System.out.println("variable x, " + x + " is the smallest integer");
		}
		if((y < x) && (y < z)) {
			System.out.println("variable y, "+  y + " is the smallest integer");
		}
		if((z < y) && (z < x)) {
			System.out.println("variable z, " + z + " is the smallest integer");

		}



	}
}
