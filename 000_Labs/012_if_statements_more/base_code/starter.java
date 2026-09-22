/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		//copied it from lab 11 because i thought it was asking to use scanner there
		Scanner sc = new Scanner(System.in);
		System.out.println("Type an integer value: ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println("Type another integer value: ");
		int y = sc.nextInt();
		sc.nextLine();
		boolean same = x == y;
		if(same) {
			System.out.println("The values are the same!");
		}
		boolean different = x != y;
		if(different){
			System.out.println("The values are different!");
		} 
	}
}
