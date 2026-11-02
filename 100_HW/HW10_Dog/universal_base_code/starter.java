/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		String dogName = sc.nextLine();
		Dog dog1 = new Dog(dogName);
		System.out.println("What age should "+ dogName+" be?");
		int dogAge =sc.nextInt();
		sc.nextLine();
		dog1.setAge(dogAge);
		Dog dog2 = new Dog("Bob","German Shepard");
		System.out.println(dog1.getName()+" is a "+ dog1.getBreed()+ " that is "+ dog1.getAge()+ " years old!");
		System.out.println(dog2.getName()+" is a "+ dog2.getBreed()+ "that is "+ dog2.getAge()+ " years old!");
		boolean dog1Bark;
		if(dog1.isSleeping()){
			System.out.println(dog1.getName()+ " is awake! BARK!");
			dog1Bark = true;
		}
		else{
			System.out.println(dog1.getName()+ " is sleeping.");
			dog1Bark = false;
		}
		boolean dog2Sleep = dog2.isSleeping();
		if(dog2Sleep==true){
			if(dog1Bark==true){
				System.out.println(dog2.getName()+ " hears "+ dog1.getName()+"!");
				dog2.bark();
			}
		}
		else{
			if(dog1Bark==true){
				System.out.println(dog2.getName()+" hears "+ dog1.getName()+"!");
				dog2.bark();
			}
		}



	}
}
