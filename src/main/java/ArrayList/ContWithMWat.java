package ArrayList;

import java.util.ArrayList;

public class ContWithMWat {
	public static int maxW(ArrayList<Integer> heigth) {
		int maxWater=Integer.MIN_VALUE;
		int level=0;
		//Two pointer approach
		int lp=0;
		int rp=heigth.size()-1;
		while(lp<rp) {
			int he=Math.min(heigth.get(lp), heigth.get(rp));
			int w=rp-lp;
			level=w*he;
			maxWater=Math.max(maxWater, level);
			if(heigth.get(lp)<heigth.get(rp)) {
				lp++;
			}else {
				rp--;
			}
			
			 
		}
		// Brute force aopproach.
		
		/*
		 * for(int i=0;i<heigth.size();i++) { for(int j=i+1;j<heigth.size();j++) { int
		 * he=Math.min(heigth.get(i), heigth.get(j)); int width=j-i; level=width*he; }
		 * if(level>maxWater) { maxWater=level; } }
		 */	return maxWater;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(7);
		System.out.println(maxW(list));
	}

}
