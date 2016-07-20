package Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class GraphicsClock extends JPanel implements Runnable
{
	Thread thread = null;
	SimpleDateFormat formatter = new SimpleDateFormat("s", Locale.getDefault());
	Date currentDate;
	int xcenter = 175, ycenter = 175, lastxs=0, lastys=0, lastxm=0, lastym=0, lastxh=0, lastyh=0;
	
	private void drawStructure(Graphics g)
	{
		//Setting color for clock
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.setColor(Color.BLACK);
		g.fillOval(xcenter-160, ycenter-160, 320, 320);
		g.setColor(Color.YELLOW);
		//Writing the quarter digits at the appropriate ,locations
		g.drawString("9",xcenter-145, ycenter);
		g.drawString("3",xcenter +135, ycenter);
		g.drawString("12", xcenter-20, ycenter-130);
		g.drawString("6", xcenter-10, ycenter+145);
		
	}
	
	public void paint(Graphics g)
	{
		int xsecond,ysecond,xminute,xhour,yminute,yhour,second, minute, hour;
		drawStructure(g);
		currentDate = new Date();
		formatter.applyPattern("s");
		second= Integer.parseInt(formatter.format(currentDate));
		
		formatter.applyPattern("m");
		minute= Integer.parseInt(formatter.format(currentDate));
		
		formatter.applyPattern("h");
		hour = Integer.parseInt(formatter.format(currentDate));
		
		xsecond = (int)(Math.cos(second * 3.14f/30 - 3.14f/2)*120 + xcenter);
		ysecond = (int)(Math.sin(second * 3.14f/30 - 3.14f/2)*120 + ycenter);
		xminute = (int)(Math.cos(minute * 3.14f/30 - 3.14f/2)*100 + xcenter);
		yminute = (int)(Math.sin(minute * 3.14f/30 - 3.14f/2)*100 + ycenter);
		xhour = (int)(Math.cos((hour * 30 + minute/2) * 3.14f/180 - 3.14f/2)*80 + xcenter);
		yhour = (int)(Math.sin((hour * 30 + minute/2) * 3.14f/180 - 3.14f/2)*80 + ycenter);
		//Erase if necessary and redraw
	
		
		
		g.setColor(Color.magenta);
		g.drawLine(xcenter, ycenter, xsecond, ysecond);
		g.setColor(Color.red);
		g.drawLine(xcenter, ycenter-1, xminute, yminute);
		g.drawLine(xcenter-1, ycenter, xminute, yminute);
		g.setColor(Color.GREEN);
		g.drawLine(xcenter, ycenter-1, xhour, yhour);
		g.drawLine(xcenter-1, ycenter, xhour, yhour);
		lastxs = xsecond;
		lastys = ysecond;
		lastxm = xminute;
		lastym = yminute;
		lastxh = xhour;
		lastyh = yhour;
	}
	
	public void start()
	{
		if(thread==null)
		{
			thread = new Thread(this);
			thread.start();
		}	
	}
	
	public void stop()
	{
		thread = null;
	}
	
	public void run()
	{
		while(thread!=null)
		{
			repaint();
		}
		thread =  null;
	}
	
	public void update(Graphics g)
	{
		paint(g);
	}
	// tHIs program may be used in the greatest good of humans only if the time could be controlled and made into sizeable units of tolerance and independence. We should create a world of harmony and peace , where equality and justice rules the people.Such a world is not only a distant impossible thought, it can be made into reality by proactive correction of our wayward habits and molding ourselves into compassionate and responsible citizens. We must pay or taxes, keep our surroundings clean, support and provide for the poor as well as criticizing governments policies that are intrusive and promote a world of extreme surveillance. We must stand up for our rights while at the same time keeping in mind the evergrowing threat of cyber attacks.  
	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		Color c = new Color(118,73,190);
		window.setBackground(c);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0,0,400,400);
		GraphicsClock clock = new GraphicsClock();
		window.getContentPane().add(clock);
		window.setVisible(true);
		clock.start();
	}
}
