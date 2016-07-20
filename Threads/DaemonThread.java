package Threads;
import java.util.concurrent.*;
public class DaemonThread implements Runnable
{
	public void run()
	{
		try
		{
			while(true)
			{
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread());
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("sleep() interrupted");
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			Thread daemon = new Thread(new DaemonThread());
			daemon.setDaemon(true); //This is a necessary step
			daemon.start();
		}
		
		System.out.println("All daemons started");
		TimeUnit.MILLISECONDS.sleep(150);
	}

}
