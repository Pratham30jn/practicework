package Sorting;

public class BubbleSort {
	
	static int swap=0;

	public static void bubbleSort(int arr[]) {
	
			for(int i=0;i<arr.length-2;i++) {
		
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					swap++;
				}
			}
			
		}
		System.out.println("No. of swaps ="+swap);
		
	}
	public static void printArray(int [] numb) {
		for(int s=0;s<numb.length;s++) {
			System.out.print(numb[s]+" ");
    	}
	}

	public static void main(String[] args) {
		
		int [] arr= {5,4,1,3,2};
		if(swap==0) {
		bubbleSort(arr);
		printArray(arr);
		}else {
			printArray(arr);
		}
		}
}
	


