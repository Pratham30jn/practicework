package polymorphism;

public class VarArg {
	
	public static void main(String[] args) {
	VarArg var=new VarArg();
	var.disp(10,10,10);
	var.disp(10);
	var.disp(10, 10);// var arg get least priority.
	}
	
	public static void disp(int...x) {
		System.out.println("Var ag method is called");
		
	}
	public static void disp(int a,int b) {
		System.out.println("Double int arg method");
	}

}
