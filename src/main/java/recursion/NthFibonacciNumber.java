package recursion;

public class NthFibonacciNumber {
	public static void main(String[] args) {
		System.out.println(fibo(50));
		
	}
	public static int fibo(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		int f1=fibo(n-1); 
				int f2=fibo(n-2);
		return f1+f2;
	}

}
