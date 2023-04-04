
package Sorting;
import java.util.*;

public class CountingSort {
	public static void printArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void countingSort(int arr[]) {
		int largest=Integer.MIN_VALUE;
		for(int t=0;t<arr.length;t++) {
			largest=Math.max(largest, arr[t]);
		}
		int count[]=new int [largest+1];
		for(int s=0;s<arr.length;s++) {
			count[arr[s]]++;
		}
		int j=0;
		for(int i=0;i<arr.length;i++) {
			while(count[i]>0) {
				arr[j]=i;
				j++;
				count[i]--;
			}
			
		}
     }
	public static void main(String[] args) {
		int[] arr= {1,4,1,3,2,4,3,7};
		countingSort(arr);
		printArray(arr);
	}

}
