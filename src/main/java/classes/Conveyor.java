package classes;
import acm.program.*;
import acm.util.*;
import java.awt.*;

public class Conveyor {
	public int length;
	public int noteSpeed;
	public boolean hardMode;
	int numConveyors;
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	//public static final int x1; will be for first conveyor
	//public static final int y1; will be for first conveyor
	//public static final int x2; will be for second conveyor
	//public static final int y2; will be for second conveyor

	
	
	Conveyor(int currLength, int currNoteSpeed, boolean currHard) {
		length = currLength;
		noteSpeed = currNoteSpeed;
		numConveyors = 1;
		if (currHard == true) {
			numConveyors = 2;
		}
	}
	
	public int getLength() {
		return length;
	}
	
	public int getnoteSpeed() {
		return noteSpeed;
	}
	
	public int getNumConveyors() {
		return numConveyors;
	}
	
	/*
	 //public void setUpConveyor() {
	  	if (numConveyors == 1) {
	  		GImage singleConveyor = new GImage(name, x1, y1);
	  		add(singleConveyor)
	  	}
	  	if (numConveyors ==2) {
	  		GImage conveyor1 = new GImage(name, x1, y1);
	  		add(conveyor1);
	  		GImage conveyor2 = new GImage(name, x2, y2);
	  		add(conveyor2);
	  	}
	  
		//need two different conveyor images, one for the big one and one for the half size
	  
	  }
	 */
}