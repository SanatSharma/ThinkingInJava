package graphs;
import java.util.*;
/*You work for a very large company that markets many different products. In some cases, one product you market competes with another. To help deal with this situation you have split the intended consumers into two groups, namely Adults and Teenagers. If your company markets 2 products that compete with each other, selling one to Adults and the other to Teenagers will help maximize profits. Given a list of the products that compete with each other, you are going to determine whether all can be marketed such that no pair of competing products are both sold to Teenagers or both sold to Adults. If such an arrangement is not feasible your method will return -1. Otherwise, it should return the number of possible ways of marketing all of the products.



The products will be given in a String[] compete whose kth element describes product k. The kth element will be a single-space delimited list of integers. These integers will refer to the products that the kth product competes with. For example:
compete = {"1 4",
        "2",
        "3",
        "0",
    ""}
The example above shows product 0 competes with 1 and 4, product 1 competes with 2, product 2 competes with 3, and product 3 competes with 0. Note, competition is symmetric so product 1 competing with product 2 means product 2 competes with product 1 as well.

Ways to market:

1) 0 to Teenagers, 1 to Adults, 2 to Teenagers, 3 to Adults, and 4 to Adults

2) 0 to Adults, 1 to Teenagers, 2 to Adults, 3 to Teenagers, and 4 to Teenagers

Your method would return 2.

Definition
	
Class:	Marketing
Method:	howMany
Parameters:	String[]
Returns:	long
Method signature:	long howMany(String[] compete)
(be sure your method is public)


Constraints
-	compete will contain between 1 and 30 elements, inclusive.
-	Each element of compete will have between 0 and 50 characters, inclusive.
-	Each element of compete will be a single space delimited sequence of integers such that:
All of the integers are unique.
Each integer contains no extra leading zeros.
Each integer is between 0 and k-1 inclusive where k is the number of elements in compete.
-	No element of compete contains leading or trailing whitespace.
-	Element i of compete will not contain the value i.
-	If i occurs in the jth element of compete, j will not occur in the ith element of compete.

Examples
0)	
	
{"1 4","2","3","0",""}
Returns: 2
The example from above.
1)	
	
{"1","2","0"}
Returns: -1
Product 0 cannot be marketed with product 1 or 2. Product 1 cannot be marketed with product 2. There is no way to achieve a viable marketing scheme.
2)	
	
{"1","2","3","0","0 5","1"}
Returns: 2
3)	
	
{"","","","","","","","","","",
"","","","","","","","","","",
"","","","","","","","","",""}
Returns: 1073741824
4)	
	
{"1","2","3","0","5","6","4"}
Returns: -1
*/
public class Marketing {

	boolean[][] adj = new boolean[64][64];
	int color[] = new int[64];
	int n;
	boolean oddcycle = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}	 
	public static void test(){
		Marketing m = new Marketing();
		check(m.howMany(new String[]{"1","2","0"}), -1);
		m.clear();
		check(m.howMany(new String[]{"1","2","3","0","0 5","1"}), 2);
		m.clear();
		check(m.howMany(new String[]{"","","","","","","","","","",
				"","","","","","","","","","",
				"","","","","","","","","",""}), 1073741824);
		m.clear();
		check(m.howMany(new String[]{"1","2","3","0","5","6","4"}), -1);
		
	}
	
	public void clear(){
		adj = new boolean[64][64];
		color = new int[64];
		n = 0;
		oddcycle = false;
	}
	private static void check(long howMany, int i) {
		// TODO Auto-generated method stub
		if(howMany == i)
			System.out.println("Passed test");
		else{
			System.out.println(howMany);
			System.out.println("failed test");
		}
	}
	public long howMany(String[] compete)
	{
	   n = compete.length;
	   for (int i = 0; i < compete.length; i++) {
	      StringTokenizer st = new StringTokenizer(compete[i], " ");
	      while (st.hasMoreTokens()) {
	         int j = Integer.parseInt(st.nextToken());
	         adj[i][j] = adj[j][i] = true;
	      }
	   }
	   for (int i = 0; i < n; i++) color[i] = 0;
	 
	   int ncomp = 0;
	 
	   // count components
	   for (int i = 0; i < n; i++)
	      if (color[i] == 0) {
	         ncomp++;
	         dfs(i, 1);
	      }
	   if (oddcycle)
	      return -1;
	 
	   long res = 1;
	   while (ncomp-- > 0) res *= 2;
	   return res;
	}
	 
	void dfs(int u, int c)
	{
	   if (color[u] != 0) {
	      if (color[u] != c) oddcycle = true;
	      return;
	   }
	   
	   color[u] = c;
	   for (int v = 0; v < n; v++)
	      if (adj[u][v])
	         dfs(v, 3 - c);
	}
}
