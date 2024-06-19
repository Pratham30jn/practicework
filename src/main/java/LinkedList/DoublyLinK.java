package LinkedList;

public class DoublyLinK {
	
	public class Node {
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addF(int data) {
		Node nd=new Node(data);
		size++;
		if(head==null) {
			head=tail=nd;
			return;
		}
		nd.next=head;
		head.prev=nd;
		head=nd;
	}
	public void addL(int data) {
		Node nd =new Node(data);
		size++;
		if(head==null) {
			head=tail=nd;
			return;
		}
		nd.prev=tail;
		tail.next=nd;
		tail=nd;
		
	}
	public int removeF() {
		if(size==0) {
			System.out.println("Linked list is empty");
		return Integer.MIN_VALUE;
	}  if(size==1) {
		int val=head.data;
		head=tail=null;
		size=0;
		return val;
	}
	int val=head.data;
	head=head.next;
	head.prev=null;
	size--;
	return val;
}
	public int removeL() {
		if(size==0) {
			System.out.println("Linked list is empty");
		return Integer.MIN_VALUE;
	}  if(size==1) {
		int val=head.data;
		head=tail=null;
		size=0;
		return val;
	}
	int val=head.data;
	tail.prev=null;
	Node temp=head;
	int i=0;
	while(i<size-2) {
		temp=temp.next;
		i++;
	}
	temp.next=null;
	return val;
	}
	public void reverse() {
		Node prev=null;
		Node current =head;
		Node next;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			current.prev=next;
			
			prev=current;
			current=next;
				
		}
		head=prev;
	}
	
	public void print() {
		Node temp=head;
		while(temp != null) {
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		
		DoublyLinK dll=new DoublyLinK();
		dll.addF(3);
		dll.addF(2);
		dll.addF(1);
		dll.addL(4);
		dll.reverse();
		dll.print();
		System.out.println("Size of linled list is-"+ size);
		dll.removeL();
		dll.print();
		System.out.println("Size of linled list is-"+ size);
		
	}
	

}
