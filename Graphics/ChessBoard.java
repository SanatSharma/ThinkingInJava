package Graphics;
import java.awt.*;
import java.util.Scanner;

public class ChessBoard 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of sqaure: ");
		int size = scan.nextInt();
		System.out.println("Enter the size of the chessBoard in terms of rows : ");
		int noOfRows = scan.nextInt();
		chessBoard(size, noOfRows);
	}
	
	public static void chessBoard(int size, int noOfRows)
	{
		DrawingPanel panel = new DrawingPanel(size,size);
		Graphics g = panel.getGraphics();
	
		int sizeOfSquare = size/noOfRows;
		for(int i=0;i<noOfRows;i++)
		{
			for(int j=0;j<noOfRows;j++)
			{
				if((i+j)%2==0)
				{
					g.setColor(Color.BLACK);
					g.fillRect(sizeOfSquare*j, sizeOfSquare*i, sizeOfSquare, sizeOfSquare);
				}
			}
		}
	}
}
