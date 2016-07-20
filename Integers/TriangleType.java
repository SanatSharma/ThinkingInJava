package Integers;
import java.util.*;
/*Write a method called printTriangleType that accepts three integer arguments representing the lengths of the sides of a triangle and prints what type of triangle it is. The three types are equilateral, isosceles, and scalene. An equilateral triangle has all three sides the same length, an isosceles triangle has two sides the same length, and a scalene triangle has three sides of different lengths. Here are some example calls to printTriangleType:

printTriangleType(5, 7, 7);
printTriangleType(6, 6, 6);
printTriangleType(5, 7, 8);
printTriangleType(12, 18, 12);
The output produced should be the following:

isosceles
equilateral
scalene
isosceles
*/
public class TriangleType 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("enter 3 numbers to form a triangle: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		typeTraingle(a,b,c);
	}
	
	public static void typeTraingle(int a , int b, int c)
	{
		if(a==b && b==c)
		{
			System.out.println("Equilateral");
		}
		else if(a==b||b==c||a==c)
		{
			System.out.println("Isosceles");
		}
		else
		{
			System.out.println("Scalene");
		}
	}
}
