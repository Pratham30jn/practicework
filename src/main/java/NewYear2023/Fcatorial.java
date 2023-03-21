package NewYear2023;

import java.util.Scanner;

public class Fcatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number whose factorial to be found-:");
		int x=sc.nextInt();
		int a=1;
		int b=1;
		while(a<=x) {
			b=b*a;
			a++;
			
		}
		System.out.print("Factorial of "+x+" is-:"+ b);
	}

}
