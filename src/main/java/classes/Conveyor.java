package classes;

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

}