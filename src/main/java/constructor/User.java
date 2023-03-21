package constructor;

public class User {

	
	  String name; int id; private static User user; public static int count=0;
	  
	  private User(int id, String name) { System.out.println("Inside constructor");
	  this.name=name; this.id=id; count++; }
	  
	  public static User getUserObject(int id,String name) { if(user==null) {
	  user=new User(id,name); return user ; }else { return user; }
	  
	  }

}
