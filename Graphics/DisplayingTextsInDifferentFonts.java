package Graphics;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class DisplayingTextsInDifferentFonts extends JPanel
{

		// TODO Auto-generated method stub
		String[] type = {"Sans", "Sans Serif"};
		int[] styles = {Font.PLAIN, Font.ITALIC, Font.BOLD, Font.ITALIC+ Font.BOLD};
		Color[] colors = {Color.BLACK, Color.CYAN, Color.PINK, Color.YELLOW, Color.MAGENTA};
		String[] styleNames = {"Plain", "Italic","Bold", "Bold and Italic"};
		
		public void paint(Graphics g)
		{
			int c=0;
			for(int i=0; i<type.length;i++ )
			{
				
				for(int j=0;j<styles.length;j++)
				{
					Font font = new Font(type[i], styles[j], 18);
					g.setFont(font);
					g.setColor(colors[j]);
					String name = type[i] + " " + styleNames[j];
					g.drawString(name, 20, (i*4 + j+ 1)*20);
					c++;
				}
			}
		}
		

		public static void main(String[] args) 
		{
		
			JFrame j  = new JFrame();
			j.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			}
					);
	
			j.setContentPane(new DisplayingTextsInDifferentFonts());
			j.setSize(400, 400);
			j.setVisible(true);
			j.setCursor(null);
			
		}
}
