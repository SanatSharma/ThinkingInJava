package File_Handling;
import java.io.*;
import java.util.Scanner;
public class ReadingAndWritingTextFile
{
	static Scanner scan = new Scanner(System.in);

	//Name of file
	static String fileName = "thuglyfe.txt";
		
	static String line = null;
		
	//Function to write file
	static void write()
	{
		BufferedWriter bufferedWriter = null;
		try
		{
			
			//Assuming default encoding
			FileWriter fileWriter = new FileWriter(fileName);
			
			//Enclosing within BufferedReader and BufferedWriter
			bufferedWriter = new BufferedWriter(fileWriter);
			
			
			//Writing data
			System.out.println("Please enter your name: ");
			String name = scan.next();
			bufferedWriter.write(name);
			bufferedWriter.newLine();
	
			System.out.println("Enter your age: ");
			int age = scan.nextInt();
			bufferedWriter.write(Integer.toString(age));
			bufferedWriter.newLine();
			
					
			System.out.println("Enter your city of residence: ");
			String city = scan.next();
			bufferedWriter.write(city);
			
			bufferedWriter.flush();
			System.out.println("Data saved");
			
		}
		
		//Checking for exceptions
		catch(IOException ex)
		{
			System.out.println("Error in writing to file'" + fileName +"'");
		}
		
		finally
		{
			//to close files
			try
			{
				if(bufferedWriter != null)
				{
					bufferedWriter.close();
				}
			}
			catch(IOException e)
			{
			}
		}
	}
	
	//Function to read file
	static void read()
	{
		 BufferedReader bufferedReader = null;
		
		try
		{
			//Assuming default encoding
			FileReader fileReader = new FileReader(fileName);
			
			//Enclosing FileReader within BufferedReader
			bufferedReader = new BufferedReader(fileReader);
			
			//Printing out the data
			while((line= bufferedReader.readLine())!= null)
			{
				System.out.println(line);
			}
		}
		
		//Checking for exceptions
		catch(FileNotFoundException ex)
		{
			System.out.println("Unable to open file '" + fileName + "'");
		}
		catch(IOException e)
		{
			System.out.println("Error reading file '"+ fileName +"'");
			//we could also do this with ex.printStackTrace();
		}
		
		finally
		{
			//to close files
			try
			{
				if(bufferedReader != null)
				{
					bufferedReader.close();
				}
			}
			catch(IOException e)
			{
			}
		}
		 
			
	}
	
	//Function to search data from file
	static void search()
	{
		
		BufferedReader bufferedReader = null;
		
		try
		{
			int c=0;
			System.out.println("Enter data to search: ");
			
			String word = scan.next();
			
			bufferedReader = new BufferedReader(new FileReader(fileName));
			
			while((line = bufferedReader.readLine())!=null)
			{
				String[] s = line.split(" ");
				
				for(String w1 : s)
				{
					if (w1.matches(word))
					{
						System.out.println("Found record for "+ word);
						
						//Increasing value of c to check at the end
						c++;
						break;
					}
				}
			}
			
			if(c==0)
			{
				System.out.println("Record not found for "+ word);
			}
		}
		
		//Checking for exceptions
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			//to close files
			try
			{
				if(bufferedReader != null)
				{
					bufferedReader.close();
				}
			}
			catch(IOException e)
			{
			}
		}
		 
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome");
		int n;
		do
		{
			
			System.out.println("1. Enter Data\n2. Read Data\n3. Search Data\n4. Exit\nPlease enter your choice: ");
			 n= scan.nextInt();
			switch(n)
			{
				case 1 : write();
						break;
				
				case 2 : read();
						break;
				
				case 3 : search();
						break;
				default : System.exit(0);
			}
		}
		while(n<4);
	}
}
