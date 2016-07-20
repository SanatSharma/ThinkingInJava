package Graphics;

import java.util.Scanner;

import java.awt.*;

public class MultiCircle 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a canvas size: ");
		int size = scan.nextInt();
		System.out.println("Enter num of rows: ");
		int row = scan.nextInt();
		System.out.println("Enter no of circles to skip per row: ");
		int skip = scan.nextInt();
		drawFigure(size,row,skip);
	}
	
	public static void drawFigure(int size, int row, int skip)
	{
		DrawingPanel panel = new DrawingPanel(size,size);
		Graphics g = panel.getGraphics();
		
		int sizeCircle = size/row;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				g.setColor(Color.LIGHT_GRAY);
				if(j<row-skip)
				{
					if(i%2==0)
					{
						g.fillOval(sizeCircle*j, sizeCircle*i, sizeCircle, sizeCircle);
					}
					else
					{
						g.fillOval(skip*sizeCircle + sizeCircle*j, sizeCircle*i,sizeCircle,sizeCircle);
					}
				}
				
			}
		}
	}

}
