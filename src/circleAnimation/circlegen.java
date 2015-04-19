package circleAnimation;
import java.util.Random;

import javax.swing.JPanel;

import  java.awt.*;
 
public class circlegen extends JPanel{
	final int size = 500;					//setting size for the frame and random location generator
	static Random randomInt = new Random();
	Color color = new Color(randomInt.nextInt(255),randomInt.nextInt(255),randomInt.nextInt(255));
	public int zoom_circle = 0;
	int posx = size/2;
	int posy = size/2;
	
	public static int randNum(){
		int radius = randomInt.nextInt(100)+50;
		return radius;
	}
	public static Color randColor(){
		Color color = new Color(randomInt.nextInt(255),randomInt.nextInt(255),randomInt.nextInt(255));
		return color;
	}
	
	public circlegen(){}			//default constructor

	public void makeShape(){		//drawing the shapes by calling the paintcomponent method
		repaint();
		
	}
	public void paintComponent(Graphics g){		//draws the shapes and fills it with color
		super.paintComponent(g);
		g.setColor(color);
		int radius = circlegen.randNum();
		g.fillOval(posx,posy, zoom_circle,zoom_circle);
		if(zoom_circle>=100){
			zoom_circle=0;
			color = new Color(randomInt.nextInt(255),randomInt.nextInt(255),randomInt.nextInt(255));
			posx = randomInt.nextInt(size-radius);
			posy = randomInt.nextInt(size-radius);
			}
		}
	}
	


