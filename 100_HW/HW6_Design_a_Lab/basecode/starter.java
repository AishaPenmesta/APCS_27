/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------CAKE ORDER---------------");
        System.out.println();
        System.out.println("Hello! Who is this birthday cake order for?(birthday person's name)");
        String name = sc.nextLine();
        System.out.println("Nice! What's their age?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("We have 3 cake choices chocolate ($20), vanilla ($15), or red velvet($25)?");
        System.out.println("Which flavor would you like?");
        String flavor = sc.nextLine();
        boolean a = flavor.equals("vanilla");
        boolean b = flavor.equals("VANILLA");
        boolean c = flavor.equals("Vanilla");

        boolean d = flavor.equals("Chocolate");
        boolean e = flavor.equals("CHOCOLATE");
        boolean f = flavor.equals("chocolate");

        boolean g = flavor.equals("Red Velvet");
        boolean h = flavor.equals("RED VELVET");
        boolean i = flavor.equals("red velvet");
        boolean j = flavor.equals("Red velvet");
        int price = 0;

        if ((a)||(b)||(c)){
            System.out.println("Vanilla! A classic, great choice! It's $15");
            price = price + 15;

        }
        else if((d)||(e)||(f)){
            System.out.println("Chocolate! My personal favorite, great choice! It's $20");
            price = price + 20;
        }
        else if((g)||(h)||(i)||(j)){
            System.out.println("Red velvet! A unique flavor, delicious! It's $25");
            price = price + 25;
        }
        else{
            System.out.println("I didn't understand the cake flavor you picked...try again");
         flavor = sc.nextLine();
            boolean aa = flavor.equals("vanilla");
        boolean bb = flavor.equals("VANILLA");
        boolean cc = flavor.equals("Vanilla");

        boolean dd = flavor.equals("Chocolate");
        boolean ee = flavor.equals("CHOCOLATE");
        boolean ff = flavor.equals("chocolate");

        boolean gg = flavor.equals("Red Velvet");
        boolean hh = flavor.equals("RED VELVET");
        boolean ii = flavor.equals("red velvet");
        boolean jj = flavor.equals("Red velvet");
            if ((aa)||(bb)||(cc)){
            System.out.println("Vanilla! A classic, great choice! It's $15");
            price = price + 15;

        }
        else if((dd)||(ee)||(ff)){
            System.out.println("Chocolate! My personal favorite, great choice! It's $20");
            price = price + 20;
        }
        else if((gg)||(hh)||(ii)||(jj)){
            System.out.println("Red velvet! A unique flavor, delicious! It's $25");
            price = price + 25;
        }
        }
        System.out.println("Now choose icing!");
        System.out.println("We have 3 icing choices chocolate ($8), vanilla ($5), or strawberry($10)?");
        System.out.println("Which icing would you like?");
        String icing = sc.nextLine();
        boolean aaa = icing.equals("vanilla");
        boolean bbb = icing.equals("VANILLA");
        boolean ccc = icing.equals("Vanilla");

        boolean ddd = icing.equals("Chocolate");
        boolean eee = icing.equals("CHOCOLATE");
        boolean fff = icing.equals("chocolate");

        boolean hhh = icing.equals("strawberry");
        boolean iii = icing.equals("STRAWBERRY");
        boolean jjj = icing.equals("Strawberry");

        if ((aaa)||(bbb)||(ccc)){
            System.out.println("Vanilla icing! A classic, great choice! It's $5");
            price = price + 5;

        }
        else if((ddd)||(eee)||(fff)){
            System.out.println("Chocolate icing! My personal favorite, great choice! It's $8");
            price = price + 8;
        }
        else if((hhh)||(iii)||(jjj)){
            System.out.println("Strawberry! A unique flavor, delicious! It's $10");
            price = price + 10;
        }
        else{
            System.out.println("I didn't understand the icing flavor you picked...try again.");
            icing = sc.nextLine();
             boolean aaaa = icing.equals("vanilla");
        boolean bbbb = icing.equals("VANILLA");
        boolean cccc = icing.equals("Vanilla");

        boolean dddd = icing.equals("Chocolate");
        boolean eeee = icing.equals("CHOCOLATE");
        boolean ffff = icing.equals("chocolate");

        boolean hhhh = icing.equals("strawberry");
        boolean iiii = icing.equals("STRAWBERRY");
        boolean jjjj = icing.equals("Strawberry");

        if ((aaaa)||(bbbb)||(cccc)){
            System.out.println("Vanilla icing! A classic, great choice! It's $5");
            price = price + 5;

        }
        else if((dddd)||(eee)||(ffff)){
            System.out.println("Chocolate icing! My personal favorite, great choice! It's $8");
            price = price + 8;
        }
        else if((hhhh)||(iiii)||(jjjj)){
            System.out.println("Strawberry! A unique flavor, delicious! It's $10");
            price = price + 10;
        }

        }
        System.out.println("Would you like a topping it costs $10 extra. (input YES if you would like one, if not press enter button)");
        String topper = sc.nextLine();
        boolean z = topper.equals("YES");
        String topping = ("no");
        if(z){
            System.out.println("What topping would you like?");
            topping = sc.nextLine();
            System.out.println("Nice choice! I love "+topping+"! It will be $10");
            price = price+10;
        }
        else{ 
            topping = ("no");
        }
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Final summary of your birthday cake order:");
        System.out.println("Your order was for "+ name +" who is "+ age +" years old.");
        System.out.println("You ordered a "+ flavor +" cake with "+ icing +" icing and "+ topping +" as your topping.");
        System.out.println("Your total comes out to: $"+ price);
        System.out.println("Thank you for choosing our birthday cake bakery for your order! Come again!");
        





    }
}
