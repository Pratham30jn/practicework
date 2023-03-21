package NewYear2023;

import java.util.Scanner;

public class RcursionTwoPowern {
	// To find two power n.
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number-:");
	 int n=sc.nextInt();
	 System.out.println(twoPower(n));
}
 private static int twoPower(int n) {
	
	 if(n<1) {
		 return 1;
		 
	 } if (n==1){
		 return 2;
	 }return 2*twoPower(n-1);
 }
 
}
