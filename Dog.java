package Strategy;

public class Dog extends Animal{
	int size;
	public Dog(String a, int b,int c)
	{
		super(a,b);
		this.size = c;
	}
	public int get_size()
	{
		return size;
	}
	public void showBehavior(String a)
	{
		strategy.movement(a);
		System.out.println("Additional info in the dog class");
	}
}
