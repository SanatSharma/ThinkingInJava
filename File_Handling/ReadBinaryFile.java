package File_Handling;
import java.io.*;

public class ReadBinaryFile 
{
	public static void main(String[] args)
	{
		//The name of the file to open
		String fileName = "file.txt";
		FileInputStream inputStream = null;
		
		try
		{
			//Use this for reading the data
			byte[] buffer = new byte[1000];
			
			inputStream = new FileInputStream(fileName);
		// read fills buffer with data and returns the number of bytes read(which may be less than the buffer size but can never be more)
		
			int total = 0;
			int nRead = 0;
			
			while((nRead = inputStream.read(buffer))!= -1)
			{
				//Convert yo string so we can display it.
				//Note : of course we can't do this with a real binary file.
				System.out.println(new String(buffer));
				total = total + nRead;
			}
			
			System.out.println("Read "+ total + " bytes");
			
		}
		
		catch(FileNotFoundException ex)
		{
			System.out.println("Unable to open file '"+ fileName + "'");
		}
		
		catch(IOException ex)
		{
			System.out.println("Error reading file '"+ fileName + "'");
		}
		
		finally
		{
			//to close files
			
			try
			{
				if(inputStream != null)
				{
					inputStream.close();
				}
			}
			catch(IOException e)
			{
			}
		}
	}
	
}
