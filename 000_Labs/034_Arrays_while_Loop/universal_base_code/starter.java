/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] arr = new int [1000];
		int count = 0;
		while(count<arr.length){
			arr[count]=(int)(Math.random()*101);
			System.out.println(arr[count]);
			count++;
		}


		
	}
}
