package inheritence;

public class CodeRunner {
	public static void main(String[] args) {
		
		Customer cstm=new Customer();
		cstm.logIn();
		cstm.name="Pratham Jain";
		System.out.println("Customer name is>>"+cstm.name);
		cstm.bookCab();
		
		
		UserApp usr=new Customer();
		Splender sp=new Splender();// This is multilevel inheritance.
		
		
	}

}
