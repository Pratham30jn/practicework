package loops;
import java.util.*;
public class Factorial {
	// To print factorial of a number.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		int fact=1;
		while(a>=1) {
			fact*=a;
			a--;
		}
		System.out.println(fact);
	}

}
