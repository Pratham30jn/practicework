package constructor;

public class SigletonPattern {
	public static void main(String[] args) {
		
		
		  User user1=User.getUserObject(10,"Pratham" ); User
		  user2=User.getUserObject(102,"Prathamjn" ); System.out.println(user2.name);
		  System.out.println("Number of object created-:"+user1.count);
		 	 
    }
	

}