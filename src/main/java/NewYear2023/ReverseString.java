package NewYear2023;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
		
	//	String a=sc.nextLine();
		
	  //char[] arr=a.toCharArray();
int arr[]= {1,2,3,4,5};
	    for (int i=0;i< arr.length/2; i++) {
			int l=arr.length-1-i;	    		
	    
	    //	char 
	    	int temp=arr[i];
	    	arr[i]=arr[l];
	    	arr[l]=temp;
	    	
	    }
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]);
	    }
		
	}

}
