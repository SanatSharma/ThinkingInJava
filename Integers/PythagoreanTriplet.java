package Integers;

public class PythagoreanTriplet {

	public static void main(String[] args) 
	{
		/*pythagoreanTriple(5, 3, 4) -> returns true
	pythagoreanTriple(4, 5, 3) -> returns true
	pythagoreanTriple(2, 2, 4) -> returns false
	pythagoreanTriple(5, 12, 13) -> returns true
	pythagoreanTriple(10, 8, 6) -> returns true
	pythagoreanTriple(8, 7, 6) -> returns false
	pythagoreanTriple(5, 5, 5) -> returns false
		 */
		System.out.println(checkPythaTriplet(5,3,4));
		System.out.println(checkPythaTriplet(4,5,3));
		System.out.println(checkPythaTriplet(2,2,4));
		System.out.println(checkPythaTriplet(5,12,13));
		System.out.println(checkPythaTriplet(10,8,6));
		System.out.println(checkPythaTriplet(5,5,5));
		System.out.println(checkPythaTriplet(8,7,4));
	}
	
	//to check if integers form a pythagorean triplet
	public static Boolean checkPythaTriplet(int a, int b, int c)
	{
		if(a>b&&a>c)
			return a*a == (b*b +c*c);
		else if(b>a && b>c)
			return b*b == c*c + a*a;
		else if(c>a&&c>b)
			return c*c == a*a+ b*b;
		return false;
	}
}
