package LinkedList;

public class IsCycle {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	
	public boolean isCycle() { // Flayd's Cycle finding algorithum.
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=head.next;//+1
			fast=head.next.next;//+2
			if(slow==fast) {
				return true; //Cycle in Ll exits.And ismein yeh neccessary nhi hain ki they 
				//will meet at last node slow fast kahin bhi meet krr skte hain
				// but meet jbb hi krenge if its is a cycle linked list.
			}
			
		}
		return false;//Cycle does'nt exist.
	}
	
}
