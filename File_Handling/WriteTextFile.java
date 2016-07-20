package File_Handling;
import java.io.*;
public class WriteTextFile 
{

	public static void main(String[] args) 
	{
		//Name of text file
		String fileName = "temp.txt";
		
		BufferedWriter bufferedWriter = null;
		
		try
		{
			//Assuming default encoding
			FileWriter fileWriter = new FileWriter(fileName);
			
			//Encapsulating FileWriter inside BufferedWriter
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Hello World. Let me tell you something\n");
			bufferedWriter.write("The world is becoming a more open place\n");
			bufferedWriter.write("People are becoming more accepting\n");
			bufferedWriter.write("This is amazing!!\n");
			bufferedWriter.write("We are understanding each other and working wih each other\n");
			bufferedWriter.write("HORRAY!");
			bufferedWriter.newLine();
			bufferedWriter.write("So get the hell lost Son\n");
		}
		catch(IOException e)
		{
			System.out.println("Soory error encountered in opening file '" + "'");
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
			catch(IOException e)
			{}
		}
	}	

}
