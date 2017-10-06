package Strategy;

public class Main {
	public static void main(String[] args) {
		System.out.println("Testing");
		Animal a = new Animal("Quan",1);
		a.setBehavior(new runbehavior());
		a.showBehavior("Testing strategy");
		
		Animal b = new Animal("Quan2",2);
		b.setBehavior(new jumpbehavior());
		b.showBehavior("Testing strategy");
		
		Dog dog = new Dog("Doggggggg",5,10);
		dog.setBehavior(new jumpbehavior());
		dog.showBehavior("this is quantesting");
	}
}
