package recursion;

public class PairDistance {

	public static void main(String[] args) 
	{ 
		System.out.println(strDist("catcowcat", "cat") + " expect 9");
		System.out.println(strDist("catcowcat", "cow") + " expect 3");
		System.out.println(strDist("cccatcowcatxx", "cat") + " expect 9");
	}
/*Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length. 

strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
 */
	public static int strDist(String str, String sub) 
	{
		if(str==null ||str.length()<sub.length())
			return 0;

		else if(str.substring(0,sub.length()).equals(sub))
		{ 
			int i = str.length();
			while(i>0 && !str.substring(i-sub.length(),i).equals(sub))
				i--;

			return i+ strDist(str.substring(i,str.length()),sub);
		}
		
		return strDist(str.substring(1, str.length()),sub);
	}
}
