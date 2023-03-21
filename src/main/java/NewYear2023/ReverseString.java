package NewYear2023;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String a=sc.nextLine();
		
	    char[] arr=a.toCharArray();

	    for (int i=0;i< a.length()/2; i++) {
			int l=arr.length-1-i;	    		
	    
	    	char temp=arr[i];
	    	arr[i]=arr[l];
	    	arr[l]=temp;
	    	
	    }
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]);
	    }
		
	}

}
