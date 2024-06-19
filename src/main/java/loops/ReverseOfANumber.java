package loops;
import java.util.Scanner;

public class ReverseOfANumber {
	// To print reverse of a number.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number-:");
		int n=sc.nextInt();
		System.out.println("Revrese of a number is-:");
		//int count=0;
		  for(int i=0;n>0;i++) {
			 int z=n%10;
			  System.out.print(z+"");
			  n=n/10;
		 
		  }
		  
		 	}

}
