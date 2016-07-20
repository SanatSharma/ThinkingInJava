package Polymorphism;
import java.util.*;
class Shape 
{
	public void draw() {}
	public void erase() {}
} 
class Circle extends Shape 
{

	public void draw() 
	{
		System.out.println("Circle.draw()"); 
	}
	public void erase() 
	{
		System.out.println("Circle.erase()"); 
	}
} 
class Square extends Shape 
{
	public void draw()
	{
		System.out.println("Square.draw()"); 
	}
	public void erase() 
	{
		System.out.println("Square.erase()"); 
	}
} 
class Triangle extends Shape 
{
	public void draw() 
	{
		System.out.println("Triangle.draw()"); 
	}
	public void erase() 
	{
		System.out.println("Triangle.erase()"); 
	}
} 
class Cube extends Shape 
{
	public void draw() 
	{
		System.out.println("Cube.draw()"); 
	}
	public void erase() 
	{
		System.out.println("Cube.erase()"); 
	}
} 

public class Shapes
{

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n;
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.print("1.Circle\n2.Square\n3.Triangle\nEnter choice: ");
			n = s.nextInt();
			switch(n) 
			{
				case 1: 
						new Circle().draw();
						continue;
				case 2: new Square().draw();
						continue;
				case 3: new Triangle().draw();
						continue;
				case 4 : new Cube().draw();
						continue;
				default : break;
			}
		}
		while(n<5);
		new Circle().erase();
		new Square().erase();
		new Triangle().erase();
		new Cube().erase();
		
	}
}
/* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
*/
/*public Shape next() 
{
}
*/
/*Shape[] s = new Shape[9];
// Fill up the array with shapes:
for(int i = 0; i < s.length; i++)
{
	s[i] = gen.next();
}
	// Make polymorphic method calls:
for(Shape shp : s)
{
	shp.draw();
}
*/