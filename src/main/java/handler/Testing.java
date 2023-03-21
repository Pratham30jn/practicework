package handler;

import java.util.Scanner;

public class Testing {
	// To find maximum and minimum in an array

		// to get length of array
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter length of array- ");
			int d = sc.nextInt();
	// created array
			int[] arr = new int[d];
			int maxi = arr[0];
			int mini = arr[0];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("arr[" + i + "]");
				int x = sc.nextInt();
				arr[i] = x;
			}
			// display array
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			// for array max
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= maxi) {
					maxi = arr[i];
				} else {
					maxi = maxi;
				}
			}
			// for array min
			for (int i = 0; i < arr.length; i++) {
				if (  arr[i]<= arr[0]) {
					arr[0] = arr[i];
				} else {
					arr[0]=arr[0];
				}
			}
			System.out.println(" ");
			System.out.println("Max- " + maxi);
			System.out.println("Min- " + mini);
			
			
			
			
		}

}