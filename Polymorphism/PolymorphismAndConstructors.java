package Polymorphism;
class Meal
{
	Meal()
	{
		System.out.println("Meal");
	}
}
class Breakfast extends Meal
{	
	Breakfast()
	{
		System.out.println("Breakfast");
	}
}
class Bread 
{
	int a, b;
	Bread()
	{
		System.out.println("Bread");
	}
	Bread(int l,int k)
	{
		a=l;b=k;
	}
}
class Cheese
{
	Cheese()
	{
		System.out.println("Cheese");
	}
}
class Lettuce
{
	Lettuce()
	{
		System.out.println("Lettuce");
	}
}
class Juice
{
	Juice()
	{
		System.out.println("Juice");
	}
}

public class PolymorphismAndConstructors  extends Breakfast
{
	Bread b = new Bread();
	Cheese c = new Cheese();
	Lettuce l = new Lettuce();
	Juice j = new Juice();
	PolymorphismAndConstructors()
	{
		System.out.println("Eat!!");
	}
	public static void main(String[] args)
	{
		new PolymorphismAndConstructors();
	}
	
}
