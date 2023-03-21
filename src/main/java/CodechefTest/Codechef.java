package CodechefTest;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read =new Scanner(System.in);
		//number of test cases.
		int t=read.nextInt();
		for(int i=0;i<=t;i++){
		    
		    int a=read.nextInt();
		    int b=read.nextInt();
		    
		    int c=a+b;
		    
		    if(c>6){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    
		}
		
	}
}
