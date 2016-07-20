package Threads;
import java.util.*;
class SampleThread extends Thread
{
	private static Scanner scan = new Scanner(System.in);
	public void run()
	{
	
		for(int i=0;i<10;i++)
		{
			try{
				Thread.sleep(10);
			} catch(Exception e){
			}
			JoiningThreads.names.add(getName());
		}
	}
}
public class JoiningThreads 
{
	static Scanner scan = new Scanner(System.in);
	public static List<String> names = new ArrayList<String>();
	public static void main(String[] args) 
	{
		List<SampleThread> list = new ArrayList<SampleThread>();
		for(int i=0;i<5;i++)
		{
			SampleThread s = new SampleThread();
			list.add(s);
			s.start();
		}
		
		for(SampleThread st : list)
		{
			try{
				st.join();
			} catch(Exception e){}
			
		}
		System.out.println(names);
	}

}
