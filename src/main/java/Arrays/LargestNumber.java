package Arrays;

public class LargestNumber {
	public static int getLargestNumber(int number[]) {
		int l=Integer.MIN_VALUE;// l is largest number. 
		int s=Integer.MAX_VALUE;// s is smallest value.
		for(int i=0;i<number.length;i++) {
		//	l=Math.max(l,number[i]);
			
			  if(number[i]>l) { 
				  l=number[i];
				  
				  }
			 	if(number[i]<s) {
				s=number[i];
			}
			
		}
		System.out.println("Smallest number of the array is :"+ s);
		return l;
	}	
	public static void main(String[] args) {
		int [] number= {1,2,6,3,5};
		System.out.println("Largest number is :"+getLargestNumber(number));
		
	}

}
