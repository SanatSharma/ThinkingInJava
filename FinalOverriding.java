//Create a class with a final method. Inherit from that class and attempt to overwrite that method.
class First
{
	/*final void f()
	{
		System.out.println("this is a final method in First");
	}
	*/ 
	//this method is not possible as final cannot be overriden. It is assigned once and we cannot changen its value
}
	
public class FinalOverriding extends First
{
	public static void main(String[] args)
	{
		FinalOverriding f= new FinalOverriding();
		f.f();
	}	
	public void f()
	{
		System.out.println("this is a final method in FinalOverriding");
	}
}
	