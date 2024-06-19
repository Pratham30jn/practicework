package String;

public class StrBuldr {
	
	public static void main(String[] args) {	
		//StringBuffer sb= new StringBuffer("pratham");
		StringBuilder sb=new StringBuilder("");
		// This append not possible in case of String because they are
		// immutable. Means kuch bhi append nhi hoga har bar naya object bnega.
		// Now if want to convert sb into string we can write sb.toString.
		for(char ch='a';ch<='z';ch++) {
			sb.append(ch);
		}// in this case timeCOmplexity is O(26);
		// But in similar case is string was used then O(26*26);
		sb.toString();
		System.out.println(sb);
	}

}
