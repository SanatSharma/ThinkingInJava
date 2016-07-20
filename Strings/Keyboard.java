package Strings;
import java.util.*;
public class Keyboard 
{
	public static void main(String[] args) 
	{
		char[][] keyboard = {{'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'},
							 {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';'}, 
							 {'Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.', '/'}};
		
			Scanner scan = new Scanner(System.in);
			int numWords = scan.nextInt();
		
			for(int word = 0; word < numWords; ++word) 
			{
				String cur = scan.next();

				cur.toUpperCase();
				int distance = 0;		
				int row = 0;
				int col = -1;
			
				while(col == -1)
 				{
					col = containsLetter(keyboard[row], cur.charAt(0));
					row++;
					row %= 3;
				}
			
				if(row != 0)
					row--; 
				else
					row = 2;
				for(int i = 1; i < cur.length(); ++i) 
				{
					System.out.println("Inside the second for loop");
					char letter = cur.charAt(i);
					int otherCol = -1;
					int originalRow = row;
					while(otherCol == -1) 
					{
						otherCol = containsLetter(keyboard[row], letter);
						row++;
						row %= 3;
					}
					if(row != 0)
						row--; //back to current row
					else
						row = 2;
					
					int rowDiff = (int)Math.abs(row - originalRow);
					int colDiff = (int)Math.abs(col - otherCol);
				
					col = otherCol;
					distance += rowDiff + colDiff;
				}

				System.out.println(distance);
			}
		}
	public static int containsLetter(char[] letters, char letter)
	{
		System.out.println("Inside the containsLetter) method");
		for(int i = 0; i < letters.length; ++i)
		{
			if(letters[i] == letter)
			return i;
		}
		return -1;
	}
}
