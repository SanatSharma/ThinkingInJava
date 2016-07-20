package LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortingUsingComparator 
{
	public static void main(String[] args)
	{
//		SortingUsingComparator s = new SortingUsingComparator();
		LinkedList<Empl> list = new LinkedList<Empl>();
		list.add(new Empl("Ram",3000));
		list.add(new Empl("John",6000));
		list.add(new Empl("Crish",2000));
		list.add(new Empl("Tom",2400));
		Collections.sort(list,new MyNameComp());
		System.out.println("Sorted list entries: ");
		System.out.println("Sorted elemetns based on names in ascending order:");
		for(Empl e:list){
			System.out.println(e);
		}
		
		System.out.println("\nSorted elements based on salary in descending order:");
		Collections.sort(list, new MySalaryComp());
		for(Empl e: list)
			System.out.println(e);
	}
	
	static class MyNameComp implements Comparator<Empl>
	{
		public int compare(Empl e1, Empl e2) {
			if(e1.getName().charAt(0) > e2.getName().charAt(0))
				return 1;
			else
				return -1;
		}			
	}
	
	static class MySalaryComp implements Comparator<Empl>
	{
		public int compare(Empl e1, Empl e2)
		{
			if(e1.getSalary()<e2.getSalary())
				return 1;
			else
				return -1;
		}

	}
	
	static class Empl
	{
		private String name;
		private int salary;
		
		public Empl(String name, int salary)
		{
			this.name = name;
			this.salary = salary;
		}
		public int getSalary()
		{	return salary;}
		
		public String getName()
		{	return name;}
		
		public void setName(String name)
		{ this.name = name;}
		
		public void setSalary(int salary)
		{ this.salary = salary;}
		
		public String toString()
		{
			StringBuilder s = new StringBuilder();			
			s.append(String.format("%s %6s %13s %d","Name: ",this.name,"Salary: ",this.salary));
			return s.toString();
		}
	}
}
