package ifelseswitch;

import java.util.Scanner;

public class GreatestOfTwoNumber {
	// Comparing of two numbers.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number a-:");
		int a=sc.nextInt();
		System.out.println("Enter your number b-:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("a is larger");	
		}else if(a==b) {
			System.out.println("Both numbers are equal");
		}
		else System.out.println("b is larger");
		
	}

}
