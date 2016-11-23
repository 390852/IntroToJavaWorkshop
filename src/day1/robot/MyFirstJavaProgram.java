package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot steve = new Robot();
		steve.move(150);
		steve.penDown();
		steve.setPenColor(300,17,105);
		for (int i = 0; i < 5; i++) {
		steve.move(90);
		steve.turn(360/5);
			
		}
	}
}
		
		
        		

	
		
		

