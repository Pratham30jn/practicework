package handler;

import java.util.Scanner;

public class Test {
	static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack- ");
		int n = sc.nextInt();
		System.out.println("Enter an expression- ");
		String s=sc.next();
		char[] arr = s.toCharArray();
		char[] arr1 = new char[100];
		char[] arr2 = new char[n];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(' || arr[i] == ')') {
				arr1[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == '(') {
				push(arr1, arr2, i);
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == ')') {
				pop(arr1, arr2, i);
			}
		}
		System.out.println(s);
		if (top == -1) {
			System.out.println("balanced parenthesis");
		} else {
			System.out.println("unbalanced parentesis");
		}
	}

	private static void pop(char[] arr1, char[] arr2, int i) {
		top-=1;
	}
	private static void push(char[] arr1, char[] arr2, int i) {
		if (top == arr2.length - 1) {
			System.out.println("Stack overflow");
		} else {
			top += 1;
			arr2[top] = arr1[i];
		}

	}
		
		
		
		
	
}
