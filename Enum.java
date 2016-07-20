
public class Enum 
{
	public enum Spiciness{ NOT,MILD,WARM,HOT,SPICY, TORPEDO}
	public static void main(String[] args) 
	{
		for(Spiciness s : Spiciness.values())
		{
			System.out.println( s + "Ordinal : " + s.ordinal());	
		}
	}

}
