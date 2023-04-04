package loops;

import java.util.Scanner;

public class SumOfFirstNnaturalNumber {
	//To print sum of all natural numbers up to n
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number-:");
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of natural numbers upto n-:"+sum);
	}

}
