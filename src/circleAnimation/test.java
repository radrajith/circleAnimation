package circleAnimation;

import javax.swing.JFrame;


public class test {
	public static void main(String[] args){
		//setting up the frame window
		circlegen shape = new circlegen();
		circlegen[] multiShape = new circlegen[10];
		JFrame frame = new JFrame("Circle animations effect");
		frame.setVisible(true);
		frame.setSize(shape.size,shape.size);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(shape);
		//creates objects for the array. 
		for(int i=0; i<multiShape.length; i++){
			multiShape[i] = new circlegen();
		}
		
		while(true){
			
			//for(int i=1; i<multiShape.length; i++){
				multiShape[0].setZoom_circle();
				multiShape[0].makeShape();
				System.out.println(multiShape[0].setZoom_circle());
			//}
			
			
			//shape.setZoom_circle();
			//shape.makeShape();
			
		
		//delaying the loop by .05s
			try {
				Thread.sleep(5);                 
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}
}
		
