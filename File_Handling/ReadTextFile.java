package File_Handling;
import java.io.*;
public class ReadTextFile
{

	public static void main(String[] args) 
	{
		//Name of file to open
		String fileName = "temp.txt";
		
		String line = null;
		
		BufferedReader bufferedReader = null;
		
		try
		{
			//FileReader reads text files in default encoding.
			FileReader fileReader = new FileReader(fileName);
			
			//Always wrap FileReader in BufferedReader
			bufferedReader = new BufferedReader(fileReader);
			
			while((line= bufferedReader.readLine())!= null)
			{
				System.out.println(line);
			}	
		}
	
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
			//Close files
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
}
