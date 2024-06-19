package Sorting;

public class MergeSort {
	
	public static void merge(int arr[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid =si+(ei-si)/2;
		merge(arr, si, mid);
		merge(arr, mid+1, ei);
		mergeSort(arr,si,mid,ei);
	}

	private static void mergeSort(int[] arr, int si, int mid, int ei) {
		// TODO Auto-generated method stub
		int temp[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ei) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;
			}else {
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		
		  while(i<=mid){
		        temp[k]=arr[i];
		        k++;
		        i++;
		            }


		    while(j<=ei){
		        temp[k]=arr[j];
		        k++;
		        j++;
		        
		            }
		           
		for(int s=0,t=si;s<temp.length;s++,t++){
		    arr[t]=temp[s];
		}
		
	}

	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
	}
	public static void main(String[] args) {
		
		int arr[]= {6,3,9,5,2,8};
		merge(arr, 0, arr.length-1);
		printArray(arr);
		
	}
	
	
	

}	
