package bitmanipulation;

public class CountSetBit {
	public static int countSetBit(int n) {
		int bitMask=1;
		int count=0;
		while(n>0) {
			if((n & bitMask )==1) {
				count+=1;
			}
			n=n>>1;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countSetBit(64));
	}

}
