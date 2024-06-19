package ArrayList;

import java.util.ArrayList;

public class MultiDimList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
		ArrayList<Integer> lis1=new ArrayList<>();
		ArrayList<Integer> lis2=new ArrayList<>();
		ArrayList<Integer> lis3=new ArrayList<>();
		for(int i=1;i<=5;i++) {
			lis1.add(i*1);//12345
			lis2.add(i*2);//246810
			lis3.add(i*3);//39121518
		}
		mainList.add(lis1);
		mainList.add(lis2);
		mainList.add(lis3);
		//lis2.remove(0);
		System.out.println(mainList);
		//nested loops
		for(int i=0;i<mainList.size();i++) {
			ArrayList<Integer> currlist=mainList.get(i);
			for(int j=0;j<currlist.size();j++) {
				System.out.print(currlist.get(j)+" ");
			}
			System.out.println();
		}
		
	}

}
