/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Fortune Cookie Generator!");
		System.out.println("Press enter to get your Fortune!");
		sc.nextLine();
		int r = (int)(Math.random()*(11-1)+1);
		if(r == 1){
			System.out.print("All things come with patience.");
		}
		if(r == 2){
			System.out.print("Be careful who you trust. Salt and sugar look exactly the same.");
		}
		if(r == 3){
			System.out.print("To forgive others is to create a gateway for your own blessings.");
		}
		if(r == 4){
			System.out.print("Your hard work and dedication will finally pay off in a big way.");
		}
		if(r==5){
			System.out.print("An old acquaintance will soon make a surprising return into your life");
		}
		if(r==6){
			System.out.print("An unexpected gift is currently on its way to you.");
		}
		if(r==7){
			System.out.print("You grabbed the cookie with no fortune.");
		}
		if(r==8){
			System.out.print("Your hard work will pay off soon.");
		}
		if(r==9){
			System.out.print("Every exit is an entrance to new experiences.");
		}
		if(r==10){
			System.out.print("The path ahead is filled with sharp rocks.");
		}
		


		
	}
}
