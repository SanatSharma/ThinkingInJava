import java.util.*;

//Implement a rotate(Shape) method in Shapes.java, such that it checks to see if it is rotating a Circle (and, if so, doesn’t perform the operation).
/*Modify Shapes.java so that it can "highlight" (set a flag in) all shapes of a particular type.
The toString( ) method for each derived Shape should indicate whether that Shape is "highlighted."*/
//: typeinfo/Shapes.java
abstract class Shape 
{
	
	void draw()
	{ 
		System.out.println(this + ".draw()"); 
		int a = rotate();
		System.out.println(this + " is called " + a + " times");
	}
	public abstract String toString();
	public abstract int rotate();
}
class Circle extends Shape
{
	int flag=0;
	public String toString() 
	{
		return "Circle";
	}
	public int rotate()
	{
		flag++;
		System.out.println(this + " CAN NOT ROTATE");
		return flag;
	}
}
class Square extends Shape 
{
	int flag=0;
	public String toString() 
	{
		return "Square"; 
	}
	public int rotate()
	{
		flag++;
		System.out.println(this + ".rotate()");
		return flag;
	}
	
}
class Triangle extends Shape 
{
	int flag=0;
	public String toString() 
	{
		return "Triangle"; 
	}
	public int rotate()
	{
		flag++;
		System.out.println(this + ".rotate()");
		return flag;
	}
	
}
class Cube extends Shape
{ 
	int flag=0;
	public String toString()
	{
		return "CUBE";
	}
	public int rotate()
	{
		flag++;
		System.out.println(this + ".rotate()");
		return flag;
	}
	
}
public class Hierarchical_Inheritance 
{
	public static void main(String[] args) 
	{
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Cube(), new Circle());
		
		for(Shape shape : shapeList)
		{
			shape.draw();
		}
	}
}
/* Output:
Circle.draw()
Circle CAN NOT ROTATE
Circle is called 1 times
Square.draw()
Square.rotate()
Square is called 1 times
Triangle.draw()
Triangle.rotate()
Triangle is called 1 times
CUBE.draw()
CUBE.rotate()
CUBE is called 1 times
Circle.draw()
Circle CAN NOT ROTATE
Circle is called 1 times

*///:~