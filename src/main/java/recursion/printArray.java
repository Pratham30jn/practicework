package recursion;

public class printArray {
	// Printing an array by recursion
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		print(arr, 0);
	}
	public static void print(int arr[],int i) {
		if(i>arr.length-1) {
			return;
		}
		// For printing array.
		//System.out.print(arr[i]+" ");
		print(arr,i+1);
		//For Reverse Printing.
		System.out.print(arr[i]+" ");
		
	}

}
