package classes;
import acm.program.*;
import acm.util.*;
import java.awt.*;


public class HitCircle {
	public int hitCircleX;
	public int hitCircleY;
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	//public static final int x1; will be for HitCircle on large conveyor
	//public static final int y1; will be for HitCircle on large conveyor
	//public static final int x2; will be for first HitCircle on smaller conveyors
	//public static final int y2; will be for first HitCircle on smaller conveyors
	//public static final int x3; will be for second HitCircle on smaller conveyors
	//public static final int y3; will be for second HitCircle on smaller conveyors
	
	
	//int numHitCircles;
	//need to find way to retrieve hitcircle num from mapdatabase?
	//or maybe change constructor to have number parameter
	
	HitCircle(int x, int y) {
			hitCircleX = x;
			hitCircleY = y;
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
	
	/*
	 //public void setUpHitCircle() {
	  	if (numHitCircles == 1) {
	  		GImage singleHitCircle = new GImage(name, x1, y1);
	  		add(singleHitCircle);
	  	}
	  	if (numHitCircles ==2) {
	  		GImage hitCircle1 = new GImage(name, x2, y2);
	  		add(hitCircle1);
	  		GImage hitCircle2 = new GImage(name, x3, y3);
	  		add(hitCircle2);
	  	}
	  
	  }
	 */
	
}