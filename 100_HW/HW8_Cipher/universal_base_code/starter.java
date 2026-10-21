/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static String encode(String message){
	return Cipher.encode(message);

	}
	public static String keyedEncode(String message, int key){
		return Cipher.keyedEncode(message, key);
	}
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Are you finding a encoding or decoding?(input 1 of 2: encoding/decoding)");
String ans = sc.nextLine();
boolean b = ans.equals("encoding");
boolean c = ans.equals("decoding");
if(c){
System.out.println("Enter the hidden message: ");
String message = sc.nextLine();
System.out.println("Your message: "+ encode(message));
System.out.println("Enter a key: ");
int key = sc.nextInt();
System.out.println(keyedEncode(message, key));
}
if(b){
System.out.println("Input a message to encode!");
String message2 = sc.nextLine();
System.out.println("Does your message use a key? (input 'YES' if you do want to add key)");
String answer = sc.nextLine();
boolean x = answer.equals("YES");
if(x){
	System.out.println("Enter your key: ");
	int key2 = sc.nextInt();
	System.out.println("Your decoded message with a key is: "+ keyedEncode(message2,key2));
}
else{
	System.out.println("Your decoded message is: "+ encode(message2));
}	
}
	}
}
