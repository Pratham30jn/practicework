package String;

import java.util.Scanner;

public class CheckStringPallindrome {
	// By different methods.
	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner sc=new Scanner(System.in); System.out.println("Enter a string-:");
	 * String str=sc.nextLine(); char []arr=str.toCharArray(); boolean
	 * pallin=checkForPallindrome(arr); System.out.println(pallin); }
	 * 
	 * private static boolean checkForPallindrome(char[] arr) { int f=0; int
	 * l=arr.length-1;
	 * 
	 * while(f<=l) { if(arr[f]==arr[l]) { f++; l--; }else { return false; } }
	 * 
	 * 
	 * return true; }
	 * 
	 * 
	 */	
	public static boolean checkForString(String str) {
				int n=str.length();
		for(int i=0;i<n;i++) {
			if(str.charAt(i)==str.charAt(n-1-i)) {		
			}else {
				return false;
			}
		
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(checkForString(str));
	}

}
