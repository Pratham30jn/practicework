package loops;

import java.util.Scanner;

public class MultiplicationTable {
	// To print a MultiplicationTable table  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number-:");
		int n=sc.nextInt();
		
		for(int count=1;count<=10;count++) {
			System.out.println(n+"*"+count+"="+n*count);
		}
		
	}

}
