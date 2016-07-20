//Create a class with a method that is overloaded three times. Inherit a new class, 
//add a new overloading of the method, and show that all four methods are available in the derived class.
class Food
{
	void eat()
	{
		System.out.println("This is func with no params");
	}
}
class Table extends Food
{
	void eat(char c)
	{
		System.out.println("this is func with char param " + c );
	}
	void eat(int c)
	{
		System.out.println("this is func with int param " + c);
	}
}
public class IInheritanceAndMethodOverloading 
{
	
	public static void main(String[] args)
	{
		Table t = new Table();
		t.eat(24);
		t.eat('a');
		t.eat();
	}
}
/*Output:-
this is func with int param 24
this is func with char param a
This is func with no params
*/