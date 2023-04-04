package loops;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		int choice;
		int evensum=0;
		int oddsum=0;
		
		do {
			System.out.println("Enter number");
			int y=sc.nextInt();
			if(y%2==0) {
				evensum+=y;
			}else {
				oddsum+=y;				
				} 
			System.out.println("If you want to continue enter 1 else 0");
			choice=sc.nextInt(); 
		}while(choice==1);
		
		
		System.out.println("Sum of even number is :"+evensum);
		System.out.println("Sum of odd number is :" +oddsum);
		
		
		
	}

}
