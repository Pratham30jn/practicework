
package bitmanipulation;

import java.util.Scanner;

public class GetIthBit {
	// Get Nth bit
	// Answer via two methods.
	public static int getIthBit(int number, int i) {
 		int bitMask=1>>i;
 		if((number & bitMask)==0) {
 			return 0;
 		}
 		return 1;

	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(getIthBit(number, n));
		
		//System.out.println((number>>n-1) & bitMask); 
																																																																																																																	
	
	}
	
}
