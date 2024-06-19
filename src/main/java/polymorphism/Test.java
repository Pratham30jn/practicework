package polymorphism;

public class Test {
	public static void main(String[] args) {
		
		Vehicle vle=new Vehicle();
		Test tst=new Test();
		Car cr=new Car();
		Bike b=new Bike();
        System.out.println(tst.maxSpeed(cr));
        System.out.println("\n");
	    System.out.println(tst.maxSpeed(vle));
	    System.out.println("\n");
	    System.out.println(tst.maxSpeed(b));
		
		
		
	}
	
	public static int maxSpeed(Vehicle v) {
		System.out.println("Default Speed of Vehicle in km/hr");
		return 10;
	}
	public static int maxSpeed(Car r) {
		System.out.println("Car Speed in km/hr");
		return 40;
	}
	public static int maxSpeed(Bike b) {
		System.out.println("Bike Speed in km/hr");
		return 50;
	}


}
