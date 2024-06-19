package constructor;

public class ConstructorDefault {
	
	int id ;
	String adrress;
	String name;
	
	public ConstructorDefault() {
		super();// super and this always first statement.
		System.out.println("Inside Default or No argument const");
	}
	
	// If we not provide this default constructor then it is provided by JVM.

}
