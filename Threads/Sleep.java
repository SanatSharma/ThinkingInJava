package Threads;
import java.util.concurrent.*;

public class Sleep extends LiftOff
{

	public void run()
	{
		try
		{
			while(countDown-->0)
			{
				System.out.println(status());
				
				//the older to put a thred to sleep: Thread.sleep(100);
				
				//the newer method is :
				TimeUnit.MILLISECONDS.sleep(100);
			}
		}
		catch(InterruptedException e)
		{
			System.err.println("Interrupted");
		}
	}
	public static void main(String[] args) 
	{
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
		{
			exec.execute(new Sleep());
		}
		exec.shutdown();
	}

}
/* Output
#0(9) 
#4(9) 
#3(9) 
#1(9) 
#2(9) 
#2(8) 
#0(8) 
#4(8) 
#1(8) 
#3(8) 
#2(7) 
#4(7) 
#0(7) 
#3(7) 
#1(7) 
#2(6) 
#3(6) 
#1(6) 
#0(6) 
#4(6) 
#2(5) 
#0(5) 
#3(5) 
#1(5) 
#4(5) 
#2(4) 
#4(4) 
#0(4) 
#1(4) 
#3(4) 
#2(3) 
#1(3) 
#0(3) 
#4(3) 
#3(3) 
#3(2) 
#4(2) 
#0(2) 
#1(2) 
#2(2) 
#1(1) 
#0(1) 
#2(1) 
#3(1) 
#4(1) 
#3(Liftoff!) 
#0(Liftoff!) 
#1(Liftoff!) 
#2(Liftoff!) 
#4(Liftoff!) 
*/