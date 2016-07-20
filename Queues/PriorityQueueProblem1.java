package Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

import sun.misc.Queue;

/*It's lunchtime! The school canteen is currently empty. N children are going to enter the canteen and form a single queue. The children are numbered 0 through N-1 in the order in which they enter the canteen. Whenever a child enters the canteen, it performs one of two possible actions:

either it stands at the current end of the lunch queue,
or it skips the entire queue and goes to stand at its current beginning.


You are given the description of the children's behaviour: a String S containing N characters. For each valid i, S[i] is either 'e' or 'b'. Here, 'e' means that child i goes to the end of the queue, and 'b' means it goes to the beginning of the queue.



You are also given a int[] a with N elements. The element a[j] is the annoyance factor of child j (explained below).



At the beginning, the displeasure of each child is zero. The displeasure D[i] of child i grows whenever another child cuts in front of them. More precisely, whenever child i already stands in the queue and child j goes to the beginning of the queue, the displeasure of child i will grow by a[i].



The total displeasure is the sum of all D[i]. Compute and return the total displeasure after all N children have joined the queue.

 
Definition
    	
Class:	PriorityQueue
Method:	findAnnoyance
Parameters:	String, int[]
Returns:	int
Method signature:	int findAnnoyance(String S, int[] a)
(be sure your method is public)
    
 
Constraints
-	N will be between 1 and 100, inclusive.
-	The string S will contain N characters.
-	a will contain N elements.
-	Each element of a will be between 1 and 1,000, inclusive.
 
Examples
0)	
    	
"bbbbb"
{1,1,1,1,1}
Returns: 10
The queue will look as follows: { child 4, child 3, child 2, child 1, child 0 }.

The individual displeasures at the end are D[0] = 4, D[1] = 3, D[2] = 2, D[3] = 1, and D[4] = 0. Thus, the total displeasure is 4+3+2+1+0 = 10.

1)	
    	
"bee"
{50,40,30}
Returns: 0
When the first child joins the queue, there are no other children in the queue yet, so all displeasures remain at zero. The other two children stand at the end of the queue, so they don't change anyone's displeasure either. The total displeasure at the end is therefore 0.

2)	
    	
"ebbe"
{5,2,11,1}
Returns: 12
3)	
    	
"bbeebeebeeeebbb"
{58,517,301,524,79,375,641,152,810,778,222,342,911,313,336}
Returns: 20485
*/
public class PriorityQueueProblem1 
{
	public static void main(String[] args)
	{
		int result = findAnnoyance("bbeebeebeeeebbb", new int[]{58,517,301,524,79,375,641,152,810,778,222,342,911,313,336});
		System.out.println(result);
	}
	
	public static int findAnnoyance(String s, int[] a){
		int sum = 0;
		String[] val = s.split("");
		for(int j=0;j<val.length;j++){
			String ch = val[j];
			if(ch.equals("b")){
				for(int i=0;i<j;i++)
				{
					sum+= a[i];
				}
			}
		}		
		return sum;	
	}
}

