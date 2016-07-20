package Strings;

public class CharacterOccurence {

	public static void main(String[] args) {
		printCharacterOccurence("Sanat");
	}
	
	public static void printCharacterOccurence(String a)
	{
		for(char j = 'a';j<='z';j++)
		{
			int count=0;
			for(int i =0;i<a.length();i++)
			{	
				if(j==a.charAt(i))
					count++;
			}
			System.out.println(j + ": " + count);
		}
		for(char j = 'A';j<='Z';j++)
		{
			int count=0;
			for(int i =0;i<a.length();i++)
			{	
				if(j==a.charAt(i))
					count++;
			}
			System.out.println(j + ": " + count);
		}
	}
}
