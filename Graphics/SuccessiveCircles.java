package Graphics;
import java.awt.*;
import java.util.*;
public class SuccessiveCircles 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter size of canvas: ");
		int size = scan.nextInt();
		System.out.println("Enter the number of circles you want: ");
		int num = scan.nextInt();
		DrawingPanel panel = new DrawingPanel(size,size);
		Graphics g = panel.getGraphics();
		
		circles(g,size,num);
	}

	public static void circles(Graphics g, int size, int num)
	{
		int x = 0, y=0;
		g.setColor(Color.BLACK);
		for(int i=0;i<num;i++)
		{
			g.drawOval(x,y,size,size);
			size/=2;
			x+= size; y+=size;
		}
	}
}
