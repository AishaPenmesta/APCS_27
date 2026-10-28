/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Spiderman a=new Spiderman();
Spiderman b = new Spiderman(48);
Spiderman c =new Spiderman("Andrew Garfield",40,"Electro");
Spiderman d = new Spiderman("Tom Holland", 27);

a.setActor("Bob");
a.setAge(1);
a.setVillain("Bill");
b.setActor("Tobey Maguire");
b.setVillain("Green Goblin");
d.setVillain("The Vulture");
System.out.println("Spiderman 1: " + a.getActor()+", "+a.getAge()+", "+ a.getVillain());
System.out.println("Spiderman 2: " + b.getActor()+", "+b.getAge()+", "+ b.getVillain());
System.out.println("Spiderman 3: " + c.getActor()+", "+c.getAge()+", "+ c.getVillain());
System.out.println("Spiderman 4: " + d.getActor()+", "+d.getAge()+", "+ d.getVillain());

		
	}
}
