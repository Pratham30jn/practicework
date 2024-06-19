 
package LinkedList;

public class SearchLl {
	
	public class Node {
		
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
		Node nd=new Node(data);
		size++;
		if(head==null) {
			head=tail=nd;
			return;
		}
		
		nd.next=head;
		head=nd;
		
	}
	public void addL(int data) {
		Node nd=new Node(data);
		size++;
		if(head==null) {
			head=tail=nd;
			return;
		}
		
		tail.next=nd;
		tail=nd;	
	}
	public int search(int ele) {
		Node temp=head;
		for(int i=0;temp!=null;i++) {
			if(temp.data==ele) {
				System.out.println("Element is Present at position");
				return i;
			}
			temp=temp.next;
		}
		System.out.println("Element Not Found");
		return -1;
	
	}
	public void printL() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		SearchLl Ll=new SearchLl();
		Ll.addF(1);
		Ll.addL(2);
		Ll.addF(3);
		Ll.addF(4);
		Ll.printL();
		int i=Ll.search(2);
		
		System.out.println(i);
		
		
		
		
		
		
	} 
	
	
	
	
		 

}
