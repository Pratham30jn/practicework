package ifelseswitch;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a-:");
		int a=sc.nextInt();
		System.out.println("Enter value of b-:");
		int b=sc.nextInt();
		System.out.println("Enter of operator to be appllied on operands a and b-:");
		int ch=sc.next().charAt(0);
		
		switch(ch) {
		case '+': System.out.println(a+b);
		break;
		case '-': System.out.println(a-b);
		break;
		case '*': System.out.println(a*b);
		break;
		case '/': System.out.println(a/b);
		break;
		case '%': System.out.println(a%b);
		break;
		
		default : System.out.println("Wrong operator");
		}
		
		
		
	}

}
