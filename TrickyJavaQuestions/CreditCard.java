package TrickyJavaQuestions;

/*You're writing the backend for a new web site and need to validate ConglomoBank credit cards. Credit card information consists of two pieces: a credit card number and an expiration date, in the format MMYY.

A valid ConglomoBank card must satisfy several rules:

1. The credit card number must be exactly 8 digits long.

2. The first digit must be odd.

3. The expiration month must be valid (between 01 and 12, inclusive).

4. The credit card number must be divisible by the expiration date (interpreted as a four-digit number).

Given a list of credit card numbers and expiration dates, determine which are valid and which are invalid.

Details and Clarification

1. You may assume none of the credit card numbers have any leading zeros.

2. All expiration dates will be exactly four digits long (possibly with leading zeros).

Input

The first line contains an integer T. T will be at most 100.

T test cases follow. Each test case contains two integers: the credit card number N (0 ≤ N ≤ 230) and an (exactly) four-digit expiration date.

Output

For each test case, output "Case i: ", where i is the case number (indexed starting at one), followed by "VALID", if the credit card is valid per the rules above, or "BOGUS" otherwise.

Sample Input

3
12345678 0282
12345678 0003
13001300 1300
Sample Output

Case 1: VALID
Case 2: BOGUS
Case 3: BOGUS
*/
import java.util.*;
public class CreditCard 
{
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int i=1;i<=cases;i++)
		{
			String ch = scan.next();
			String exp = scan.next();
			System.out.println("exp: " + exp);
			int expMonth = Integer.parseInt(exp.substring(0, 2));
			int expiration = Integer.parseInt(exp);
			System.out.println(expMonth);
			long card = Long.parseLong(ch);
			System.out.println(card);
			int firstDig = Integer.parseInt(ch.substring(0, 1));
			
			if((ch.length()==8)&&(expMonth<=12 &&expMonth>=1)&&(firstDig%2==1)&&(card%expiration==0))
			{
				System.out.println("Case " + i + ": VALID");
			}
			else
			{
				System.out.println("Case " + i + ": BOGUS");
			}
		}
	}	
}