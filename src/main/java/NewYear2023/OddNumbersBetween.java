package NewYear2023;

import java.util.Scanner;

public class OddNumbersBetween {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your numbers:- ");
		int n=sc.nextInt();
		int x= sc.nextInt();
		System.out.println("Odd numbers between "+n+" and "+x+" are-:");
		while(n<x) {
			int i=n+1;
			if(i%2!=0) {
				System.out.println(i);	
	
			}
			n++;	
		}while(x<n) {
			int i=x+1;
			if(i%2!=0) {
				System.out.println(i);
				
			}
			x++;
		}
		
	}

}
