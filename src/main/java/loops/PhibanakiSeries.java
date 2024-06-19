package loops;

import java.util.Scanner;

public class PhibanakiSeries {
	public static void main(String[] args) {
		int a=0,b=1,c;
	     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element-:");
		int n=sc.nextInt();
		// 0 is 0th element of fibonacci series.
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=n;i++) {
			c=a+b;
	System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		
		
		
	}

}
