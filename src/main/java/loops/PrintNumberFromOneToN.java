package loops;

import java.util.Scanner;

public class PrintNumberFromOneToN {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.print(i+" ");
			i++;
		}
		
	}

}
