package Arrays;

public class RevreseAraay {
	public static void reverseArray(int numb[]) {
		int first=0; int last=numb.length-1;
		while(first<last) {
			int temp=numb[last];
		numb[last]=numb[first];
			numb[first]=temp;
			last--;
			first++;
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,10};
		reverseArray(arr);
		
		for(int s=0;s<arr.length;s++) {
			System.out.print(arr[s]+" ");
		}
		
	}

}
