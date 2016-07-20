package Integers;
/*
1
2 3
4 5 6 
7 8 9 10
*/
public class Pattern 
{
	public static void main(String[] args)
	{
		printLines(4);
	}
	public static void printLines(int numLines){
		int val = 1;
		for(int i = 1; i <= numLines; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(val + " ");
				val++;
			}
			System.out.println();
		}
	}
}
