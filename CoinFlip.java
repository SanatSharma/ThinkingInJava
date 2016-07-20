import java.util.*;
public class CoinFlip 
{


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Random rand= new Random();
		int i;
		i= rand.nextInt(2);
		if(i==0)
		{
			System.out.println("Result is Tail");
		}
		else if(i==1)
		{
			System.out.print("result is Head");
		}
	
	}

}
