package nestedloopspattern;

public class InvertedStar {
	public static void main(String[] args) {
		int line=7;
		for(int i=1;i<=line;i++) {
			for(int star=line;star>=i;star--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
