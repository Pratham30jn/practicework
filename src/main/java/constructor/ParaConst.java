package constructor;

public class ParaConst {
	
	String name ;
	int id ;
	String address;
	
	// Now in this case default constructor will not be provided by JVM. 
	
	public ParaConst(String name, int id,String address) {
		System.out.println("Inside para constructor");
		this.id=id;
		this.address=address;
		this.name=name;
				
	}

}
