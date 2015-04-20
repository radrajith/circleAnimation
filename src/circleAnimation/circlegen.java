package circleAnimation;
import java.util.Random;

import javax.swing.JPanel;

import  java.awt.*;
 
public class circlegen extends JPanel{
	final int size = 500;					//setting size for the frame and random location generator
	static Random randomInt = new Random();
	Color color = new Color(randomInt.nextInt(255),randomInt.nextInt(255),randomInt.nextInt(255));
	public int zoom_circle;
	int posx = size/2;
	int posy = size/2;
	public int setZoom_circle(){			//increment zoom circle variable when called.
		this.zoom_circle++;
		return zoom_circle;
	}
	public static int randNum(){			//create a random radius values between 50- 150
		int radius = randomInt.nextInt(100)+50;
		return radius;
	}
	public static Color randColor(){		//generate random rgb color.
		Color color = new Color(randomInt.nextInt(255),randomInt.nextInt(255),randomInt.nextInt(255));
		return color;
	}
	
	public circlegen(){}			//default constructor

	public void makeShape(){		//drawing the shapes by calling the paint component method
		repaint();
		
	}
	public void paintComponent(Graphics g){		//draws the shapes and fills it with color
		super.paintComponent(g);
		g.setColor(color);
		int radius = circlegen.randNum();
		g.fillOval(posx,posy, zoom_circle,zoom_circle);
		
		if(zoom_circle>=100){		//check if the size = 100, then create a new color and new axis 
			this.zoom_circle = 0;
			color = new Color(randomInt.nextInt(255),randomInt.nextInt(255),randomInt.nextInt(255));
			posx = randomInt.nextInt(size-radius);
			posy = randomInt.nextInt(size-radius);
			}
		}
	}
	


