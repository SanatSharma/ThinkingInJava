class Report
{
	float marks;
}
public class AliasDuringMethodCalls
{
	static void change(Report r)
	{
		r.marks= 85.25F;
	}
	public void main(String[] args)
	{
		Report a= new Report();
		a.marks= 62.00F;
		System.out.println("marks: " + a.marks);
		change(a);
		System.out.println("marks: " + a.marks);
		
	}
}
/* Output:
1: x.c: a
2: x.c: z
*///:~