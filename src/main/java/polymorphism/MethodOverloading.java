package polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		
		MethodOverloading op=new MethodOverloading();
		op.disp();
		op.disp(10);
		op.disp(10.0f);
		op.disp('a');
		op.disp(103431l);
	//	op.disp(10.234);
		op.disp(10,10.00f);
		//op.disp(10,10);ambiguos.
		
	}
	
	public void disp() {
		System.out.println("No arg disp method is running");
	}
	public void disp(int x) {
		System.out.println("int arg disp method is running");
	}
	public void disp(float a) {
		System.out.println("Float arg disp method is running");
	}
	public void disp(int s,float b) {
		System.out.println("Int - FLoat");
	}

	public void disp(float s,int b) {
		System.out.println("FLoat-Int");
	}

}
