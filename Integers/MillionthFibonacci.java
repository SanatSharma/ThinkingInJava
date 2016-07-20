package Integers;
import java.math.BigInteger;
public class MillionthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger b = BigInteger.valueOf(10);
		System.out.println(fib(b));
	}

	 public static BigInteger fib(BigInteger n) {
		  double p = ((1 + Math.sqrt(5)) / 2.0);
	      //System.out.println(p);
	      
	      //return BigInteger.ZERO;
	      double q =  ((1 - Math.sqrt(5)) / 2.0);
	      int n1 = n.intValueExact();
	      BigInteger p1 = BigInteger.valueOf((long) p);
	      
	      BigInteger p2 = BigInteger.valueOf((long) q);
	      p1 = p1.pow(n1);
	      p2 = p2.pow(n1);
	      BigInteger div = BigInteger.valueOf((long)Math.sqrt(5));
	      BigInteger prod = p1.subtract(p2);
	      return prod.divide(div);
	  }
}
