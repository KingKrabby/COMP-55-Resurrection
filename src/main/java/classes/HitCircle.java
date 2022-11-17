package classes;
import acm.program.*;
import acm.util.*;
import java.awt.*;


public class HitCircle {
	public int hitCircleX;
	public int hitCircleY;
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
	  		GImage singleHitCircle = new GImage();
	  		add(singleHitCircle);
	  	}
	  	if (numHitCircles ==2) {
	  		GImage hitCircle1 = new GImage();
	  		add(hitCircle1);
	  		GImage hitCircle2 = new GImage();
	  		add(hitCircle2);
	  	}
	  
	  }
	 */
	
}