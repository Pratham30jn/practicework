package arrays2d;

import java.util.Scanner;

public class Print2dArray {
	// Its like a matrix.
	public static void main(String[] args) {
		int matrix1[][]=new int[3][3];
		int n=matrix1.length;//for no. of rows in matrix.
		int m=matrix1[0].length;// for no. of columns in matrix.
		
		Scanner sc=new Scanner(System.in);
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<m;j++) {
				 matrix1[i][j]=sc.nextInt();
			 }
	   }
	   int count =0;
		 for(int i=0;i<matrix1.length;i++) {
				int search=matrix1[0][i];
				int a=1;
			 for(int j=0;j<matrix1[0].length;j++) {
                      if(matrix1[a][j]==search) {			
                    count =search;
               
				} /*
					 * else { count=0; }
					 */
			
				// System.out.print( matrix1[i][j]+" ");
			 }
			  a++;
			 //System.out.println();
		 }
		 
		 if(count==0) {
			 System.out.println("No element is common");
		 }else {
			 System.out.println("Common element is"+count);
		 }
	}

}
