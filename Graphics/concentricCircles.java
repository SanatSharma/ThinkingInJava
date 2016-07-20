package Graphics;
import java.awt.*;
public class concentricCircles 
{
	public static void main(String[] args)
	{
		DrawingPanel panel = new DrawingPanel(900,750);
		Graphics g = panel.getGraphics();
		concentric(g,900,750,12);
	}
	
	public static void concentric(Graphics g, int width, int height, int num)
	{
		int xchange = width/num;
		int ychange = height/num;
		int x =0;
		int y=0;
		for(int i = 0;i<num;i++)
		{
			if(i%2==0)
			{
				g.setColor(Color.GREEN);
			}
			else
			{
				g.setColor(Color.BLACK);
			}
			g.fillOval(x,y,width,height);
			x+=xchange/2;
			y+=ychange/2;
			width-=xchange;
			height-=ychange;	
		}
	}
}













































































































































