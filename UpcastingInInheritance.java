//Create a class called Amphibian. From this, inherit a class called Frog. Put appropriate methods in the base class. 
//In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
class Amphibian
{
	Amphibian()
	{
		System.out.println("we're gonna try upcasting");
	}
	static void see(Amphibian a)
	{
		System.out.println("we have upcasted object " + a);
		a.sing();
	}
	public void sing()
	{
		System.out.println("I shall now proceed to sing a song by the baetles: \nIts been a hard days night\nand ive been working like a dog\nits been a hard days night\nI should be sleeping like a log");
	}
}
	
public class UpcastingInInheritance extends Amphibian
{
	public static void main(String[] args)
	{
		UpcastingInInheritance up = new UpcastingInInheritance();
		Amphibian.see(up);//upcasting
	}
		

}
