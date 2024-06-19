package multithreading;

public class TestJob {
	
	public static void main(String[] args) {
		
		Job t1=new Job();
		Job t2=new Job();
		Job t3=new Job();
		Job t4=new Job();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		/*
		 * Job jb=new Job(); jb.whitewash();
		 */
		
		//System.out.println(Thread.currentThread().getName());
		//
		System.out.println(t2.getName());
	}

}
