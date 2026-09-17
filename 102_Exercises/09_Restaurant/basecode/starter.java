/*
 *	Author:  Aisha Penmesta
 *  Date: 09/15/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("Welcome to Bobby's Burgers! What can I get for you today?");
		Scanner sc = new Scanner(System.in);
		System.out.println("First item: ");
		String first_item = sc.nextLine();
		System.out.println("How many would you like?");
		double first_amount = sc.nextDouble();
		System.out.println("How much does it cost per one " + first_item);
		double first_cost = sc.nextDouble();

		System.out.println("Second item: ");
		sc.nextLine();
		String second_item = sc.nextLine();
		System.out.println("How many would you like?");
		double second_amount = sc.nextDouble();
		System.out.println("How much does it cost per one " + second_item);
		double second_cost = sc.nextDouble();

		System.out.println("Third item: ");
		sc.nextLine();
		String third_item = sc.nextLine();
		System.out.println("How many would you like?");
		double third_amount = sc.nextDouble();
		System.out.println("How much does it cost per one " + third_item);
		double third_cost = sc.nextDouble();

		System.out.println("Delicious choices! How much tip would you like to leave?");
		double tip = sc.nextDouble();

		System.out.println("Here's your receipt: ");
		System.out.println("=========================================================================");
		System.out.println("Item                       Qty                Price");
		System.out.println(first_item + "                           " + first_amount + "                 $" + (first_amount*first_cost));
		System.out.println();
		System.out.println(second_item + "                          " + second_amount +"                 $" + (second_amount*second_cost));
		System.out.println();
		System.out.println(third_item + "                           " + third_amount + "                 $" + (third_amount*third_cost));
		double subtotal = first_cost*first_amount + second_cost*second_amount + third_amount*third_cost;
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Subtotal:                       $" + subtotal);
		double tax = 9.75/100*subtotal;
		System.out.println("Tax(9.75%)                      $" + tax);
		System.out.println("Tip percentage:                  " + tip);
		double tip_percent = tip/100*subtotal;
		System.out.println("Tip amount:                     $" + tip_percent);
		System.out.println("=========================================================================");
		System.out.println();
		System.out.println("TOTAL:                          $" + (tip_percent + tax + subtotal));
	





	}
}
