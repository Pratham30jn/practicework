package inheritence;

public class bike extends Vehicle  {
	String name;
	String type;
	
	public bike() {
		super(10);// By this Statement Parent Class k constructor call hota hain.
		// if we not write it then provided by java.
		System.out.println("Bike constructer invoked");
	}
	public static void main(String[] args) {
		bike bk=new bike();
		
	}

}
