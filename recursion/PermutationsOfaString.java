package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PermutationsOfaString {

	public static void main(String[] args) {
		System.out.print("Please enter a word: ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		scanner.close();
		System.out.println();
		findPermutations(word);
	}

	
	//method finds and prints all permutations of a given string
	public static void findPermutations(String s){
		TreeSet<String> treeSet = new TreeSet<String>();
		Stopwatch stopWatch  = new Stopwatch();
		stopWatch.start();
		recursivePerm(s,"", treeSet);
		stopWatch.stop();
		System.out.println("Time taken TreeSet: " + stopWatch.time());
		System.out.println("Num elements: " +treeSet.size());
	//	printWords(treeSet, stopWatch);

		HashSet<String> hashSet = new HashSet<String>();
		stopWatch.start();
		recursivePerm(s,"", hashSet);
		String[] a = new String[hashSet.size()];
		hashSet.toArray(a);
		Arrays.sort(a);
		stopWatch.stop();
		System.out.println("Time taken HashSet: " + stopWatch.time());
		System.out.println("Num elements: " +hashSet.size());

	//	printWords(treeSet, stopWatch);
	}


	private static void printWords(TreeSet<String> treeSet, Stopwatch s) {
		// TODO Auto-generated method stub
		System.out.println("Total number of unique(non-repeating) permutations are: " + treeSet.size());
		System.out.println("Permutations are: ");
		Iterator<String> iterator = treeSet.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("Time taken for treeSet is: " + s.time());
	}


	private static void recursivePerm(String s, String created,
			Set<String> set) {
		// TODO Auto-generated method stub
		if(s.length()<=0)
			set.add(created);
		else{
			for(int i=0;i<s.length();i++){
				recursivePerm(s.substring(0, i) + s.substring(i+1, s.length())
						,created + s.charAt(i), set);
			}
		}
	}
}
