package NewYear2023;

import java.util.Scanner;

public class Recursion {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//int[] arr= {1,2,3,4,5};
		int n=sc.nextInt();
		print(n);
	
	}
	public static void print(int number) {
		if(number>50) {
			return;
		}
		print(number+2);
		System.out.println(number);
			
	}

}
