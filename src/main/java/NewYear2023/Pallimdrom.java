package NewYear2023;

import java.util.Scanner;

public class Pallimdrom {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		String a= sc.nextLine();
		char[] arr=a.toCharArray();
		boolean Pallimdrom=checkPallimdrom(arr);
        System.out.println(Pallimdrom);     		
			}
	public static boolean checkPallimdrom(char[] ar) {
	
		int f=0;
		int l=ar.length-1;
		while(f<l) {
			if(ar[f]==ar[l]) {
			
				f++;
				l--;
				
			} else {
	       	return false;
	       	
			}
			
			
		}
		return true;

		
		
	}

}
