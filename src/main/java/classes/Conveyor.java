package classes;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.*;
import java.util.*;

public class Conveyor {
	public int length;
	public int noteSpeed;
	public boolean hardMode;
	int numConveyors;
	//ArrayList<Spawner> spawners = new ArrayList<Spawner>(); no longer needed due to map database? fds
	//ArrayList<HitCircle> hitCircles = new ArrayList<HitCircle>(); no longer needed due to map database?

	Conveyor(int currLength, int currNoteSpeed, boolean currHard) {
		length = currLength;
		noteSpeed = currNoteSpeed;
		numConveyors = 1;
		if (currHard == true) {
			numConveyors = 2;
		}
			//for (int i = 0; i < numConveyors; i++) {
				//?? idk how spawners will work yet
				//trying to add spawners to arraylist
				//add hitcircles to arraylist
			//}
	
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
	
	
	public void moveNote(Food foodMoving) {
		/* 
		purpose: moving ingredient across screen
		gets reaction time from conductor: 
			reaction time is number of beats the user sees before they need to hit it
		gets bpm from conductor: 
			bpm = beats/60 seconds 
		timer to move note?
		should get food item as input
		
		in map:
		for (int i = 0; i < level1.length(); i++) {
			belt.moveNote(level1[i]);
		}
		
		?? this is graphics is it not am i stupid
		dont think this is needed in this class honestly?
		
		
		*/
		
		
	}

}