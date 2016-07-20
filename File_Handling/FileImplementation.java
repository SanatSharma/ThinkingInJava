package File_Handling;
import java.util.*;
import java.io.*;
public class FileImplementation 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a file name: ");
		String fileName = input.nextLine();
		//createFile(fileName,input);
		//lineBasedProcessing(fileName);
		//removalExtraSpaces(fileName);
		//boyGirl(input);
		//tokens(input, fileName);
		integerCount(input,fileName);
	}
	
	public static void createFile(String fileName, Scanner input) throws FileNotFoundException
	{
		PrintWriter print = new PrintWriter(new File(fileName));
		
		print.print("Twas brillig and the slithy toves\n"
				+ "did gyre and gimble in the wabe."
				+ "\nAll mimsey were the borogroves,"
				+ "\nand the mome raths outgrabe."
				+ "\n"
				+ "\n\"Beware the Jabberwock, my son,"
				+ "\nthe jaws that bite, the claws that catch,"
				+ "\nBeware the JubJub bird and shun"
				+ "\nthe frumious bandersnatch\"");
		
		System.out.print("Enter any input you wish to : ");
		String add = input.nextLine();
		print.print(add);

		print.close();
	}
	
	//calculates the total number of characters, lines, length of longest line and prints it out
	public static void lineBasedProcessing(String fileName) throws FileNotFoundException
	{
		int numLines=0;
		int numChars = 0;
		String longestLine = "";
		Scanner file = new Scanner(new File(fileName));
		while(file.hasNextLine())
		{
			String curLine = "";
			Scanner line = new Scanner(file.nextLine());
			numLines++;
			line.useDelimiter("");
			while(line.hasNext())
			{
				numChars++;
				curLine+=line.next();
			}
			if(longestLine.length()<curLine.length())
			{
				longestLine = curLine;
			}
		}
		
		System.out.println("Total lines: " + numLines);
		System.out.println("Total chars: " + numChars);
		System.out.println("Length of longest line : " + longestLine.length());
		System.out.println("Longest Line : " + longestLine);
		System.out.println();
		file.close();
	}
	
	//removes extra spaces from the file output eg. "sanat     sss" gets converted to "sanat sss"
	public static void removalExtraSpaces(String fileName) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(fileName));
		while(file.hasNextLine())
		{
			Scanner line = new Scanner(file.nextLine());
			line.useDelimiter("");
			while(line.hasNext())
			{
				String singleSpace = line.next();
				
				if(singleSpace.equals(" "))
				{
					while(line.next().equals(" "))
					{
						
					}
				}
				else
				{
					String s = line.next();
					System.out.print(s);
				}
			}
		}
		file.close();
	}
	
	//line can end with either boy or girl. Need to seperately prin out the sum of scores of boys and girls
	public static void boyGirl(Scanner input) throws FileNotFoundException
	{
		System.out.println("Enter a file name: ");
		String fileName = input.nextLine();
		
		PrintWriter print = new PrintWriter(new File(fileName));
		System.out.print("Please enter the data you want(boy boyScore girl girlScore....): ");
		String data = input.nextLine();
		print.println(data);
		print.close();
		Scanner scanFile = new Scanner(new File(fileName));
		int boyScore=0; int girlScore =0; int count=0; int boys =0; int girls =0;
		while(scanFile.hasNext())
		{
			System.out.println(scanFile.next());
			if(count%2==0)
			{
				boyScore+=scanFile.nextInt();
				boys++;
			}
			else
			{
				girlScore+=scanFile.nextInt();
				girls++;
			}
			count++;
		}
		scanFile.close();
		
		System.out.println(boys + " boys, " + girls + " girls");
		System.out.println("Boys sum = " + boyScore);
		System.out.println("Girls sum = " + girlScore);
		
	}
	
	public static void tokens(Scanner input, String fileName) throws FileNotFoundException
	{
		PrintWriter print = new PrintWriter(new File(fileName));
		System.out.println("Enter data: ");
		print.println(input.nextLine());
		print.println(input.nextLine());
		print.println(input.nextLine());
		print.println(input.nextLine());
		print.println(input.nextLine());
		print.close();
		
		Scanner fileScan = new Scanner(new File(fileName));
		int lines =0; int tokens=0; int chars=0; 
		while(fileScan.hasNextLine())
		{
			lines++;
			Scanner line = new Scanner(fileScan.nextLine());
			while(line.hasNext())
			{
				tokens++;
				String token = line.next();
				//char[] ch = token.toCharArray();
				//chars+=ch.length;
			}
		}
		fileScan.close();
		System.out.println("lines: " + lines);
		System.out.println("tokens: " + tokens);
		System.out.println("tokens per line: " + ((double)tokens/lines));
		System.out.println("chars per token: " + ((double)chars/tokens));
	}
	
	/*Write a method that accepts a Scanner object as a parameter. The Scanner is
	already connected to a file. The file contains at least one token that is an integer. There may be other, noninteger
	tokens in the file. The method shall return the average of the integers in the file.
	
	10 cat 20
	30
	50 20cat20
	cat
	dog 32
	
	For example, if the Scanner object was connected to the following file,
	then the method would return 28.4. (142 / 5).
	Note your method does nothandle ints that may be "embedded" in other tokens. For example, do not count the
	20's in a String such as "20cat20".
	*/
	
	public static void integerCount(Scanner input, String fileName) throws FileNotFoundException
	{
		PrintWriter print = new PrintWriter(new File(fileName));
		System.out.println("Enter data: ");
		print.println(input.nextLine());
		print.println(input.nextLine());
		print.println(input.nextLine());
		print.println(input.nextLine());
		print.println(input.nextLine());
		print.close();
		
		Scanner fileScan = new Scanner(new File(fileName));
		int intTokens=0;
		int intSum=0;
		while(fileScan.hasNextLine())
		{
			Scanner line = new Scanner(fileScan.nextLine());
			while(line.hasNext())
			{
				if(line.hasNextInt())
				{
					intTokens++;
					intSum+=line.nextInt();
				}
				else
				{
					line.next();
				}
			}
			line.close();
		}
		fileScan.close();
		double averageInt = (double)(intSum)/intTokens;
		
		System.out.println("Number of int tokens: " + intTokens);
		System.out.println("Sum of int tokens: " + intSum);
		System.out.println("Average of all int tokens : " + averageInt);
	}
}
