package Graphics;
import java.awt.*;
/*The window is 220 pixels wide and 150 pixels tall. The background is yellow.
 There are two blue ovals of size 40 x 40 pixels. The left oval's top-left corner is
 located at position (50, 25), and the two ovals' top-left corners are 80 pixels 
 apart horizontally. There is a red square whose top two corners exactly intersect
 the centers of the two ovals. Lastly, there is a black horizontal line through the
  center of the square.
 */
public class MickeyBox 
{
	public static void main(String[] args)
	{
		DrawingPanel panel = new DrawingPanel(220,150);
		Graphics g = panel.getGraphics();
		g.setColor(Color.YELLOW);
		int width = 220;
		int height = 150;
		g.fillRect(0, 0, width, height);
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(50+80,25,40,40);
		g.setColor(Color.RED);
		int xSquare = 50 + 40/2;
		int ySquare = 25 + 40/2;
		g.fillRect(xSquare, ySquare, 80, 80);
		g.setColor(Color.BLACK);
		int y1 = ySquare + 40;
		g.drawLine(xSquare, y1, xSquare+80, y1);
	}
}
