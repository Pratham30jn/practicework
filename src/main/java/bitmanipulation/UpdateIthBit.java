package bitmanipulation;

public class UpdateIthBit {
	public static int clearIthBit(int n, int i) {
		int bitmask= ~(1<<i);
		
		return (n & bitmask);

	}
	public static int updateIthBIt(int n ,int i, int newbit) {
		
		n=clearIthBit(n,i);
		int bitmask=newbit<<i;
		return n | bitmask;
	}
	public static void main(String[] args) {
		System.out.println(updateIthBIt(10, 2, 1));
	}

}
