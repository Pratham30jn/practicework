package constructor;

public class PrivateConst {
	
	int roll;
	String name;
	String addresss;
	 static PrivateConst pvt;
	private PrivateConst(String name , int roll) {
		this.name=name;
		this.roll=roll;
		System.out.println("Inside Constructor");
	}
	
	public static PrivateConst getObject(String name , int roll) {
		if(pvt==null) {
			pvt=new PrivateConst(name, roll);
			return pvt;
		}
		
		return pvt;
	}
	

}
