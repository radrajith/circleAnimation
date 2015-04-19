package circleAnimation;

import javax.swing.JFrame;


public class test {
	public static void main(String[] args){
		//setting up the frame window
		circlegen shape = new circlegen();
		JFrame frame = new JFrame("Circle animations effect");
		frame.setVisible(true);
		frame.setSize(shape.size,shape.size);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(shape);
		while(true){
		shape.zoom_circle++;
		shape.makeShape();
		//delaying the loop by .05s
		try {
		    Thread.sleep(5);                 
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		}
	}
}
		
