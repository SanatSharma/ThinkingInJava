package CompetitiveCoding;


import java.util.ArrayList;
import java.util.Scanner;

public class Sunshine {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = scan.nextInt();
		for(int i=0;i<limit;i++)
		{
			scan.nextInt();
			scan.nextLine();
			ArrayList<String> emotions = new ArrayList<String>();
			String em = scan.nextLine();
			for(String word: em.split(" "))
				emotions.add(word);
			if(emotions.indexOf("EXHAUSTED")!=-1)
				System.out.println("NO");
			else if(emotions.indexOf("SAD")!=-1)
			{
				if(emotions.indexOf("CALM")>-1)
					System.out.println("NO");
				else if(emotions.indexOf("HAPPY")==-1 && emotions.indexOf("ANGRY")==-1)
					System.out.println("NO");
				else 
					System.out.println("YES");
			}
			else
				System.out.println("YES");
		}
	}

}
