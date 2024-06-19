package Arrays;

public class SubArraySum {
	// Brut force method
	public static void maxSubArraySum(int[]arr) {
		int currentSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int start=0;start<arr.length;start++) {
	
			for(int end=start;end<arr.length;end++) {
				currentSum=0;			
				for(int i=start;i<=end;i++) {
					currentSum+=arr[i];
				}
				System.out.println(currentSum);
				
				if(maxSum<currentSum) {
					maxSum=currentSum;
				}
			}
		}
		System.out.println("Max sum of subarray is : "+maxSum);
	}
	public static void main(String[] args) {
		int numbers[]= {1,-2,6,-1,3};
		maxSubArraySum(numbers);
		SubArray arr=new SubArray();
		arr.printSubarray(numbers);
		
	}

}
