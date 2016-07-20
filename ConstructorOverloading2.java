
public class ConstructorOverloading2 
{
	ConstructorOverloading2()
	{
		System.out.println("Default Constuctor");
	}
	ConstructorOverloading2(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		ConstructorOverloading2 c = new ConstructorOverloading2();
		ConstructorOverloading2 co = new ConstructorOverloading2("Parameterized constructor");
	}

}
