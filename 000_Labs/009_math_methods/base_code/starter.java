/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Math.max(13 - 6 * 11, 30 % 7 * (-2));
		System.out.println("Max1 = " + Math.max(13 - 6 * 11, 30 % 7 * (-2)));
		Math.sqrt(3 * 8 + 31 % 7);
		System.out.println("Square root = " + Math.sqrt(3 * 8 + 31 % 7));
		Math.pow(37 / 3, 35 % 21);
		System.out.println("Power = " + Math.pow(37 / 3, 35 % 21));
		double power = Math.pow(2,14%3);
		double squareroot = Math.sqrt(2*6);
		Math.max(power,squareroot);
		System.out.println("Max2 = " + Math.max(power,squareroot));

		System.out.println("Extra Lab:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a double: ");
		double x = sc.nextDouble();
		System.out.println("Please enter another double: ");
		double y = sc.nextDouble();
		double max = Math.max(x,y);
		double sqrt = Math.sqrt(y);
		double pow = Math.pow(x,y);
		System.out.println(max);
		System.out.println(sqrt);
		System.out.println(power);


		
	}
}
