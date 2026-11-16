/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[]arr=new int[20];
		for(int i = 0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*10)+1;
		}
		System.out.println("-------------------------------------------------");
		System.out.println("These are all the random numbers: ");
		for(int a = 0; a<arr.length;a++){
			System.out.print(arr[a]+" ");
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------");
		int ran = (int)(Math.random()*10)+1;
		System.out.println("The random number to look for is "+ ran);
		int count = 0;
		for(int i = 0; i<arr.length;i++){
			if(arr[i]==ran){
				count++;
				if(count>1){
				System.out.println("Duplicate found at index "+ i);
				}
			}

		}
		if(count>1){
			System.out.println("Total number of duplicates for "+ ran+" is "+ (count-1));
		}
		else{
			System.out.println("There are no duplicates of "+ ran);
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Looking for two in a row: ");
		for(int i =0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				System.out.println("Two in a row found at indexes "+i+" and "+ (i+1)+". The number is "+ arr[i]);

			}
		}

	}
}
