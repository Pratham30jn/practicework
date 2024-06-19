package recursion;

public class FirstOccurence {
	public static void main(String[] args) {
		int arr[]= {1,3,6,9,0,10,2,9,3};
	//	firstOcc(arr, 0, 5);
		System.out.println(first(arr, 0, 9));
	}
	public static int first (int arr[], int i, int key) {
		if(i==arr.length) {
			System.out.println("Element not found");
			return -1;// Indicate key not found in array.
		}
		if(arr[i]==key) {
			return i;
		}
		return first(arr, i+1, key);
	}
	
	public static void firstOcc(int arr[],int i,int key) {
		 if(i==arr.length-1) {
			 if(arr[i]==key) {
				 System.out.println(i);
			 }else {
				 System.out.println("Element Not Found");
			return;	 
			 }
			 
		 }
		  if(arr[i]==key) {
			  System.out.println(i);
			  return;
		  }
		  firstOcc(arr, i+1, key);
		
	}

}
