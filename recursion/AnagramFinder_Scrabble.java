package recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;

public class AnagramFinder_Scrabble 
{
    private static final String DICTIONARY_FILE = "d3.txt";
    private static HashSet<String> hash; 
    private static TreeMap<Character,Integer> letters ;
    private static Scanner scan;
    
    AnagramFinder_Scrabble()
    {
    	letters = new TreeMap<Character,Integer>();
    	putValuesIntoLetters();
    	hash = new HashSet<String>();
    	scan = new Scanner(System.in);
    }
	private static void putValuesIntoLetters()
	{
		letters.put('a',1);
		letters.put('b',3);
		letters.put('c',3);
		letters.put('d',2);
		letters.put('e',1);
		letters.put('f',4);
		letters.put('g',2);
		letters.put('h',4);
		letters.put('i',1);
		letters.put('j',8);
		letters.put('k',5);
		letters.put('l',1);
		letters.put('m',3);
		letters.put('n',1);
		letters.put('o',1);
		letters.put('p',3);
		letters.put('q',10);
		letters.put('r',1);
		letters.put('s',1);
		letters.put('t',1);
		letters.put('u',1);
		letters.put('v',4);
		letters.put('w',4);
		letters.put('x',8);
		letters.put('y',4);
		letters.put('z',10);
	}
	public static void main(String[] args)
	{
		AnagramFinder_Scrabble a = new AnagramFinder_Scrabble();
		
		System.out.println("Welcome to the anagram solver.");
		System.out.println();
		String userChoice = "y";

		while(userChoice.equalsIgnoreCase("Y"))
		{	//a.findAllWords("mode");
			hash.clear();
			System.out.println("Enter the letters available on your board: ");
			String str = scan.next();
			if(letters == null)
				throw new IllegalArgumentException("The string entered cannot be null");

			a.findAllWords2(str);
			Map<String, Integer> values = new HashMap<String,Integer>();
			putSetIntoMap(values);	
	//		System.out.println(values.toString());
			values = sortByValue(values);
			printScrabbleWords(values);
			userChoice = getUserChoice();
		}		
	}

	//copying all the words from the set into the map
	private static void putSetIntoMap(Map<String, Integer> values)
	{
		for(int i=0;i<hash.size();i++)
		{
			 Iterator iterator = hash.iterator();
			 while(iterator.hasNext())
			 {
				 String s = (String) iterator.next();
				 int points = getPoints(s);
				 values.put(s, points);
			 }
		}
	}
	
	//print all the words contained in the map
	private static void printScrabbleWords(Map<String, Integer> values)
	{
		System.out.println("There are " + values.size() + " words: ");

		String[] s = values.toString().split(", ");
		s[0] = s[0].substring(1);
		s[s.length-1] = s[s.length-1].substring(0, s[s.length-1].length() -1);
		for(int i=0;i <s.length;i++)
		{
			String[] val = s[i].split("=");
			System.out.println(val[0] + " = "  + val[1]);
		}
	}
	
	//gets the user choice
	private static String getUserChoice()
	{
		String choice;
		System.out.println("\nDo you wish to enter another list of letters?");
		System.out.println("Enter 'y' for yes or 'n' for no: ");
		choice = scan.next();
		return choice;
	}
	
	// open the dictionary file. Return a list containing
    // the words in the dictionary file.
    // If the dictionary file is not found the program ends
    private static HashMap<String,String> getDictionary() 
    {
        HashMap<String,String> dictionary = new HashMap<String,String>();
        try {
            Scanner input = new Scanner(new File(DICTIONARY_FILE));

            while (input.hasNext())
            {
            	String s= input.next().toLowerCase();
//            	int points = getPoints(s);
                dictionary.put(s,s);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found: " + e);
            System.out.println("Exiting");
            System.exit(-1);
        }
        return dictionary;
    }
    

    //method to get points from string
    private static int getPoints(String s) 
    {
    	int points= 0;
    	for(int i =0;i<s.length();i++)
    	{
    		if(letters.containsKey(s.charAt(i)))
    			points += letters.get(s.charAt(i));
    	}
    	
    	return points;
    }

	//method 2
	private void findAllWords2(String searchWord)
	{
		searchWord = sortLetters(searchWord);
		HashMap<String,String> dictionary = getDictionary();
		findWords2(searchWord, "", dictionary);
	}
	
	private void findWords2(String searchWord, String s2,
			HashMap<String, String> dictionary) 
	{
		if(searchWord.length() >= 0)
		{
			if(dictionary.containsKey(s2))
			{
				hash.add(s2);
			}
		}
		for(int i = 0;i< searchWord.length();i++)
		{
			findWords2(searchWord.substring(0, i) + searchWord.substring(i+1,
					searchWord.length()),  s2 + searchWord.charAt(i), dictionary);
		}
	}

	private String sortLetters(String target)
	{
		ArrayList<Character> c = new ArrayList<Character>();
		for(char ch: target.toCharArray())
			c.add(ch);
		Collections.sort(c);
		String str = "";
		for(char ch: c)
			str+= ch;
		return str;
	}
	
			
		public static <K, V extends Comparable<? super V>> Map<K, V> 
	    sortByValue( Map<K, V> map )
	{
	    List<Map.Entry<K, V>> list =
	        new LinkedList<>( map.entrySet() );
	    Collections.sort( list, new Comparator<Map.Entry<K, V>>()
	    {
	        @Override
	        public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )
	        {
	            return (o2.getValue()).compareTo( o1.getValue() );
	        }
	    } );

	    Map<K, V> result = new LinkedHashMap<>();
	    for (Map.Entry<K, V> entry : list)
	    {
	        result.put( entry.getKey(), entry.getValue() );
	    }
	    return result;
	}
	
		/*    //method 1	
		public void findAllWords(String searchWord)
		{
			searchWord = sortLetters(searchWord);
			List<String> wordList = new ArrayList<String>();
			List<String> s = new ArrayList<String>();
//			System.out.println(findWords(searchWord, "", wordList));
			s.addAll(findWords(searchWord, "", wordList));
			wordList.clear();
			
			HashMap<String,String> dictionary = getDictionary();
			for(String st: s)
			{
				if(dictionary.containsKey(st))
					wordList.add(st);
			}
			Collections.sort(wordList);
			
			for(String st: wordList)
				System.out.println(st);
		}

		private List<String> findWords(String searchWord, String s2,
				List<String> wordList)
		{
			if(searchWord.length() == 0)
			{
				wordList.add(s2);
			}
			if(wordList.size() == (searchWord.length() * (searchWord.length() - 1)) && wordList.size()!= 0)
			{
				System.out.println(wordList);
				return wordList;
			}
			for(int i=0;i<searchWord.length();i++)
			{
				findWords(searchWord.substring(0, i) + searchWord.substring(i+1,
						searchWord.length()),  searchWord.charAt(i) + s2, wordList);
			}
			return wordList;
		}
		*/
		
}
	
