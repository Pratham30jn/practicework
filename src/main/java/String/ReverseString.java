package String;

import java.util.Scanner;

public class ReverseString {
	public static void reverseString(char[] arr) {
		int first=0;
		int last=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
		    char temp=arr[first];
		    arr[first]=arr[last];
		    arr[last]=temp;
		    first++;
		    last--;
		}
	}
	public static void printArray(char [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		char [] arr=str.toCharArray();
		
		reverseString(arr);
		printArray(arr);
		
		
		
		
	}

}
