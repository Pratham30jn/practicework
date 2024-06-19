package Arrays;

import java.util.Scanner;

public class CharacterArray {
	public static void main(String[] args) {

		//char arr[]= {'p','r','t','h','a','m'};
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		while(x!=0) {
			x=x%10;
			System.out.println(x);
			x=x/10;
		}
		
	}

}
