package Sorting;
import java.util.Arrays;
public class SortingQuestion {
	// Counting Sort, Insertion Sort, Bubble Sort, Selection Sort.
	public static void insertionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int curr=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>curr) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=curr;
		}
	}
	public static void selectionSort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
		}
	}
	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void countingSort( int[] arr) {
		int largest =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			largest=Math.max(largest, arr[i]);
		}
		System.out.println("Largest value in the array is-:"+largest);
		int count[]=new int [largest+1];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;			
		}
		int j=0;
		for(int i=0;i<count.length;i++) {
			while(count[i]>0) {
				arr[j]=i;
			j++;
			count[i]--;
			
		}
		}
	}
	public static void main(String[] args) {
		int []arr= {3,6,2,1,8,7,4,5,3,1};
	//	countingSort(arr);
		//bubbleSort(arr);
		//selectionSort(arr);
		//insertionSort(arr);
		Arrays.sort(arr);
		
		printArray(arr);
	}

}
