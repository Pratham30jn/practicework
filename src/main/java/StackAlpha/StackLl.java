package StackAlpha;

public class StackLl {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;	
		}
	}

	public static Node head=null;
	public boolean isEmpty() {
		return head==null;
	}
	public void push(int data) {
		Node nD=new Node(data);
		if(isEmpty()) {
			head=nD;
			return;
		}
		nD.next=head;
		head=nD;
	}
   public int pop() {
	   if(isEmpty()) {
		   return-1;
	   }
	   int val=head.data;
	   head=head.next;
	   return val;
   }
   public int peek() {
	   if(isEmpty()) {
		   return-1;
	   }
	   return head.data;
   }
   
   public static void main(String[] args) {
	
	   StackLl stk=new StackLl();
	   stk.push(1);
	   stk.push(2);
	   stk.push(3);
	   
	   
	   
	   while(!stk.isEmpty()) {
		   System.out.println(stk.peek());
		   stk.pop();
	   }
	  
	   
	   
}

}
