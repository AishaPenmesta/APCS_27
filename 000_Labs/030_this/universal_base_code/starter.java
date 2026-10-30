/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int sameName = 0;
		PooleDwarf Dwarf1 = new PooleDwarf(randName(),10);
        PooleDwarf Dwarf2 = new PooleDwarf(randName(),1);
		PooleDwarf Dwarf3 = new PooleDwarf(randName(),7);
		PooleDwarf Dwarf4 = new PooleDwarf(randName(),100);
		PooleDwarf Dwarf5 = new PooleDwarf(randName(),2);
		PooleDwarf Dwarf6 = new PooleDwarf(randName(),30);
		PooleDwarf Dwarf7= new PooleDwarf(randName(),11);
		
		if(Dwarf1.isSameName(Dwarf2.getName())){
			sameName+=1;
		}
		if(Dwarf1.isSameName(Dwarf3.getName())){
			sameName+=1;
		}
		if(Dwarf1.isSameName(Dwarf4.getName())){
			sameName+=1;
		}
		if(Dwarf1.isSameName(Dwarf5.getName())){
			sameName+=1;
		}
		if(Dwarf1.isSameName(Dwarf6.getName())){
			sameName+=1;
		}
		if(Dwarf1.isSameName(Dwarf7.getName())){
			sameName+=1;
		}
		System.out.println(Dwarf1.getName()+" was the name with "+ sameName+" matches!");

		


		
		
	}
}
