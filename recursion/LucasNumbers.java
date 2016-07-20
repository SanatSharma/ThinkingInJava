package recursion;
/*Lucas numbers are numbers in a sequence defined like this:

L(n) = 2 if n = 0

L(n) = 1 if n = 1

otherwise

L(n) = L(n - 1) + L(n - 2)
Your mission is to define a function lucasnum(n) that returns the nth term of this sequence.

Note: It should work for negative numbers as well (how you do this is you flip the
 equation around, so for negative numbers: L(n) = L(n + 2) - L(n + 1))

Examples:

lucasnum(-10) -> 123

lucasnum(-5) -> -11

lucasnum(-1) -> -1

lucasnum(0) -> 2

lucasnum(1) -> 1

lucasnum(5) -> 11

lucasnum(10) -> 123
*/
public class LucasNumbers {
	
	public static void main(String[] args){
		test();
	}

	  private static void test() {
		// TODO Auto-generated method stub
		check(lucasnum(-10),123);
		check(lucasnum(-5),-11);
		check(lucasnum(-1), -1);
		check(lucasnum(0), 2);
		check(lucasnum(1),1);
		check(lucasnum(5),11);
		check(lucasnum(10),123);
	}

	private static void check(int lucasnum, int i) {
		// TODO Auto-generated method stub
		if(lucasnum==i)
			System.out.println("Passed test");
		else{
			System.out.println(lucasnum);
			System.out.println("Failed test");
		}
	}

	public static int lucasnum (int n){
		  int result;
		  if(n>=0)
			 result= positiveHelper(n);
		  else
			 result = negativeHelper(n);
		  return result;
	  }

	private static int negativeHelper(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 2;
		if(n==1)
			return 1;
		
		return negativeHelper(n+2) - negativeHelper(n+1);
	}

	private static int positiveHelper(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 2;
		if(n==1)
			return 1;
		
		return positiveHelper(n-2) + positiveHelper(n-1);

	}

}
