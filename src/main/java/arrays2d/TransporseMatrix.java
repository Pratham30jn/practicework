package arrays2d;

public class TransporseMatrix {
	public static void main(String[] args) {
		
		int arr[][]= {  {1,2,3},
			        	{4,5,6},
				        {7,8,9} };
		
		int n=arr.length;
		int m=arr[0].length;
		int arr2[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr2[i][j]=arr[j][i];		
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				//arr[i][j]=arr[j][i];
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
