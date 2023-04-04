package loops;

public class ReverseTheGivenNumber {
	// To Reverse the given number and store it in another variable;
	public static void main(String[] args) {
		int numb=10899;
		int rev=0;
		for(int i=0;numb>0;i++) {
			int lD=numb%10;
			 rev=(rev*10)+lD;
			 numb=numb/10;
		}
		System.out.println(rev);
	}

}
