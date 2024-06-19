package nestedloopspattern;

public class NumberPattern {
	public static void main(String[] args) {
		int line =3;
		int x=1;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=line;j++) {
				System.out.print(x);
				x++;
			}
			System.out.println();
		}
				
	}

}
