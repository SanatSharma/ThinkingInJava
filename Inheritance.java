import java.util.*;
class Student 
{
	public final static int num_tests=3;
	private String myName;
	private int[] myTests;
	private String myGrade;
	//Constructors
	public Student()
	{
		myName= "";
		myTests = new int[num_tests];
		myGrade="";
		show();
	}
	public Student(String name, int[] tests)
	{
		myName= name;
		myTests = tests;
		myGrade=computeGrade();
		show();
	}
	//Accessors
	public String getName()
	{
		return myName;
	}
	public String getGrade()
	{
		return myGrade;
	}
	public void setGrade(String newGrade)
	{
		myGrade=newGrade;
	}
	public String computeGrade()
	{
		if(myName.equals(""))
		{
			myGrade="No Grade";
		}
		else if(getTestAverage()>=65)
		{
			myGrade="PASS";
		}
		else
		{
			myGrade="FAIL";
		}
		
		return myGrade;
	}
	public double getTestAverage()
	{
		double total=0;
		for(int score: myTests)
		{
			total = total + score;
		}
		double avg = total/num_tests;
		return avg;
	}
	public void show()
	{
		System.out.println("The information is as follows:\nName: " + myName);
		System.out.print("Marks : ");
		for(int i=0;i<3;i++)
		{
			System.out.println(myTests[i]);
		}
		System.out.println("Average marks : " + getTestAverage());
		System.out.println("Grade obtained : " + myGrade);
	}

}

class Undergrad extends Student
{
	public Undergrad()
	{
		super();
	}
	public Undergrad(String name, int[] tests)
	{
		super(name,tests);
	}
	
	public String computeGrade()
	{
		if(getTestAverage()>=70)
		{
			setGrade("PASS");
		}
		else
		{
			setGrade("FAIL");
		}
		return getGrade();
	}
	
}

class Graduate extends Student
{
	private int myGradID;
	public Graduate()
	{
		super();
		myGradID=0;
		System.out.println("your graduation id is : " + myGradID);
	}
	public Graduate(String name, int[] tests, int gradID)
	{
		super(name,tests);
		myGradID = gradID;
		System.out.println("your graduation id is : " + myGradID);
	}
	
	public int getID()
	{
		return myGradID;
	}
	public String computeGrade()
	{
		super.computeGrade();
		
		if(getTestAverage()>=90)
		{
			setGrade("DISTINCTION!");
		}
		return getGrade();
	}
		
}

public class Inheritance
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = in.nextLine();
		System.out.println("enter marks for all 3 tests: ");     
		int[] tests= new int[3];
		for(int i=0;i<3;i++)
		{
			tests[i]= in.nextInt();
		}
		System.out.println("Choose the option that applies to you : 1. Undergraduate\n 2.Graduate student\nEnter '1' or '2' according to you status :");
		int n = in.nextInt();
		Random rand = new Random();
		int j= rand.nextInt(100);
		if(n==2)
		{
			Graduate g = new Graduate(name,tests, j);
		}
		else if(n==1)
		{
			Undergrad u = new Undergrad(name,tests);
		}
		else
		{
			System.out.println("Sorry, wrong option entered!");
		}
		
	}
}

