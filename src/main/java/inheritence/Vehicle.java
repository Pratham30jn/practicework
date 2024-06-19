package inheritence;

public class Vehicle {
	String type;
	int numberTyre;
	
	public Vehicle() {
		System.out.println("Vehicle no arg Constructor invoked");
	}
	public Vehicle(int chesis) {
		this();
		System.out.println("Vehicle arg Constructor invoked");
	}
	
}
