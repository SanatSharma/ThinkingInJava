package Threads;

class RunnableDemo implements Runnable
{
	private Thread t;
	private String threadName;
	
	RunnableDemo(String name)
	{
		threadName= name;
		System.out.println("Creating " + threadName);
	}
	
	public void run()
	{
		System.out.println("running " + threadName);
		try
		{
			for(int i=4;i>0;i--)
			{
				System.out.println("Thread: "+ threadName + ","+i);
				//Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} 
		catch(InterruptedException e) 
		{
			System.out.println("Thread "+ threadName + "interrupted");
		}
		System.out.println("Thread "+ threadName + " exiting");
	}
	
	public void start()
	{
		System.out.println("Starting " + threadName);
		if(t==null)
		{
			t= new Thread(this, threadName);
			t.start();
			
		}
	}
}
public class CreatingandRunningThread 
{
	public static void main(String[] args)
	{
		
		RunnableDemo r = new RunnableDemo("Thread1");
		r.start();
	
		RunnableDemo r2 = new RunnableDemo("Thread2");
		r2.start();
	}
}
