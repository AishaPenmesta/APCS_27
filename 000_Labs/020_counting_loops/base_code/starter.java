/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
System.out.print("Hello! What's your name?: ");
String name = sc.nextLine();
System.out.print("How many times should we print your name?");
int amount = sc.nextInt();
sc.nextLine();
int x = 0;
while(x<amount){
	System.out.println(name);
	x=x+1;
}


		
	}
}
