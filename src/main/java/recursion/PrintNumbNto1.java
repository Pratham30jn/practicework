package recursion;

public class PrintNumbNto1 {
	public static void main(String[] args) {
		numb(10);
		
	}
	public static void numb(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		numb(n-1);
	}

}
