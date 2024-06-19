
package constructor;

public class ConstChaining {
	String name ;
	int id ;
	String address;
	
	public ConstChaining() {
		System.out.println("Inside No Argument Const");
	}
	public ConstChaining(String name, int id) {
		this(id,"Faridabad");// yeh iss class k uss constructor ko call krega jisme int,String parameter hain. 
		System.out.println("Inside para1 Const");
		this.id=id;
		this.name=name;

	}
	public ConstChaining(int id,String address) {
		this();
		System.out.println("Inside para2 Const");
		this.id=id;
		this.address=address;

	}

	
	
	

}
