/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?"); 
		String role = sc.nextLine();
		boolean a = role.equals("WIZARD");
		boolean b = role.equals("wizard");
		boolean c = role.equals("Wizard");

		boolean d = role.equals("WARRIOR");
		boolean e = role.equals("warrior");
		boolean f = role.equals("Warrior");

		boolean g = role.equals("Rogue");
		boolean h = role.equals("rogue");
		boolean i = role.equals("ROGUE");

		if((a)||(b)||(c)){
			System.out.println("Wizard is a great choice!");
		}
		else if((d)||(e)||(f)){
			System.out.println("Warrior is a great choice!");
		}
		else if((h)||(i)||(g)){
			System.out.println("Rogue is a great choice!");
		}
		else{ 
			System.out.println("You didn't choose Wizard, Warrior, or Rogue...try again.");
		
		}
		

	}
}
