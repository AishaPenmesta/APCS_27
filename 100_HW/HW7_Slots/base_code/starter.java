/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:"); 
		System.out.println("   1. Each player starts with $100.");
		System.out.println("   2. Input a wager less than your total amount of money.");
		System.out.println("   3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("      a. If two numbers match, you double wagered money.");
		System.out.println("      b. If three numbers match, you triple wagered money.");
		System.out.println("      c. If none match, you lose wagered money.");
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
	
		int value = 100;
		
		while(0==0){
				System.out.println("Would you like to play the slots?(Yes/yes/Y/y) : ");
		String yes = sc.nextLine();
		boolean a = yes.equals("Yes");
		boolean b = yes.equals("yes");
		boolean c = yes.equals("y");
		boolean d = yes.equals("Y");
		boolean e = yes.equals("No");
		boolean f = yes.equals("no");
		boolean g = yes.equals("n");
		boolean h = yes.equals("N");
		int x = (int)(Math.random()*10)+1;
		int y = (int)(Math.random()*10)+1;
		int z = (int)(Math.random()*10)+1;
		if(a||b||c||d){
			System.out.print("You have $" + value +". How much would you like to wager? (ints only) : ");
			int wager = sc.nextInt();
			sc.nextLine();
			if(wager>value){
				System.out.println("You don't have that much money, try again.");
				System.out.println("How much would you like to wager?");
				wager = sc.nextInt();
				sc.nextLine();
			}
			if(wager<=0){
			System.out.println("Sneaky! No negatives or 0!");
			System.out.print("Please enter a greater number: ");
			wager = sc.nextInt();
			sc.nextLine();
			}
			value=value-wager;
			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are:");
			System.out.println("----------------");
			System.out.println("| "+x+" | "+y+" | "+z+" |");
			System.out.println("----------------");
			if((x==y)&&(y==z)){
				System.out.println("You won the big prize! Your wager has now been doubled!");
				value = value+wager*3;
				System.out.println("You now have $"+value);
			}
			else if(((x==y)||(x==z))||((y==x)||(y==z))||((z==x)||(z==y))){
				System.out.println("You won! Your wager has now been doubled!");
				value=value+wager*2;
				System.out.println("You now have $"+value);
			}
			else{
				System.out.println("Didn't win this time, better luck next time!");
				System.out.println("You now have $"+value);
			}
			if(value==0){
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;
			}


		}
		else if(e||f||g||h){
			System.out.println("Sad to see you go! You still have $"+value+" left. Come again soon! Thanks!");
			break;
		}
		}

	}
}
