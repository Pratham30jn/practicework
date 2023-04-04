package nestedloopspattern;

import java.util.Scanner;

// nested loops>> loops k andar loops.
public class RightangleTrianglePattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of lines-:");
		// 1st line -:1 star
		//2nd line -:2 star
		int line=sc.nextInt();
		for(int i=1;i<=line;i++) {
			for(int star=1;star<=i;star++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
				
	}

}
