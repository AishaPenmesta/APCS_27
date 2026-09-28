/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println();
		int y = (int)(Math.random()*(3)+1);
		if(y==1){
			System.out.println("It's a planet in our solar system!");

		
		String x = sc.nextLine();

		boolean z = x.equals("Earth");
		boolean a = x.equals("earth");
		boolean b = x.equals("EARTH");
		if((z)||(a)||(b)){
			System.out.println("You guessed correct first try! Great job!");
		}
		else{
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("It's the only one with humans on it!");
		
		x = sc.nextLine();
		z = x.equals("Earth");
		a = x.equals("earth");
		b = x.equals("EARTH");
	
		if((z)||(a)||(b)){
			System.out.println("You guessed it correct second try! Great job!");
		
		}
		else{
			System.out.println("You sadly didn't guess right...");
			System.out.print("You have ran out of trys, better luck next time!");
		}
		}
	}


		if(y==2){
			System.out.println("It's a fruit!");

		
		String x = sc.nextLine();

		boolean z = x.equals("Apple");
		boolean a = x.equals("apple");
		boolean b = x.equals("APPLE");
		if((z)||(a)||(b)){
			System.out.println("You guessed correct first try! Great job!");
		}
		else{
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("It's red!");
		
		x = sc.nextLine();
		z = x.equals("Apple");
		a = x.equals("apple");
		b = x.equals("APPLE");
	
		if((z)||(a)||(b)){
			System.out.println("You guessed it correct second try! Great job!");
		
		}
		else{
			System.out.println("You sadly didn't guess right...");
			System.out.print("You have ran out of trys, better luck next time!");
		}
		}
		}



		if(y==3){
			System.out.println("It's a furry animal!");

		
		String x = sc.nextLine();

		boolean z = x.equals("Cat");
		boolean a = x.equals("cat");
		boolean b = x.equals("CAT");
		if((z)||(a)||(b)){
			System.out.println("You guessed correct first try! Great job!");
		}
		else{
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("It's a feline!");
		
		x = sc.nextLine();
		z = x.equals("Cat");
		a = x.equals("cat");
		b = x.equals("CAT");
	
		if((z)||(a)||(b)){
			System.out.println("You guessed it correct second try! Great job!");
		
		}
		else{
			System.out.println("You sadly didn't guess right...");
			System.out.print("You have ran out of trys, better luck next time!");
		}
		}
		}





	}
}
