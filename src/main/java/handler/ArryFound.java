package handler;

public class ArryFound {
	public static void main(String[] args) {
	
		int x[] = {0,1,0,1,1,0,0,0,1,1,0};
		int count=0;
		int count1=0;
		for(int i=0;i<x.length;i++) {
			if (x[i]==0) {
				count++;
			}
			else {
				count1++;
				
			}

		}
		System.out.println(count);
		System.out.println(count1);
	}

}
