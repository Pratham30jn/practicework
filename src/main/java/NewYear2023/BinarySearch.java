package NewYear2023;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
     		Scanner sc= new Scanner(System.in);
     		System.out.println("Enter lenght of array-:");
     		int n=sc.nextInt();
     		
	int[] arr= new int[n];
	System.out.println("Enter elements of array-:");
	// Array should be sorted.
	for(int i=0;i<arr.length;i++) {
		int y=sc.nextInt();
		arr[i]=y;
	}
		//Binary search of element.
	System.out.println("Enter  the array elements which is to be searched-:");
		int z=sc.nextInt();
		int f=0;
		int l=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			int mid=f+l/2;
			if(arr[mid]==z) {
				System.out.println("Index of "+z+" in array is-:"+ mid);
				return;
			}
			else {
				if(z>arr[mid]) {
					f=mid+1;
				}else {
					l=mid-1;
				}
			}
		}
		
	}

}
