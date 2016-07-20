//The protected keyword.
class Villain 
{
	private String ch;
	protected void set(String name) 
	{
		ch= name;
	}
	public Villain(String ch) 
	{
		this.ch = ch; 
	}
	public String toString() 
	{
		return "I’m a Villain and my name is " + ch;
	}
}
public class Inheritance_Protected extends Villain 
{
	private int orcNumber;
	public Inheritance_Protected(String name, int orcNumber) 
	{
		super(name);
		this.orcNumber = orcNumber;
	}
	public void change(String name, int orcNumber) 
	{
		set(name); // Available because it’s protected
		this.orcNumber = orcNumber;
	}
	public String toString() 
	{
		return "Orc " + orcNumber + ": " + super.toString();
	}
	public static void main(String[] args) 
	{
		Inheritance_Protected orc = new Inheritance_Protected("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
} /* Output:
Orc 12: I’m a Villain and my name is Limburger
Orc 19: I’m a Villain and my name is Bob
*///:~