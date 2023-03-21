package handler;

import java.util.Scanner;

public class Test2 {
   public static void main(String[] args) {
	
	   Scanner sc= new Scanner(System.in);
	   int n=6;
	   int even=0;
	   int odd=0;
	   for(int i =0;i<=n;i++) {
		   
	   int x =sc.nextInt();
		   if(x%2==0) {
			   even=even+x;
			   
		   }else {
			   odd= odd+x;
		   }
		   n--;
	   }
	   
	   System.out.println(even);
	 
			  
   }  
}
