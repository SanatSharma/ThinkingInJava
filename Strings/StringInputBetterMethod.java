package Strings;
//: strings/BetterRead.java
import java.util.*;
public class StringInputBetterMethod 
{
	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = stdin.nextLine();
		System.out.println(name);
		System.out.println("How old are you? What is your favorite double?");
		System.out.println("(input: <age> <double>)");
		int age = stdin.nextInt();
		double favorite = stdin.nextDouble();
		System.out.println(age + "\t" + favorite);
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 years you will be %d.\n",age + 5);
		System.out.format("My favorite double is %f.",favorite / 2);
	}
} /* Output:
What is your name?
Sanat Sharma
How old are you? What is your favorite double?
(input: <age> <double>)
17
1.61803
Hi Sanat Sharma.
In 5 years you will be 22.
My favorite double is 0.809015.
*///:~