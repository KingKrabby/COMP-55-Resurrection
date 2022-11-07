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
	ArrayList<Spawner> spawners = new ArrayList<Spawner>();
	ArrayList<HitCircle> hitCircles = new ArrayList<HitCircle>();

	Conveyor(int currLength, int currNoteSpeed, boolean currHard) {
		length = currLength;
		noteSpeed = currNoteSpeed;
		numConveyors = 1;
		if (currHard == true) {
			numConveyors = 2;
		}
			for (int i = 0; i < numConveyors; i++) {
				//?? idk how spawners will work yet
				//trying to add spawners to arraylist
				//add hitcircles to arraylist
			}
		
			
	}
	
	//public void moveNote() {
		//get info from spawner to move note
		//timer?
		//conductor?
	//}
	
	//maybe moveNote() should be in graphics?
	
	


}