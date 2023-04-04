package Arrays;

public class BinarySearch {
	public static int binarySearch(int number[], int key) {
		int start=0;
		int end=number.length-1;
				while(start<=end) {
					int mid=(start+end)/2;

			if(number[mid]==key) {
				return mid;
			}else if(number[mid]>key) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int number[]= {2,4,6,8,10,12,14};
		int key=10;
		int index =binarySearch(number, key);
		if(index==-1) {
			System.out.println("Not found");
		
		}else {
			System.out.println("Index is :"+index);	
		}
				

	}
	
	

}
