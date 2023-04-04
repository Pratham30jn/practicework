package Arrays;

public class SubArray {
	public static void printSubarray(int arr[]) {
		System.out.println("All subarray of array's are -:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int s=i;s<=j;s++) {
					System.out.print(arr[s]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		printSubarray(arr);
		
	}

}
