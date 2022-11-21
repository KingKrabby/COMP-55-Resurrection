package classes;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.*;

public class HitCircle extends GraphicsProgram {
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	public static final int x1 = 0; //will be for HitCircle on large conveyor
	public static final int y1 = 0; //will be for HitCircle on large conveyor
	public static final int x2 = 0; //will be for first HitCircle on smaller conveyors
	public static final int y2 = 0; //will be for first HitCircle on smaller conveyors
	public static final int x3 = 0; //will be for second HitCircle on smaller conveyors
	public static final int y3 = 0; //will be for second HitCircle on smaller conveyors b
	public int numHitCircles;
	
	
	//int numHitCircles;
	//need to find way to retrieve hitcircle num from mapdatabase?
	//or maybe change constructor to have number parameter
	
	HitCircle(int z) {
			numHitCircles = z;
	}		

	public boolean isHit(Food currentFood, Level currentLevel) { 
		//currentBeat will be from conductor and spawnOnBeat will be from Food
		double currentBeat = currentLevel.getConductor().getCurrentBeat(currentLevel.get_string());
		double spawnOnBeat = currentFood.getSpawnBeat();
		if ((currentBeat <= (spawnOnBeat + 0.25)) && currentBeat >= (spawnOnBeat - 0.25)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	 public void run() {
	  	if (numHitCircles == 1) {
	  		GImage singleHitCircle = new GImage("hitcircle.png", x1, y1);
	  		add(singleHitCircle);
	  	}
	  	if (numHitCircles ==2) {
	  		GImage hitCircle1 = new GImage("hitcircle.png", x2, y2);
	  		add(hitCircle1);
	  		GImage hitCircle2 = new GImage("hitcircle.png", x3, y3);
	  		add(hitCircle2);
	  	}
	  
	  }
	 
	
}