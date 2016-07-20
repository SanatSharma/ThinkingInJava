package Threads;
import java.util.concurrent.*;
public class SingleThreadExecutor 
{
	public static void main(String[] args) 
	{
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i=0;i<4;i++)
		{
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}
}
/* Output
#0(9) 
#0(8) 
#0(7) 
#0(6) 
#0(5) 
#0(4) 
#0(3) 
#0(2) 
#0(1) 
#0(Liftoff!) 
#1(9) 
#1(8) 
#1(7) 
#1(6) 
#1(5) 
#1(4) 
#1(3) 
#1(2) 
#1(1) 
#1(Liftoff!) 
#2(9) 
#2(8) 
#2(7) 
#2(6) 
#2(5) 
#2(4) 
#2(3) 
#2(2) 
#2(1) 
#2(Liftoff!) 
#3(9) 
#3(8) 
#3(7) 
#3(6) 
#3(5) 
#3(4) 
#3(3) 
#3(2) 
#3(1) 
#3(Liftoff!) 
*/