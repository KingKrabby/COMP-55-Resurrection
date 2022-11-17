package classes;
import acm.program.*;
import acm.util.*;
import java.awt.*;

public class Conveyor {
	public int length;
	public int noteSpeed;
	public boolean hardMode;
	int numConveyors;
	
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
	  		GImage singleConveyor = new GImage();
	  		add(singleConveyor)
	  	}
	  	if (numConveyors ==2) {
	  		GImage conveyor1 = new GImage();
	  		add(conveyor1);
	  		GImage conveyor2 = new GImage();
	  		add(conveyor2);
	  	}
	  
	  }
	 */
}