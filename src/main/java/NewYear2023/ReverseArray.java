package NewYear2023;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr1= new int[len];
		int n=0;
		while (n<arr1.length) {
			int y=sc.nextInt();
			arr1[n]=y;
			n++;
		}
		
		int[] arr2=new int[arr1.length];
		int l=arr1.length-1;
		int i=0;
		while(i<arr1.length) {
		
			arr2[i]=arr1[l];
			i++;
			l--;
		}
		for(int z=0;z<arr2.length;z++) {
			System.out.println(arr2[z]);
		}
		
	}
}
