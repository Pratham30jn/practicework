package ArrayList;

import java.util.ArrayList;

public class Monotonic {
	public static boolean mono(	ArrayList<Integer> l) {
		boolean a=false;
		int i=0;
		while(i<l.size()-1) {
			if(l.get(i)<=l.get(i+1)) {
				a= true;
				i++;
				}else if(l.get(i)>=l.get(i+1)) {
					a= true;
					i++;
				}
			
				else {
					a=false;
					break;
				}
	
		}
		return a;
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(3);
		System.out.println(mono(l));
	}
}
