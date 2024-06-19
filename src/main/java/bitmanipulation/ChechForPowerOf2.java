package bitmanipulation;

public class ChechForPowerOf2 {
	public static boolean chechForPowerOf2(int n) {
		return ((n & n-1)==0);
		
	}
 public static void main(String[] args) {
 	int n=39;
 	System.out.println(chechForPowerOf2(n));
}
}
