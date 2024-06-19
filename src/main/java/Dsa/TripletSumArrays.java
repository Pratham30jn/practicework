package Dsa;

import java.util.Arrays;

public class TripletSumArrays {
	public static void  threeSum(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int curr=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				int rc=arr[j];
				for(int t=j+1;t<arr.length;t++) {
					if((curr+rc+arr[t])==0) {
						int temp[]= {curr,rc,arr[t]};
						Arrays.sort(temp);
						
						System.out.println(curr+","+rc+","+arr[t]);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
	int arr[]= {-1,0,1,2,-1,-4};
	threeSum(arr);
	}

}
