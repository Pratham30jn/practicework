package Arrays;

public class LinearSearch {
	public static int linearSearch(String arr[], String key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
	       return-1;
	}
	
	public static int linearSearch(int arr[], int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
	       return-1;
	}
	public static void main(String[] args) {
		//int numbers[]= {2,4,6,8,10,12,14,16};
	//	int key=12;
		
		String food[]= {"dosa","samosa","idli","pizza","momos"};
		String key="pasta";
		//int index=linearSearch(numbers, key);
		int index=linearSearch(food, key);
		if(index==-1) {
			System.out.println("Not found");
		}else {
			System.out.println("index of key is-:"+index);
		}
	}

}
