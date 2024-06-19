package QueueAlpha;

public class QueueLink {
   public static class Node{
	   Node next ;
	   int data;
	   public Node(int data) {
		   this.data=data;
		   this.next=null;
	   }
   }
  public static class Queue{
	  public static Node head=null;
	  public static Node tail=null;
	  
	  public static boolean isEmpty() {
		  return head== null && tail==null;
	  }
	  
	  public static void add(int data) {
		  Node n=new Node(data);
		  if(isEmpty()) {
			  head=tail=n;
			  return;
		  }
		  tail.next=n;
		  tail=n;
	  }
	  public static int remove() {
		  if(isEmpty()) {
			  System.out.println("Queue is Empty");
			  return -1;
		  }
		  int front=head.data;

		  if (tail==head) {
			  head=tail=null;
		  }else {
		  		  head=head.next;
		  }
		  return front;
	  }
	  public static int peek() {
		  if(isEmpty()) {
			  System.out.println("Queue is Empty");
			  return -1;
		  }
		  return head.data;  
	  }
	  
  }
         public static void main(String[] args) {
			Queue q=new Queue();
			q.add(1);
			q.add(2);
			q.add(3);
			while(!q.isEmpty()) {
				System.out.println(q.peek());
				q.remove();
			}
			
		}
   

}
