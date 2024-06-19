package constructor;

public class CountObjects {
	
	String name ;
	int id ;
	String address;
	static int count;
	public CountObjects(String name, int id) {
		System.out.println("Inside para1 Const");
		this.id=id;
		this.name=name;
		count++;		
	}
	
	
	

}
