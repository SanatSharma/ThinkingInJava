package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ElementRepetition {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		String fileName = input.nextLine();
		createFile(fileName, input);
		Scanner fileScanner = new Scanner(new File(fileName));
		repeat(fileScanner);
	}
	
	public static void createFile(String fileName, Scanner input) throws FileNotFoundException
	{
		PrintWriter print = new PrintWriter(new File(fileName));
		
		print.println("3 cake. 10 ! 2 13");
		print.println("4 note 13 Taylor");
		
		print.close();
	}	
	
	/*Write a static method repeat that takes a Scanner object which
	is already attached to a file. The file contains a sequence of integer/String pairs.
	Your method should print one line of output for each pair with the given String being
	repeated the specified number of times. For example, if the file contains the following
	data:
	3 cake. 10 ! 2 13
	Your method should produce this output:
	cake.cake.cake.
	!!!!!!!!!!
	1313
	Note that the first line has 3 copies of “cake.”, the second line contains 10 copies of
	“!”, and the third line contains 2 copies of “13”. There are no extra spaces added in
	the output. You should exactly reproduce this sample output. You may assume that
	the format of the file is correct, and consists of zero or more integer/String pairs.
	 */
	public static void repeat(Scanner scan)
	{
		while(scan.hasNextLine())
		{
			Scanner line = new Scanner(scan.nextLine());
			int repeat=0;
			String value="";
			while(line.hasNext())
			{	
				repeat = line.nextInt();
				value = line.next();
				for(int i=0;i<repeat;i++)
				{
					System.out.print(value);
				}
				System.out.println();
			}
		}
		scan.close();			
	}
}
