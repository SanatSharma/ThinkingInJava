package Arrays;

import java.util.Random;

public class FireSimulation 
{
	private static final int ROWS = 6;
	private static final int COLUMNS = 6;
	
	/*The method returns true if the row and column
	specify a cell that is inbounds (exists) in the given 2d array of chars or false if the row and column specify a
	cell that is out of bounds. (Doesn't exist in the 2d array of chars). 
	 */
	public static boolean inbounds(char[][] ch, int row, int col)
	{
		return ( 0<= row && row <  ch.length && 0<= col && col < ch[row].length);
	}
	
	/*The method returns the number of adjacent cells to the specified cell (given by the row and column) that equal
	the target char. A cell has at most four adjacent cells: the cells above, below, left, and right. Diagonal cells are
	not considered adjacent cells for this question.
	 */
	public static int countNeighbors(char[][] ch , int row, int col, int target)
	{
		int count = 0;
		if(inbounds(ch,row-1,col) && ch[row-1][col]==target)
			count++;
		if(inbounds(ch,row+1, col)&& ch[row+1][col]==target)
			count++;
		if(inbounds(ch, row, col-1) && ch[row][col-1]== target)
			count++;
		if(inbounds(ch, row, col+1) && ch[row][col+1]== target)
			count++;
	
		return count;
	}
	
	/*Write a method that simulates the spread of a forest fire.
 	The forest is represented by a 2d array of chars.
	Each element in the 2d array is either 'X', 'F', 'T', or 'O'.
	'X' represents cells that were on fire but have burned out.
	'F' represents cells that are on fire.
	'T' represents cells with trees that have not caught fire.
	'O' represents open cells with no plants. These cells never catch fire.
	Write a method that takes the current state of the forest and fire, represented by a 2d array of chars, and
	determines the next step of the forest fire in the simulation.
	Cells that are 'X' or 'O' do not change from one step of the simulation to another.
	Cells that are on fire ('F') have a 75% chance of burning out and becoming 'X' in the next step of the
	simulation.
	Cells with trees ('T') have a 0% chance of catching fire if zero adjacent cells are on fire.
	Cells with trees ('T') have a 50% chance of catching fire if one adjacent cell is on fire.
	Cells with trees ('T') have a 100% chance of catching fire if two or more adjacent cells are on fire.
	A cell has at most 4 adjacent cells: up, down, left, right.
	Cells in the corners only have 2 adjacent cells.
	Cells on the edges (but not the corners) only have 3 adjacent cells.
	Your method must simulate that all the changes occur at once.
	 */
	public static char[][] getNextStep(char[][] forest)
	{
		for(int row =0; row<forest.length;row++)
		{
			for(int col=0; col<forest[row].length;col++)
			{
				double rand = Math.random();

				if(forest[row][col]=='T')
				{
					int adjFire = countNeighbors(forest, row, col, 'F');
					if(adjFire ==0){}
					else if(adjFire==1)
					{
						if(rand<=.5)
							forest[row][col] = 'F';
					}
					else
						forest[row][col] = 'F';
				}
				else if(forest[row][col] == 'F')
				{
					if(rand<=.75)
						forest[row][col] = 'X';
				}
				
			}
		}
		
		return forest;
	}
	
	//used to create and initialize the board
	public static void makeBoard(char[][] forest)
	{
		for(int row = 0;row<forest.length;row++)
		{
			for(int col = 0; col<forest[0].length;col++)
			{
				double rand = new Random().nextInt(4);
				if(rand==0)
					forest[row][col] = 'X';
				else if (rand==1)
					forest[row][col] ='O';
				else if (rand==2)
					forest[row][col] = 'F';
				else
					forest[row][col] = 'T';
			}
		}
	}
	
	//displays the board
	public static void showBoard(char[][] forest)
	{
		for(int row = 0; row <forest.length;row++)
		{
			for(int col =0;col<forest[row].length;col++)
			{
				System.out.print(forest[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		char[][] board = new char[ROWS][COLUMNS];
		makeBoard(board);
		showBoard(board);
		getNextStep(board);
		System.out.println();
		showBoard(board);
		getNextStep(board);
		System.out.println();
		showBoard(board);
	}
}
