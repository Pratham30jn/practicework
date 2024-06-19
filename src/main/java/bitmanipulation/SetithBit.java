package bitmanipulation;

public class SetithBit {
	public static int setIthBit(int n, int i) {
		int bitMask= (1<<i) ;
		return (n | (bitMask));
	
	}
	
	public static void main(String[] args) {
		// Set I th bit
		System.out.println(setIthBit(10, 2));
	}

}
