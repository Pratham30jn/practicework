package constructor;

public class Singleton {
	public static void main(String[] args) {
		
		// This is singleton pattern in this only one object created by name Pratham, so if make any number of reff variable it willl assign to this object only.
		PrivateConst x=PrivateConst.getObject("Pratham", 102);
		PrivateConst y=PrivateConst.getObject("Pulkit", 106);
		System.out.println(x.name);
		System.out.println(y.name);
		System.out.println(x.roll);
		System.out.println(y.roll);
	}

}
