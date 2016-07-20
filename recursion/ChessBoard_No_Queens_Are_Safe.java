package recursion;




import java.util.Arrays;

public class ChessBoard_No_Queens_Are_Safe {

    private char[][] board;
    
    public ChessBoard_No_Queens_Are_Safe(int size) {
        board = new char[size][size];
        for(int r = 0; r < size; r++)
            Arrays.fill(board[r], '.');
    }
    
    public ChessBoard_No_Queens_Are_Safe(char[][] b) {
        if(!isSquare(b))
            throw new IllegalArgumentException("board must be square");
        board = new char[b.length][b[0].length];
        for(int r = 0; r < board.length; r++)
            for(int c = 0; c < board.length; c++)
                board[r][c] = b[r][c];
    }
    
    public int size() {
        return board.length;
    }
    
    public void placeQueen(int row, int col) {
        if(!inbounds(row, col))
            throw new IllegalArgumentException("cell must be inbounds: " 
                    + row + " " + col);
        board[row][col] = 'q';
    }

    public void pickUpQueen(int row, int col) {
        if(!inbounds(row, col))
            throw new IllegalArgumentException("cell must be inbounds: " 
                    + row + " " + col);
        board[row][col] = '.';
    }
    /**
     * determine if the chess board represented by board is a safe set up
     * <p>pre: board != null, board.length > 0, board is a square matrix.
     * (In other words all rows in board have board.length columns.),
     * all elements of board == 'q' or '.'. 'q's represent queens, '.'s
     * represent open spaces.<br>
     * <p>post: return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     * @param board the chessboard
     * @return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     */
    public boolean queensAreSafe() {
    	return false;
    }
    
    
    public ChessBoard_No_Queens_Are_Safe getCopy() {
        return new ChessBoard_No_Queens_Are_Safe(board);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++) {
                sb.append(board[r][c]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }



    private  boolean inbounds(int row, int col){
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }

    /* pre: mat != null
       post: return true if mat is a square matrix, false otherwise
     */
    private static boolean isSquare(char[][] mat) {
        assert mat != null : "Violation of precondition: isSquare";

        final int numRows = mat.length;
        int row = 0;
        boolean square = true;
        while( square && row < numRows ) {
            square = ( mat[row] != null) && (mat[row].length == numRows);
            row++;
        }
        return square;
    }

    /* pre: mat != null, valid != null
       post: return true if all elements in mat are one of the characters in valid
     */
    private static boolean onlyContains(char[][] mat, char[] valid) {
        assert mat != null && valid != null : "Violation of precondition: onlyContains";

        int row = 0;
        int col;
        boolean correct = true;
        while( correct && row < mat.length) {
            col = 0;
            while(correct && col < mat[row].length) {
                correct = contains(valid, mat[row][col]);
                col++;
            }
            row++;
        }
        return correct;
    }

    /* pre: list != null
       post: return true if c is in list
     */
    private static boolean contains(char[] list, char c) {
        assert ( list != null ) : "Violation of precondition: contains";

        boolean found = false;
        int index = 0;
        while( !found && index < list.length) {
            found = list[index] == c;
            index++;
        }
        return found;
    }
}
