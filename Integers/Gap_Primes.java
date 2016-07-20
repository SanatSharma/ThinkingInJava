package Integers;
/*The prime numbers are not regularly spaced. For example from 2 to 3 
the gap is 1. From 3 to 5 the gap is 2. From 7 to 11 it is 4. Between 
2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 
17-19, 29-31, 41-43

A prime gap of length n is a run of n-1 consecutive composite numbers 
between two successive primes 
We will write a function gap with parameters:
g (integer >= 2) which indicates the gap we are looking for
m (integer >= 2) which gives the start of the search (m inclusive)
n (integer >= m) which gives the end of the search (n inclusive)
In the example above gap(2, 2, 50) will return [3, 5] which is the first
pair between 2 and 50 with a 2-gap.

So this function should return the first pair of two prime numbers spaced
with a gap of g between the limits m, n if these numbers exist otherwise
 nil or null or None or Nothing (depending on the language).

Examples:

gap(2, 5, 7) --> [5, 7]

gap(2, 5, 5) --> nil

gap(4, 130, 200) --> [163, 167]

([193, 197] is also such a 4-gap primes between 130 and 200 but it's not
the first pair)

gap(6,100,110) --> nil : between 100 and 110 we have 101, 103, 107, 109 but 101-107is not a 6-gap because there is 103in between and 103-109is not a 6-gap because there is 107in between
*/

public class Gap_Primes {
	
	public static void main(String[] args){
		test();
	}
	public static void test(){
		check(gap(6,100,110), null);
		check(gap(4, 130, 200), new long[]{163, 167});
		check(gap(2,5,5), null);
	}
	private static void check(long[] a, long[] b) {
		// TODO Auto-generated method stub
		if(a == null && b == null){
			System.out.println("Passed test");
			return;
		}
		else if((a==null && b!= null)|| (b==null && a !=null)){
			System.out.println("Failed test");
			return;
		}
		else if(a.length != b.length){
			System.out.println("Failed test");
			return;
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]!=b[i])
				System.out.println("Failed test");
		}
		System.out.println("Passed test");
	}

	public static long[] gap(int g, long m, long n) {
		long prime1 = 0;
		long prime2 = 0;
		for(long i = m; i<=n;i++){
			if(isPrime(i)){
				if(prime1==0)	prime1 = i;
				else{
					prime2 = i;
					if(prime2 - prime1 == g)
						return new long[]{prime1, prime2};
					else{
						prime1 = prime2;
						prime2 = 0;
					}
				}
			}
		}
		
		return null;
    }

	private static boolean isPrime(long i) {
		for(int j = 2;j<i/2;j++){
			if(i%j==0)
				return false;
		}
		return true;
	}
	
}
