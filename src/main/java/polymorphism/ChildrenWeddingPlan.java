package polymorphism;

public class ChildrenWeddingPlan extends ParentsWeddingPlan {
	
	public void marry() {
		System.out.println("Child weds where child wants");
	}
	public static void main(String[] args) {
		ParentsWeddingPlan prnt=new ParentsWeddingPlan();
		
		prnt.marry();
		
	}

}
