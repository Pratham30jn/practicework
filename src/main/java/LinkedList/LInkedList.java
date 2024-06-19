package LinkedList;



public class LInkedList {
	public class Node{
		
		Node next;
		int data;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		  
	}
	  public static Node head;	
	  public static Node tail;
	  public static int size;
		
	public void addFirst(int data) {
		Node newNode=new Node(data);
		size++;
		
		if(head==null) {
			head=tail=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
		
		
	}public void addLast(int data) {
		Node newNode=new Node(data);
		size++;
		  if(head==null) {
			  head=tail=newNode;
			  return;
		  }
		  tail.next=newNode;
		  tail=newNode;
		  
	}
	public void printll() {
		if(head==null) {
			System.out.println("Linked l is empty");
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public void add(int idx,int data) {
		if(idx==0) {
			addFirst(data);
			return;
		}
		Node newNode=new Node(data);
		size++;
		Node temp=head;
		int i=0;
		while(i<idx) {
			temp=temp.next;
			i++;
		}
		
		newNode.next=temp.next;
	temp.next=newNode; 
	}public int removeF() {
		// Return type int if you want to return the deleted value otherwise void.
		if(size==0) {
			System.out.println("Linked list is empty");
			return Integer.MIN_VALUE;
		}else if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	public int removeL() {
		if(size==0) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		}
		if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		
		Node prev =head;
		int i=0;
		while(i<size-2) {
			prev=prev.next;
			i++;
		}
		int val=tail.data;
		prev.next=null;
		tail=prev;
		size--;
		return val;
		
	 } 
	public int search(int key) {
		Node temp =head;
		for(int i=0;i<size;i++) {
			if(temp.data==key) {
				return i;
			}
			temp=temp.next;
		}
		return -1;
		 
	 }
	
	
	public static void main(String[] args) {
		
		LInkedList Ll=new LInkedList();
		Ll.addFirst(2);
		Ll.addFirst(1);
		Ll.addLast(4);
		Ll.addLast(5);
		Ll.add(2, 3);
		Ll.printll();
		System.out.println(Ll.removeL());
		Ll.printll();
		System.out.println("Searching of 3-"+Ll.search(3)); 
		//System.out.println(Ll.size);
	
		//System.out.println("Data removed is-"+	Ll.removeF());
		//Ll.printll();
		//System.out.println(Ll.size);
		
	}
	

}
