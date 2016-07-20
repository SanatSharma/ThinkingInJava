package LinkedList;

import java.util.LinkedList;

public class ToyCode {
	public static void main(String[] args)
	{
		LinkedList<Double> temp = new LinkedList<Double>();
		temp.add(12.22);
		temp.add(420.0);
		temp.add(21.090);
		temp.add(34.0);
		System.out.println(total2(temp));
		
	}
	public static double total2(LinkedList<Double> list) 
	{
		double total = 0.0;
		for(double d : list)
			total += d;
		return total;
	}
}
