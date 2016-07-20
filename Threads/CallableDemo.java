package Threads;
import java.util.*;
import java.util.concurrent.*;
class Demo implements Callable<String>
{
	private int id;
	public Demo(int id)
	{
		this.id = id;
	}
	public String call()
	{
		return "result of DEMO" + id ;
	}
}
public class CallableDemo 
{
	public static void main(String[] args)
	{
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i=0;i<10;i++)
		{
			results.add(exec.submit(new Demo(i)));
		}
		for(Future<String> fs : results)
		{
			try
			{
				System.out.println(fs.get());
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
				return;
			}
			catch(ExecutionException e)
			{
				System.out.println(e);
				return;
			}
			finally
			{
				exec.shutdown();
			}
		}
	}
}
