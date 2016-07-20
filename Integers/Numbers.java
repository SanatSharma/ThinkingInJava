package Integers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * You have a list of N (1 <= N <= 200,000) integers indexed from 0 to (N-1). At the beginning all the numbers in the list are 0. Arnav has another list of also N integers indexed from 0 to (N-1) but each of these integers is in the range of -10^9 to 10^9 both inclusive. Your want to convert your list into Arnav's list by a sequence of moves.
In each move you can choose any index i (0 <= i <= N-1) and increase or decrease by 1 all the numbers with index from i to N-1 both inclusive.

Can you find what is the minimum amount of moves that you need to convert your list into Arnav's list?

Input

The first line of input contains integer N

The next line contains N integers representing Arnav's list

Output

Output only one number meaning the minimum amount of moves needed.

Sample Input

4
1 2 2 1
Sample Output

3
Explanation and Notes

For the sample input, you can choose in first move index i to be 1 and choose increment. Then you can choose in second move i to be 2 and choose increment. Then you can choose i to be 4 and choose decrement

Use fast IO (scanf for C++ and BufferedReader with InputStreamReader for Java).

Note that the answers to the questions may not fit in a 32 bit variable.
 */
public class Numbers {

	public static void main(String[] args) throws FileNotFoundException
	{
		String fileName = "BitchAssNigga.txt";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader read = new BufferedReader(fileReader);
	}
}
