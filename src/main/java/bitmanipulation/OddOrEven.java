package bitmanipulation;

public class OddOrEven {
	// Check for odd or even number using bit wise operator.
	public static void oddOrEven(int n) {
		int bitmask=1;//00000001 and operator .
		if((n & bitmask)==0) {
			// Even number.
			System.out.println("Even");
			
		}else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		oddOrEven(11);
	}
}
