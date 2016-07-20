package Minesweeper;

public class Board 
{
	private static final int BOMB = -1;

	private Cell[][] myCells;
	private boolean gameOver;

	// Create a board with the given number of rows and columns.
	// Each cell has a chance of holding a bomb equal to 
	// probabilityBomb.
	// I expect:
	// rows > 0
	// cols > 0
	// 0 < probabilityBomb < 1.0
	public Board(int rows, int cols, double probabilityBomb) {
		myCells = new Cell[rows][cols];
		placeBombs(probabilityBomb);
		countBombs();
	}

	public boolean gameOver() {
		return gameOver;
	}

	// reveal cell at position row, col and if a 0 reveal surrounding cells and if any of those are 0 ...
	public void reveal(int row, int col) {
		if (inbounds(row, col) && !myCells[row][col].revealed) {
			if (myCells[row][col].value == BOMB) {
				gameOver = true;
			} else {
				myCells[row][col].revealed = true;
				if (myCells[row][col].value == 0) {
					// reveal 8 surrounding cells
					for (int r = row - 1; r <= row + 1; r++) {
						for (int c = col - 1; c <= col + 1; c++) {
							reveal(r, c); // recursion
						}
					}
				}
			}
		}
	}

	// Used to place bombs in the initial board.
	private void placeBombs(double prob) {
		for (int r = 0; r < myCells.length; r++) {
			for (int c = 0; c < myCells[0].length; c++) {
				myCells[r][c] = new Cell(0, false);
				if (Math.random() < prob) {
					myCells[r][c].value = BOMB;
				}
			}
		}
	}

	// Used when setting up the board.
	// For each cell that doesn't contain a bomb count the
	// number of bombs that border that cell and place an
	// int equal to that value in myCells.
	private void countBombs() {
		for (int r = 0; r < myCells.length; r++) {
			for (int c = 0; c < myCells[0].length; c++) {
				if (myCells[r][c].value != BOMB) {
					myCells[r][c].value = countBombs(r, c);
				}
			}
		}
	}

	// I assume myCells[row][col] != BOMB.
	// Count the number of bombs around the cell at 
	// position myCells[row][col]
	private int countBombs(int row, int col) {
		int count = 0;
		for (int r = row - 1; r <= row + 1; r++) 
			for (int c = col - 1; c <= col + 1; c++)
				if (inbounds(r, c) && myCells[r][c].value == BOMB)
					count++;
		return count;
	}

	// return the number of rows this board has
	public int getNumRows() {
		return myCells.length;  
	}

	// return the number of columns this board has
	public int getNumColumns() {
		return myCells[0].length;   
	}

	// return a string with all cells revealed
	public String showAll() {
		StringBuilder sb = new StringBuilder();
		for (Cell[] row : myCells) {
			for (Cell cell : row) 
				if(cell.value == BOMB) {
					sb.append("* ");
				}
				else {
					sb.append(cell.value);
					sb.append(" ");
				}
			sb.append("\n");
		}
		return sb.toString();
	}

	// Return a String version of the board.
	// Cells that have not been revealed are represented
	// with a dash, -. 
	// Cells with 0 bombs bordering them
	// are represented with a period.
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int r = 0; r < myCells.length; r++) {
			for (int c = 0; c < myCells[0].length; c++) {
				if (!myCells[r][c].revealed)
					sb.append("-");
				else if (myCells[r][c].value > 0)
					sb.append(myCells[r][c]);
				else if (myCells[r][c].value == 0)
					sb.append(".");
				else
					sb.append("*");
				sb.append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	// return true if the row and column represent a
	// cell that is inbounds for this board, false otherwise
	private boolean inbounds(int r, int c) {
		return 0 <= r && r < myCells.length && 0 <= c && c < myCells[0].length;
	}

	public static void main(String[] args) {
		Board b1 = new Board(15, 25, .25);
		System.out.println(b1.showAll());
		System.out.println("\n" + b1);
	}

	private static class Cell {
		private int value;
		private boolean revealed;

		private Cell(int value, boolean revealed) {
			this.value = value;
			this.revealed = revealed;
		}

		public String toString() {
			String result = value + "";
			if (value == BOMB) {
				result = "*";
			} else if (value == 0) {
				result = ".";
			}
			return result;
		}
	}
}


