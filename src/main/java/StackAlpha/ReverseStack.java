package StackAlpha;

import java.util.Stack;

public class ReverseStack {
	public static void stackRev(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top=s.pop();
		stackRev(s);
		pushAtBottom(s,top);
		
	}
	private static void pushAtBottom(Stack<Integer> s, int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top= s.pop();
		pushAtBottom(s, data);
		s.push(top);
		
	}
	public static void main(String [] args) {
		
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
        s.push(3);
      //  stackRev(s);
        while(!s.isEmpty()) {
        	System.out.println(s.pop());
        }
        
   }

}
