package Strategy;

public class Animal {
	protected String type;
	protected int id;
	protected Behavior strategy;
	Animal(String a, int b)
	{
		this.type = a;
		this.id = b;
	}
	
	public String get_type() { return type; }
	
	public int get_id(){ return id; } 
	
	public void setBehavior(Behavior strategy)
	{
		this.strategy = strategy;
	}
	
	public void showBehavior(String a)
	{
		strategy.movement(a);
	}
	
}
