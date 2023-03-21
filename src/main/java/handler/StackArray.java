package handler;

import java.util.Scanner;

public class StackArray {
	static int top=-1;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of stack-:");
		int n =sc.nextInt();
		int[] stack=new int[n];
		
		
		push(stack,10);
		push(stack,20);
		push(stack,30);
		push(stack,40);
		push(stack,50);
		push(stack,60);
		pop(stack);
		push(stack,90);
		
        print(stack);
		int a=peak(stack);
		System.out.println("Element at the top is-:"+a);
	}
	public static int peak(int[]stack) {
		return stack[top];
	}
	public static void pop(int[]stack) {
		if(top==-1) {
			System.out.println("Stack is already empty");
		}else {
			top-=1;
		}
	}
	public static void print(int[]stack) {
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
	}
	
	public static void push(int []stack,int elementToBeAdded) {
		if(top==stack.length-1) {
			System.out.println("Stack overflow");
		}else {
			if(top==-1) {
				top=top+1;
				stack[top]=elementToBeAdded;
			}
			else {
				top=top+1;
				stack[top]=elementToBeAdded;
			}
		}
		
		
		
		
  }
			
		
	
		 
	}
	
