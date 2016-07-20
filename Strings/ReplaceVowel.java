package Strings;
//replace all the vowels in Splitting.knights with underscores.
public class ReplaceVowel 
{
	private static int k=0;
	public static void main(String[] args)
	{
	//	StringBuffer s = new StringBuffer();
		String sent = "Mary had a little lamb, little lamb, little lamb, mary had a little lamb which was so fluffy";
		/*for(StringBuffer s: sent.split(""))
		{
			int i=0;
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='o'||c=='u'||c=='i')
			{
				k++;
			}
			
		}
*/
			
		/*  String[] ch;
		ch = sent.split("");
		for(int i=0;i<ch.length;i++)
		{			if(ch[i]=="a"||ch[i]=="e"||ch[i]=="o"||ch[i]=="u"||ch[i]=="i")
			{
				k++;
			}
		*/
		/*	switch(ch[i])
			{
				case 'a' : 
				case 'e' :
				case 'i' :
				case 'o' :
				case 'u' : k++;
				default : break;
			}
		*/
		//}
			System.out.println("Number of vowels : " + k);
			sent.replace("a", "_");
			sent.replace('e', '_');
			sent.replace('i', '_');
			sent.replace('o', '_');
			sent.replace('u', '_');
			System.out.println("after replacing vowels,we get : " + sent);
			
	}
}
