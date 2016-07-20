package Threads;
//(2) Implement a Runnable. Inside run( ), print a message, and then call yield( ). 
//Repeat this three times, and then return from run( ).
//Put a startup message in the constructor and a shutdown message when the task terminates. 
//Create a number of these tasks and drive them using threads.
public class RunnableDemo2 implements Runnable
{
	private static int taskCount = 0;
	private final int id = taskCount++; 
	RunnableDemo2()
	{
		System.out.println("START MESSAGE");
		
	}
	public void run()
	{
		 System.out.println("#"+ id + "(we are inside the run() function)");
		 Thread.yield();
	}
	public static void main(String[] args) 
	{
		Thread t = new Thread(new RunnableDemo2());
		t.start();
		new Thread(new RunnableDemo2()).start();
		
	}
	
}
