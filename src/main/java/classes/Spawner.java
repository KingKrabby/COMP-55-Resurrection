package classes;
import java.awt.Color;
import java.awt.event.KeyEvent;
import acm.program.*;
import acm.graphics.*;


public class Spawner{
	public Spawner(int x, int y, Boolean hard) {
		spawnerX = x;
		spawnerY = y;
		hardMode = hard;
	}
	Boolean hardMode;
	int spawnerX;
	int spawnerY;
}