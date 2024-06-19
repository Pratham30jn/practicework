package ArrayList;

import java.util.ArrayList;

public class Functions {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> lst=new ArrayList<>();
		// Simple add function
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		// If to add at particular index;
	//	lst.add(1, 5);
    	System.out.println(lst);
		// Get Function
    	System.out.println(lst.get(1));
    	// Set function
    	lst.set(1, 10);
    	System.out.println(lst);
    	// contain function
    	}

}
