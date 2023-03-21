package NewYear2023;

public class MethodStack {
	public static void main(String[] args) {
		method1();
		System.out.println("Hello");
	}
	public static void method1() {
		method2();
		System.out.println("Pj");
	}public static void method2() {
		method3();
		System.out.println("Jain");
	}
public static void method3() {
		System.out.println("Pratham");
	}

}
