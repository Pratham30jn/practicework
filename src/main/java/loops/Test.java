package loops;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			int ch=sc.next().charAt(0);
			if(ch=='*') {
				break;
			}
		}
	}

}
