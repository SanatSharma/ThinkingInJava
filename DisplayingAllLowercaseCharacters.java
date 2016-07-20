
public class DisplayingAllLowercaseCharacters 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		char i;
		for(i=0;i<128;i++)
		{
			if(Character.isLowerCase(i))
			{
				System.out.println("Charater at position " + (int)i + " is " + i);
			}
		}
	}

}
