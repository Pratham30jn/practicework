package interfacee;

public class Sdriver {
	public static void main(String[] args) {
		
		/*
		 * Shape sh; sh=new Circle(); System.out.println(sh.getArea());
		 */
		AnimalSound snd;
		snd=new Dog();
		System.out.println(snd.sound());
	}

}
