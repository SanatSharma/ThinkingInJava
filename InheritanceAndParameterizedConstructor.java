//The preceding example has default constructors; that is, they don’t have any arguments.
//It’s easy for the compiler to call these because there’s no question about what arguments to pass.
//If your class doesn’t have default arguments, or if you want to call a base-class constructor that has an argument,
//you must explicitly write the calls to the base-class constructor using the super keyword and the appropriate argument list:
class Game 
{
	Game(int i)//parameterized constructor 
	{
		System.out.println("Game constructor");
	}
}
class BoardGame extends Game 
{
	BoardGame(int i) 
	{
		super(i);
		System.out.println("BoardGame constructor");
	}
}
public class InheritanceAndParameterizedConstructor extends BoardGame 
{
	InheritanceAndParameterizedConstructor()	
	{
		super(11);
		System.out.println("Chess constructor");
	}
	public static void main(String[] args) 
	{
		InheritanceAndParameterizedConstructor x = new InheritanceAndParameterizedConstructor();
	}
}
/* Output:
Game constructor
BoardGame constructor
Chess constructor
*///:~
