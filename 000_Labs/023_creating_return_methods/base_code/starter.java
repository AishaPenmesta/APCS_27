/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int x, int y){
		int z = 1;
		int a = 0;
		while(a<y){
			z=z*x;
			a=a+1;
		}
		return z;
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.print("Enter an integer to be your base number: ");
	int x = sc.nextInt();
	System.out.print("Enter an integer to be your exponent: ");
	int y = sc.nextInt();
	System.out.println(pow(x,y));

		
	}
}
