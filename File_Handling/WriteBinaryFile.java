package File_Handling;
import java.io.*;

public class WriteBinaryFile 
{
	public static void main(String[] args)
	{
		//The name of the file to open
		String fileName = "file.txt";
		BufferedWriter bufferedWriter= null;
		try
		{
			//Assuming default encoding 
			FileWriter fileWriter = new FileWriter(fileName);
			
			//Always wrap FileWriter in BufferedWriter
			bufferedWriter = new BufferedWriter(fileWriter);
			
			//Note that write() does not automatically append a newline character
			bufferedWriter.write("Hello World. Let me tell you something\n");
			bufferedWriter.write("The world is becoming a more open place\n");
			bufferedWriter.write("People are becoming more accepting\n");
			bufferedWriter.write("This is amazing!!\n");
			bufferedWriter.write("We are understanding each other and working wih each other\n");
			bufferedWriter.write("HORRAY!");
		}
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
	
}
