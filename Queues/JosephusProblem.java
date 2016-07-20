package Queues;

import java.util.LinkedList;
import java.util.Queue;

/*In this kata you have to correctly return who is the "survivor", ie: the last 
 * element of a Josephus permutation.

Basically you have to assume that n people are put into a circle and that they 
are eliminated in steps of k elements, like this:

josephus_survivor(7,3) => means 7 people in a circle;
one every 3 is eliminated until one remains
[1,2,3,4,5,6,7] - initial sequence
[1,2,4,5,6,7] => 3 is counted out
[1,2,4,5,7] => 6 is counted out
[1,4,5,7] => 2 is counted out
[1,4,5] => 7 is counted out
[1,4] => 5 is counted out
[4] => 1 counted out, 4 is the last element - the survivor!
 */
public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	private static void test() {
		// TODO Auto-generated method stub
		josephusTest(7, 3, 4);
	    josephusTest(11, 19, 10);
	    josephusTest(40, 3, 28);
	    josephusTest(14, 2, 13);
	    josephusTest(100, 1, 100);
	}
	  private static void josephusTest(final int n, final int k, final int result) {
	    String testDescription = String.format("Testing where n = %d and k = %d.", n, k);
	    check(testDescription, result, josephusSurvivor(n, k));
	  }
	
	private static void check(String testDescription, int result,
			int josephusSurvivor) {
		// TODO Auto-generated method stub
		System.out.print(testDescription + " ");
		if(result == josephusSurvivor)
			System.out.println("Passed Test");
		else
			System.out.println("Failed test");
	}
	public static int josephusSurvivor(final int n, final int k){ 
		int sol = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i =1;i<=n;i++){
			q.add(i);
		}
		while(!q.isEmpty()){
			//looping just enough so that we can remove the desired element
			for(int i = 0; i<k-1;i++) 
				q.add(q.remove());
			sol = q.remove();
		}
		//the value of sol is continuously updated so that the last value is the 
		//desired one. Its pretty gacky but I couldn't think of something cleaner
		return sol;
	}
}
