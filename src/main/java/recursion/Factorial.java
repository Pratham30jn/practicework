package recursion;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(6));
	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
	int fnm1=factorial(n-1);	// factorial of n-1.
      int fn=n*fnm1;// Factorial of n.
	     return fn;
	}

}
