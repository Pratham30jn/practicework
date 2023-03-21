package Dsa;

import java.util.Scanner;

public class StackQueue { 
		static int top = -1;

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a String-");
			String s = sc.nextLine();
			//System.out.println("Enter size of stack- ");
			//int z = sc.nextInt();
			String t = "";
			char[] arr = s.toCharArray();
			String[] arr2 = new String[100];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == ' ') {
					push(t, arr2);
					t = "";
				} else if (arr[i] == arr[arr.length - 1]) {
					t += arr[i];
					push(t, arr2);
					t = "";
				} else {
					t += arr[i];
				}
			}

			while (top != -1) {
				pop(arr2);
			}

		}

		public static void pop(String[] arr2) {
			System.out.print(arr2[top]);
			top -= 1;

		}

		public static void push(String t, String[] arr2) {
			if (top == arr2.length - 1) {
				System.out.print("Stack overflow");
			} else {
				top += 1;
				arr2[top] = t;
			}
		}
	}

