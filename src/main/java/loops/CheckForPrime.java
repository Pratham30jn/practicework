package loops;

import java.util.*;

public class CheckForPrime {
	// To check weather a number is prime or not.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		
		boolean isPrime=true;
		
		  int count=0;
		  if(n==2) {
			  System.out.println("n is prime");
			  }
		  else { for(int i=2;i<=Math.sqrt(n);i++) {
			  if(n%i==0) { 
				   isPrime=false; 
				   count++;
				   }
			  }
		  
	 }
		  
		  if(count==0) {
			  System.out.println("Prime no.");
			  } else {
		  System.out.println("not prime");
		  
		  
		  }
		 			}

}
