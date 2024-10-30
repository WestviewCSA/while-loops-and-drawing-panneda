import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));

        
        	for(int count=0; count<27; count++) {
        		g.drawLine(1000, 650-count*25, 1000-count*25, 0);
        	}
        	for(int count2=0; count2<27; count2++) {
        		g.drawLine(650-count2*25, 0, 0, count2*25);
        	}
        	int count3=0;
        	while(count3<27) {
        		count3++;
        		g.drawLine(0, count3*25, count3*25, 650);
        	}
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g2.drawLine(10, 270, 775, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g2.drawLine(765/2, 10, 765/2, 550 );
		
		
		//4) small rectangles on top-left
		//g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		//top left (100 random lines)
		int count1 = 0;
		while(count1 <= 100) {
			count1++;
			g2.setColor( new Color((int) (Math.random()*(255 - 0 + 1)) + 0,
					(int) (Math.random()*(255 - 0 + 1)) + 0, 
					(int) (Math.random()*(255 - 0 + 1)) + 0));
			
			g2.drawLine((int) (Math.random()*(765/2 - 10 + 1) ) + 10, 
					(int) (Math.random()*(270 - 10 + 1) ) + 10, 
					(int) (Math.random()*(765/2 - 10 + 1) ) + 10, 
					(int) (Math.random()*(270 - 10 + 1) ) + 10);
			
		}
		
		//top right (100 random squares)
		int count2 = 0;
		while(count2 <= 100) {
			count2++;
			g2.setColor( new Color((int) (Math.random()*(255 - 0 + 1)) + 0,
					(int) (Math.random()*(255 - 0 + 1)) + 0, 
					(int) (Math.random()*(255 - 0 + 1)) + 0));
			
			g2.fillRect((int) (Math.random()*(715 - 765/2 + 1) ) + 765/2, 
					(int) (Math.random()*(220 - 10 + 1) ) + 10,
					50, 
					50);
		}
		
		//bottom left (100 random circles)
		int count3 = 0;
		while(count3 <= 100) {
			count3++;
			g2.setColor( new Color((int) (Math.random()*(255 - 0 + 1)) + 0,
					(int) (Math.random()*(255 - 0 + 1)) + 0, 
					(int) (Math.random()*(255 - 0 + 1)) + 0));
			
			int diameter = (int) (Math.random()*(200 - 0 + 1)) + 0;
			
			g2.drawOval((int) (Math.random()*((765/2 - diameter - 1) - 10 + 1) ) + 10, 
					(int) (Math.random()*((540 - diameter - 1) - 270 + 1) ) + 270, 
					diameter, 
					diameter);
		}
		
		//bottom right (box thing)
		g2.setColor(Color.yellow);
		g2.fillRect(500, 350, 100, 100);
		
		g2.setColor(Color.red);
		g2.fillRect(550, 400, 100, 100);
		
		g2.setColor(Color.blue);
		int [] bluex = {600, 600, 650};
		int [] bluey = {350, 400, 400};
		int bluePoints = 3;
		g2.fillPolygon(bluex, bluey, bluePoints);
		
		g2.setColor(Color.green);
		int [] greenx = {500, 500, 550, 550};
		int [] greeny = {350, 450, 500, 400};
		int greenpoints = 4;
		g2.fillPolygon(greenx, greeny, greenpoints);
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
