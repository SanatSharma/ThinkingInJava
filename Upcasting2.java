//Create a Upcasting2 class, with subclasses Unicycle, Bicycle and Tricycle.
//Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
class Unicycle 
{
	Unicycle()
	{
		System.out.println("Sitting on a unicycle");
	}
	static void ride(Unicycle u)
	{
		System.out.println("I'm riding a unicycle " + u);
	}
}
class Bicycle 
{
	Bicycle()
	{
		System.out.println("Sitting on a Bicycle");
	}
	static void ride(Bicycle b)
	{
		System.out.println("I'm riding a bicycle " + b);
	}
}
class Tricycle
{
	Tricycle()
	{
		System.out.println("Sitting on a tricycle");
	}
	static void ride(Tricycle t)
	{
		System.out.println("I'm riding a tricycle " + t);
	}
}

public class Upcasting2 
{
	public static void main(String[] args)
	{
		Upcasting2 up = new Upcasting2();
		Unicycle uni = new Unicycle();
		Bicycle bi = new Bicycle();
		Tricycle tri = new Tricycle();
		//uni.ride(up);
	//	bi.ride(up);
	//	tri.ride(up);
	}
}
