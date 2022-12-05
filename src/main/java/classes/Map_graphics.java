package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Map_graphics extends Map{

	
	
	
	public void run() {
		//play game background
		GImage blue = new GImage("title_screen_bluebackground.jpg", 200, 200);
		add(blue);
		// Score Streak box
		int score_streak_SIZE_x = 60;
		int score_streak_SIZE_y = 50;
		int score_streak_loc_x = 0;
		int score_streak_loc_y = 40;
		int score_streak_ms = 50;
		GRect score_streak = new GRect(score_streak_loc_x, score_streak_loc_y, score_streak_SIZE_x,score_streak_SIZE_y );
		Timer score_streak_graphic = new Timer(score_streak_ms, this);
		GLabel score1;
		GLabel streak1;
		GLabel fail;
		add(score_streak);
		score1 = new GLabel("Score: " + box.get_score(),0, 50);
		streak1 = new GLabel("Streak: " + box.get_streak(),0, 60);
		int fail_x = 0;
		fail = new GLabel("Fail: " ,0, 70);
		add(fail);
		fail_x += 25;
		for (int i = 0; i < + box.get_failCount(); i++) {
			fail = new GLabel("X " , fail_x, 70);
			fail_x += 10;
			add(fail);
		}
		
		score_streak_graphic.start();
		add(score1);
		add(streak1);
		
		// Conveyor
		final int x1 = 0; //still need to initialize these
		final int y1 = 500; 
		final int x2 = 400;
		final int y2 = 500; 
	  	if (current.getConveyorBelt().getNumConveyors() == 1) {
	  		GImage singleConveyor = new GImage("longconveyor.png", x1, y1);
	  		add(singleConveyor);
	  	}
	  	
	  	if (current.getConveyorBelt().getNumConveyors() ==2) {
	  		GImage conveyor1 = new GImage("conveyor2.png", x1, y1);
	  		add(conveyor1);
	  		
	  		GImage conveyor2 = new GImage("conveyor2.png", x2, y2);
	  		add(conveyor2);
	  	}
		// Spawner
		
		
		// hit Circle
	}
	public static void main(String args[]) {
		//new Map_graphics().start();
	}
	
	
}