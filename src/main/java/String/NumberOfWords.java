package String;

public class NumberOfWords {
	public static void main(String[] args) {
		//String[] str= {"hello","World","Pratham"};
		//System.out.println(str[2]);
		//char ch[]= {'a','c','a'};
		String s= "My name is pratham";
		int count =1;
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count+"-Words in the String");
	
	}

}
