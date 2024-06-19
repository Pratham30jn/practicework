package nestedloopspattern;

public class CharacterPattern {
	public static void main(String[] args) {
		int line =5;
		char r=65;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(r);
				r+=1;
			}		
		//	r+=1;
			System.out.println();
		}
		
	}

}
