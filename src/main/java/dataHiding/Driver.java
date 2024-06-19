package dataHiding;

public class Driver {
	public static void main(String[] args) {
		
		Student prthm=new Student();
		
		System.out.println(prthm.getid());
		prthm.setid(102);
		System.out.println(prthm.getid());
		
		
	}

}
