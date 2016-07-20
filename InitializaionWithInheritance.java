
//: reusing/Beetle.java
//The full process of initialization.
class Insect 
{
	private int i = 9;
	protected int j;
	Insect() 
	{
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s) 
	{
	System.out.println(s);
	return 47;
	}
}
public class InitializaionWithInheritance extends Insect 
{
	private int k = printInit("InitializaionWithInheritance.k initialized");
	public InitializaionWithInheritance() 
	{
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 = printInit("static InitializaionWithInheritance.x2 initialized");
	public static void main(String[] args) 
	{
		System.out.println("Beetle constructor");
		InitializaionWithInheritance b = new InitializaionWithInheritance();
	}
} /* Output:
static Insect.x1 initialized
static Beetle.x2 initialized
Beetle constructor
i = 9, j = 0
Beetle.k initialized
*/

