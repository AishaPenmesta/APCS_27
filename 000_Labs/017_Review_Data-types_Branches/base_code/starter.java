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
		System.out.println("What is your character's name?");
		String name = sc.nextLine();
		System.out.println("Nice to meet you " + name);
		System.out.println("What is your characters title: (ex. the destroyer or the third)");
		String title = sc.nextLine();
		System.out.println("Nice to meet you "+ name+ " " + title);
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
			System.out.println("You didn't choose Wizard, Warrior, or Rogue you are now a nonentity");
			role = ("nonentity");
		
		} 
		System.out.println("You have several traits to pick from and 20 points to spend....choose wisely");
		System.out.println("The traits are: strength, dexterity, intelligence, charisma(type 'YES' if you want more info, if no press the enter tab)");
		String yes = sc.nextLine();
		boolean YES = yes.equals("YES");
		if(YES){
			System.out.println("Strength - Buff and able to carry larger items");
			System.out.println("Dexterity - Agile and moves quick");
			System.out.println("Intelligence - Better at magic spells");
			System.out.println("Charisma - How personable");
			System.out.println("Now choose your traits!");
		}
		int points = 20;
		System.out.print("Strength (0-10): ");
		int strength = sc.nextInt();
		if((strength>10) || (strength>20)){
			System.out.print("Please input a smaller value. Strength (0-10): ");
			strength = sc.nextInt();
			sc.nextLine();
		}
		points = points - strength;
		System.out.println("You now have "+points+" credits to spend");
		System.out.print("Dexterity (0-10): ");
		int dexterity = sc.nextInt();
		if((dexterity>10) || (points<dexterity)){
			System.out.print("Please input a smaller value. Dexterity (0-10): ");
			dexterity = sc.nextInt();
			sc.nextLine();
		}
		points = points - dexterity;

		System.out.println("You now have "+points+" credits to spend");
		System.out.print("Intelligence (0-10): ");
		int intelligence = sc.nextInt();

		if((intelligence>10) || (points<intelligence)){
			System.out.print("Please input a smaller value. Intelligence (0-10): ");
			intelligence = sc.nextInt();
			sc.nextLine();
		}
		points = points - intelligence;
		System.out.println("You now have "+points+" credits to spend");
		System.out.print("Charisma (0-10): ");
		int charisma = sc.nextInt();

		if((charisma>10) || (points<charisma)){
			System.out.print("Please input a smaller value. Charisma (0-10): ");
			charisma = sc.nextInt();
			sc.nextLine();
		}
		points = points - charisma;
		System.out.println("You have "+points+" credits leftover");
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		System.out.println();
		System.out.println("FINAL STATS:");
		System.out.println("You are "+ name +", the "+title+" of CVHS");
		System.out.println("You're a "+role+ " with the following stats:");
		System.out.println("Strength - "+strength);
		System.out.println("Dexterity - "+dexterity);
		System.out.println("Intelligence - "+intelligence);
		System.out.println("Charisma - "+charisma);
		System.out.println("Good luck on your quest "+name+"!");

	}
}
