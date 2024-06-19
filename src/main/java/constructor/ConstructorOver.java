package constructor;

public class ConstructorOver {
// Overloaded Constructor.
	String name ;
	int id ;
	String address;
	
	public ConstructorOver() {
		System.out.println("Inside No Argument Const");
	}
	public ConstructorOver(String name, int id) {
		System.out.println("Inside para1 Const");
		this.id=id;
		this.name=name;
				
	}
	public ConstructorOver(int id,String address) {
		System.out.println("Inside para2 Const");
		this.id=id;
		this.address=address;
				
	}


}
