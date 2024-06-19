package Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		int arr[]= {9000,900,100,50,5,6,7,524,443,1000};
		int Largest=arr[0];
		int i=1;
		int secondlarge=0;
		while(i<arr.length) {
			
			if(arr[i]>Largest) {
				int temp=Largest;
				Largest=arr[i];
				secondlarge=temp;
			}else {
				if(arr[i]>secondlarge) {
					secondlarge=arr[i];
				}
			}
			i++;
			/* System.out.println(arr[i]); */
			
		}
		System.out.println("Array is :");
		for(int j=0;j<arr.length;j++) {
			System.out.print( arr[j]+" ");
		}
		System.out.println("\n");
		System.out.println("Largest elements in array is :"+Largest);
		System.out.println("Second largest elements in the array is :"+secondlarge);
	}

}
