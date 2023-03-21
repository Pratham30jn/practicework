						package handler;

import java.util.Scanner;

public class QueueAsArray {
	static int top=-1;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of queue-:");
		int n =sc.nextInt();
		int[] queue=new int[n];
		
		
		push(queue,10);
		push(queue,20);
		push(queue,30);
		push(queue,40);
		push(queue,50);
		push(queue,60);
		pop(queue);
	    push(queue,90);
		
        print(queue);
		int a=peak(queue);
		System.out.println("Element at the top is-:"+a);
		System.out.println("top>>"+top);
	}
	public static int peak(int[]queue) {
		return queue[top];
	}
	public static void pop(int[]queue) {
		if(top==-1) {
			System.out.println("Queue is already empty");
		}else {
			for(int i=0;i<=top-1;i++) {
				queue[i]=queue[i+1];
			}
		top-=1;
		}
	}
	public static void print(int[]queue) {
		for(int i=0;i<=top;i++) {
			System.out.println(queue[i]);
		}
	}
	
	public static void push(int []queue,int elementToBeAdded) {
		if(top==queue.length-1) {
			System.out.println("Stack overflow");
		}else {
			if(top==-1) {
				top=top+1;
				queue[top]=elementToBeAdded;
			}
			else {
				top=top+1;
				queue[top]=elementToBeAdded;
			}
		}
		
		
		
		
  }
			
		
	


}
