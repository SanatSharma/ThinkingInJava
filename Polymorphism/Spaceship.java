package Polymorphism;
//Q. Following the example in Transmogrify.java, create a Starship class containing an AlertStatus reference
//that can indicate three different states. Include methods to change the states.

class AlertStatus
{
	public void alert(){}
}
class Alarm extends AlertStatus
{
	public void alert()
	{
		System.out.println("ALARM!! Run to the safety pods");
		
			
		
	}
}
class Safe extends AlertStatus
{
	public void alert()
	{
		System.out.println("Everything is safe and sound. No reason to worry");
	}
}
class Alert extends AlertStatus
{
	public void alert()
	{
		System.out.println("Movement was seen on the left brig. Civilians lock your doors and security personnel to flank from all sides");
	}
}
class Response
{
	AlertStatus a = new Safe();
	public void change1()
	{
		a = new Alert();
	}
	public void change2()
	{
		a= new Alarm();
	}
	public void response()
	{
		a.alert();
	}
}
public class Spaceship
{
	public static void main(String[] args)
	{
		Response r = new Response();
		r.response();
		r.change1();
		r.response();
		r.change2();
		r.response();
	}
}
