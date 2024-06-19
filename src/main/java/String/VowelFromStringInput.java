package String;

import java.util.Scanner;

public class VowelFromStringInput {
	// Print only vowel from entered String.
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Vowels are at position-:");
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)){
			
			case 'a':System.out.println(i+"-postion"+" a");
			break;

			case 'e':System.out.println(i+"letter"+"e");
			break;

			case 'i':System.out.println(i+"letter"+"i");
			break;

			case 'o':System.out.println(i+"letter"+"o");
			break;

			case 'u':System.out.println(i+"letter"+"u");
			break;
			
			
			
				
			}
		}
	}

}
