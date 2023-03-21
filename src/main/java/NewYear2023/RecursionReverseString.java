package NewYear2023;

import java.util.Scanner;

public class RecursionReverseString {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String a=sc.nextLine();
			char[] arr=a.toCharArray();
			reverseString(arr,0);
		
	}
	private static void reverseString(char[] arr,int index) { 
		
		if (index>arr.length-1) {
			return;
		}
		reverseString(arr,index+1);
		System.out.print(arr[index]);
		
	}
	

}
