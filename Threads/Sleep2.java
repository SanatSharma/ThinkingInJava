package Threads;
import java.util.concurrent.*;
import java.util.*;

//Create a task that sleeps for a random amount of time between 1 and 10 seconds, 
//then displays its sleep time and exits. Create and run a quantity(given on the command line) of these tasks.
public class Sleep2 implements Runnable
{
	private static int taskCount = 0;
	private final int id = taskCount++;
	Random rand = new Random();
	
	public void run()
	{
		try
		{
			int a = rand.nextInt(10);
			System.out.println("Thread " + id + " going to sleep for "+ a + " seconds");
			TimeUnit.SECONDS.sleep(a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
		{
			exec.execute(new Sleep2());
		}
		exec.shutdown();
	}

}
/* Sample Output
Thread 0 going to sleep for 4 seconds
Thread 4 going to sleep for 7 seconds
Thread 1 going to sleep for 8 seconds
Thread 3 going to sleep for 7 seconds
Thread 2 going to sleep for 8 seconds
*/