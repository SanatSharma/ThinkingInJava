package File_Handling;
import java.io.*;
public class AppendingFile
{

	public static void main(String[] args) 
	{
		//name of file
		String fileName = "temp.txt";
		
		BufferedWriter bufferedWriter = null;
		
		try
		{
			//the 'true' will give instructions to append the file rather than than overwrite it
			FileWriter fileWriter = new FileWriter(fileName,true);
	
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("We are f***ing appending this file motherf***er");
		}
		
		catch(IOException e)
		{
			System.out.println("Error in appending file '" + "'");
		}
		
		finally
		{
			try
			{
				if(bufferedWriter!= null)
				{
					bufferedWriter.close();
				}
			}
			catch(Exception ex)
			{}
		}
	}

}
