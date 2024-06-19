package recursion;

public class LastOccurence {
	public static int lastOcc(int arr[],int i, int key) {
		
		if(i==arr.length) {
			return -1;
		}if(arr[i]==key) {
			
		return i;
		}
		return lastOcc(arr, i+1, key);
	}
	public static void main(String[] args) {
		int []arr= {8,3,6,9,5,10,2,5,3};
		lastOcc(arr, 0, 5);
	}

}
