package loops;

import java.util.Scanner;

public class PrintingANumber {
	// Input 9834-output-9,8,3,4.
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		for(int i=0;n>0;i++) {
	   int lastdig=n%10;
	   rev=(rev*10)+lastdig;
	   n=n/10;
		}
	//	System.out.println(rev);
		for(int i=0;rev>0;i++) {
			int z=rev%10;
			System.out.print(z+",");
			rev=rev/10;
		}
			
	}
}