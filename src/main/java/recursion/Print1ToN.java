package recursion;

public class Print1ToN {
	public static void main(String[] args) {
		numb(10);
		
	}
	public static void numb(int n) {
		if(n==0) {
			return;
		}
		numb(n-1);
		System.out.print(n+" ");
	}


}
