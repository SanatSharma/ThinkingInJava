package Strings;


import java.util.*;
public class ReplaceSentences 
{

	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		int a = scan.nextInt();
		scan.nextLine();
		String sent="";
		for(int i =0;i<a;i++)
		{
			sent+=scan.nextLine();
			sent+="\n";
		}
		//System.out.println(sent);
		String temp ="";
		Scanner sent2 = new Scanner(sent);
		while(sent2.hasNextLine())
		{
			Scanner text = new Scanner(sent2.nextLine());
			while(text.hasNext())
			{
				String word = text.next();
				if(word.equals("he"))
					temp+="she";
			else if(word.equals("she"))
				temp+="he";
			else if(word.equals("He"))
				temp+="She";
			else if(word.equals("She"))
				temp+="He";
			else if(word.equals("him"))
				temp+="her";
			else if(word.equals("her"))
				temp+="him";
			else if(word.equals("Him"))
				temp+="Her";
			else if(word.equals("Her"))
				temp+="Him";
			else if(word.equals("his"))
				temp+="hers";
			else if(word.equals("hers"))
				temp+="his";
			else if(word.equals("His"))
				temp+="Hers";
			else if(word.equals("Hers"))
				temp+="His";
			else if(word.equals("himself"))
				temp+="herself";
			else if(word.equals("herself"))
				temp+="himself";
			else if(word.equals("Himself"))
				temp+="Herself";
			else if(word.equals("Herself"))
				temp+="Himself";
			else if(word.equals("man"))
				temp+="woman";
			else if(word.equals("woman"))
				temp+="man";
			else if(word.equals("Man"))
				temp+="Woman";
			else if(word.equals("Woman"))
				temp+="Man";
			else if(word.equals("men"))
				temp+="women";
			else if(word.equals("women"))
				temp+="men";
			else if(word.equals("Men"))
				temp+="Women";
			else if(word.equals("Women"))
				temp+="Men";
			else if(word.equals("husband"))
				temp+="wife";
			else if(word.equals("wife"))
				temp+="husband";
			else if(word.equals("Husband"))
				temp+="Wife";
			else if(word.equals("Wife"))
				temp+="Husband";
			else if(word.equals("brother"))
				temp+="sister";
			else if(word.equals("sister"))
				temp+="brother";
			else if(word.equals("Brother"))
				temp+="Sister";
			else if(word.equals("Sister"))
				temp+="Brother";
			else if(word.equals("son"))
				temp+="daughter";
			else if(word.equals("daughter"))
				temp+="son";
			else if(word.equals("Son"))
				temp+="Daughter";			
			else if(word.equals("Daughter"))
				temp+="Son";
			else if(word.equals("father"))
				temp+="mother";
			else if(word.equals("mother"))
				temp+="father";
			else if(word.equals("Father"))
				temp+="Mother";
			else if(word.equals("Mother"))
				temp+="Father";
			else if(word.equals("boy"))
				temp+="girl";
			else if(word.equals("girl"))
				temp+="boy";
			else if(word.equals("Boy"))
				temp+="Girl";
			else if(word.equals("Girl"))
				temp+="Boy";
			else 
				temp+=word;
			
			temp+=" ";
			}
			temp+="\n";
		}
		System.out.println(temp);
	}

}
