/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int num){
		if(num<2){
			return false;
		}
		int x =2;
		int y = num;
		while(x<num){
			y = num%x;
			if(y!=0){
				x++;
			}
			else{
				return false;
			}
		}
		return true;
	}
	public static void printPrimes(int input){
		int x=2;
		while(x<=input){
			if(checkPrime(x)){
				System.out.println(x);
			}
			x++;
		}

	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int number = sc.nextInt();
		sc.nextLine();
		printPrimes(number);
	}
}
