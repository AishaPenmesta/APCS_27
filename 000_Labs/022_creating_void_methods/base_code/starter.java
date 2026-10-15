/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void toString(String word){
	System.out.println(word);
	}

	public static void toStringCombined(String a, String b){
	System.out.println(a+" "+b);
		// Your code goes below here
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a scentence!");
		String word1 = sc.nextLine();
		System.out.println("Write another scentence!");
		String word2 = sc.nextLine();
		System.out.println();
		System.out.println("This is using the methods!: ");
		toString(word1);
		toStringCombined(word1,word2);
	}
	
}
