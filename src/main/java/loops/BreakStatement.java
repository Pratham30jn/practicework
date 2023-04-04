package loops;

import java.util.Scanner;

public class BreakStatement {
     // keep entering a number until user enter a multiple of 10.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter a number-:");
			int n=sc.nextInt();
			
			if(n%10==0) {
				System.out.println("Number will not be printed as it's a multiple of 10");
				break;
			
			}
			System.out.println(n);
			
		
		}
		while(true);

	}

}
