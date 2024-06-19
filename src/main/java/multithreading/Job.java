package multithreading;

public class Job extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Pratham "+Thread.currentThread().getName());		
		}
		
		
		
	
	}
	
	
	
	
	
	
	
	/*
	 * public void whitewash() { System.out.println("Doing -whitewash");
	 * System.out.println(Thread.currentThread().getName()); }
	 */
}
