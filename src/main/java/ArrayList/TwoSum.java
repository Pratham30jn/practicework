package ArrayList;

import java.util.ArrayList;

public class TwoSum {
	public static boolean pairSum(ArrayList<Integer> list, int target) {
		// Two pointer approach for sorted array.
		int lp=0;
		int rp=list.size()-1;
		while(lp!=rp) {
			if(list.get(lp)+list.get(rp)==target) {
				return true;
			}else if(list.get(lp)+list.get(rp)<target) {
				lp++;
			}else if(list.get(lp)+list.get(rp)>target) {
				rp--;
			}
		
			
		}
		
		
		return false;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		//Sorted array list
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println(pairSum(list,6));
		System.out.println(pairSum(list,10));
	}

}
