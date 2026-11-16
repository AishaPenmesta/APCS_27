/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [1001];
		int num = 0;
		while(num < 1001){
			arr[num] = (num+1)*3;
			System.out.println(arr[num]);
			num++;
		}
		int [] arr2 = new int [1001];
		num = 0;
		while(num < 1001){
			arr[num]=1000-num;
			System.out.println(arr[num]);
			num++;
		}
		 
	}
}
