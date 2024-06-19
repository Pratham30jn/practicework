package LinkedList;

public class NewLinked {
	
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}

	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addF(int data) {
		 Node newNode =new Node(data);
		 size++;
		 if(head== null) {
			 head=tail=newNode;
		 }
		 newNode.next=head;
		 head=newNode;
	}
	public void addL(int data) {
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(tail.next);
	}
	public int removeF() {
		if(size==0) {
			System.out.println("Linked is empty");
			return Integer.MAX_VALUE;
		}
		if(size==1) {
			int d=head.data;
			head=tail=null;
			size=0;
			return d;
		}
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	public void addMid(int index,int data) {
		if(index==0) {
			addF(data);
			return;
		}
		Node newNode=new Node(data);
		size++;
		Node temp=head;
		int i=0;
		while(i<index-1) {
			temp=temp.next;
			i++;
		}
		
		newNode.next=temp.next;
	temp.next=newNode; 
	
	}
	public int removeL() {
		if(size==0) {
			System.out.println("LinkedL is empty");
			return Integer.MAX_VALUE;
		}
		if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		Node prev=head;
		for(int i=0;i<size-2;i++) {
			prev=prev.next;
		}
		prev.next=null;
		size--;
		int val =tail.data;
		tail=prev;
		return val;
	}
	public static void main(String[] args) {
		NewLinked ll=new NewLinked();
		ll.addF(1);
		ll.addL(2);
		ll.addL(3);
		ll.addL(4);
		ll.addL(5);
		ll.print();
		ll.removeF();
		ll.print();
		ll.removeL();
		ll.print();
		
		System.out.println("Size of linked list is-"+ll.size);
	}
	
                          

}
