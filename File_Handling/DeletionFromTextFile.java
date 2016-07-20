package File_Handling;
import java.io.*;
//1) First we need to create a file and write some data into it before deleting data.
//2) Now we create a create a temporary file
//3) Except the data we want to delete, we transfer all data into this new file
//4) We delete the old file and rename the temporary file as the original file
//5) Voila, we have now seemingly deleted data from the original data(when in fact we have simple transferred data
public class DeletionFromTextFile 
{
	static String fileName = "Batman.txt";
	//We will first create  file and store data in it
	void createFile()
	{
		//Name of text file
		
		//WAR is not for the weak. I am not a coward to shirk away from hard labor. Today we dine in HELL! so pucker up fat suckers and get ready for the ultimate day of your worthless lives. Anybody with any objection can speak up now. We have reached the point of no return!! Fulfill your duty to your country and fight! Fight for your families, fight for honor and glory but most importantly, fight for NARNIA!!!!!!!! ahoo !! ahoo!! ahoo!!
		
				
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
			bufferedWriter.write("Eyy, i'm so gonna delete this line\n\n");
			bufferedWriter.flush();
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
	void show()
	{
		
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
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
	
	void deleteFromFile(String file, String lineToRemove)
	{
		try
		{
			File inFile = new File(file);
			
			if(!inFile.isFile())
			{
				System.out.println("Entered file does not exist");
				return;
			}
		
			System.out.println("Deleting '" + lineToRemove + "' from file '"+ file + "'\n\n"  );
			//Constructing temporary file that will later be renamed into the original file
			File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
			
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			PrintWriter p = new PrintWriter(new FileWriter(tempFile));
			
			String line= null;
			
			//Transfering all data into temp file,except the data we want to delete
			while((line= bufferedReader.readLine())!=null)
			{
				if(!line.trim().equals(lineToRemove))
				{
					p.println(line);
					p.flush();
				}
			}
			
			p.close();
			bufferedReader.close();
			
			//Delete the original file
			if(!inFile.delete())
			{
				System.out.println("Could not delete file");
				return;
			}
			
			//Rename the new file to the filename the original had
			if(!tempFile.renameTo(inFile))
			{
				System.out.println("Could not rename file");
				return;
				
			}
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args)
	{
		DeletionFromTextFile d = new DeletionFromTextFile();
		d.createFile();
		d.show();
		d.deleteFromFile(fileName, "Eyy, i'm so gonna delete this line");
		d.show();
	}
}
