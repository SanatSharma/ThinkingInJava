package Threads;
import java.util.concurrent.*;
public class FixedThreadPool 
{
	public static void main(String[] args) 
	{
		//Constructor argument is number of threads:
		ExecutorService exec = Executors.newFixedThreadPool(3);
		for(int i = 0; i < 5; i++)
		{
			exec.execute(new LiftOff());
		}
		
		exec.shutdown();
	}
} 
/* Output: (Sample)
#0(9) 
#3(9) 
#1(9) 
#2(9) 
#1(8) 
#3(8) 
#0(8) 
#4(9) 
#0(7) 
#4(8) 
#3(7) 
#1(7) 
#2(8) 
#1(6) 
#3(6) 
#4(7) 
#0(6) 
#4(6) 
#3(5) 
#1(5) 
#2(7) 
#1(4) 
#3(4) 
#4(5) 
#0(5) 
#4(4) 
#3(3) 
#1(3) 
#2(6) 
#1(2) 
#3(2) 
#4(3) 
#0(4) 
#0(3) 
#4(2) 
#3(1) 
#1(1) 
#2(5) 
#0(2) 
#3(Liftoff!) 
#4(1) 
#0(1) 
#2(4) 
#1(Liftoff!) 
#4(Liftoff!) 
#0(Liftoff!) 
#2(3) 
#2(2) 
#2(1) 
#2(Liftoff!) 
*///;