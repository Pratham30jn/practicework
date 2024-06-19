package LinkedList;

public class RemoveCycle {
	
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
	
	public void removeCyc() {
		Node slow=head;
		Node fast=head;
		boolean cycle=false;
		
		while(fast !=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow) {
				cycle=true;
				break;
			}
		}
		if(cycle==false) {
			return;
		}
		slow = head;
		Node prev=null;
		while(slow !=null) {
		prev =fast;
		slow=slow.next;
		fast=fast.next;
		}
		prev.next=null;
	
	}
	
}
