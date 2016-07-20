
/*Create a class called Root that contains an instance of each of the classes (that you also create) named Component1, 
 Component2, and Component3. Derive a class Inheritance2 from Root that also contains an instance of each “component.”
  All classes should have default constructors that print a message about that class.
*/
class Component1
{
	Component1(int h)
	{
		System.out.println("Inside Component1 ");
	}
}
class Component2
{
	Component2(int a)
	{
		System.out.println("Inside component2");
	}
}
class Component3
{
	Component3(int i)
	{
		System.out.println("Inside component3");
	}
}
class Root
{
	Component1 c = new Component1(2);
	Component2 d = new Component2(11);
	Component3 e = new Component3(22);
	Root(int i)
	{
		System.out.println("Inside Root class");
	}
}
public class Inheritance2 extends Root
{
	Inheritance2()
	{	
		super(234);
		System.out.println("This is Inherttance2 looking to make a statement. ");
	}
	public static void main(String[] args)
	{
		
		Inheritance2 i = new Inheritance2();
	}
}
/*Output
Inside Component1 
Inside component2
Inside component3
Inside Root class
This is Inherttance2 looking to make a statement. 
*/
