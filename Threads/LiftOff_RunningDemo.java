package Threads;
//Demonstration of the Runnable interface.
public class LiftOff_RunningDemo implements Runnable 
{
	protected int countDown = 10; // Default
	private static int taskCount = 0;
	private final int id = taskCount++;
	public LiftOff_RunningDemo() {}
	public LiftOff_RunningDemo(int countDown) 
	{
		this.countDown = countDown;
	}
	public String status() 
	{
		return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ") ";
	}
	public void run() 
	{
				
			while(countDown-- > 0) 
			{
				System.out.println(status());
			
				Thread.yield();
			}
		
	}
	public static void main(String[] args)
	{
		//One method
		new Thread(new LiftOff_RunningDemo()).start();
		new Thread(new LiftOff_RunningDemo()).start();
		
		//Other method
		LiftOff_RunningDemo l = new LiftOff_RunningDemo();
		l.run();
	}
}