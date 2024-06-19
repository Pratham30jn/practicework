package arrays2d;

public class Multiplication {
	static final int n=3;
	public static void main(String[] args) {
		int mat1[][]= { {1,2,3},
		        {4,5,6},
		        {7,8,9} };
int mat2[][]= {{1,2,3},
		       {4,5,6},
	           {7,8,9}};
int mat3 [][]=new int[n][n];
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		mat3[i][j]=0;
		for(int k=0;k<n;k++) {
			mat3[i][j]+=mat1[i][k]*mat2[k][j];
		}
	}
	
	
}
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		System.out.print(mat3[i][j]+" ");
	}
	System.out.println();
}

		
	}

}
