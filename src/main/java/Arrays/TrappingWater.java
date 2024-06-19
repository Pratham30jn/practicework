package Arrays;

public class TrappingWater {
	public static int trap(int heigth[]) {
		int n =heigth.length;
		int leftMax[] =new int[n];// auxillary array.
		leftMax[0]=heigth[0];
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(heigth[i], leftMax[i-1]);
		}
		int rigthMax[] =new int[n];// auxillary array.
		rigthMax[n-1]=heigth[n-1];
		for(int i=n-2;i>=0;i--) {
			rigthMax[i]=Math.max(heigth[i], rigthMax[i+1]);
		}
		int trapWater=0;
		for(int i=0;i<n;i++) {
			int waterlevel=Math.min(leftMax[i], rigthMax[i]);
		trapWater+=waterlevel-heigth[i];	
		}
		
		
		return trapWater;
	}
	public static void main(String[] args) {
		int heigth[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(trap(heigth));
	}

}
