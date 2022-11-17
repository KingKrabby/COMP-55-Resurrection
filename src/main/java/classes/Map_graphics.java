package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Map_graphics extends GraphicsProgram implements ActionListener{
	
	
	// Conveyor
	
	// fail screen, pass screen, menu, play game screen classes
		// fail
		// pass 
		// menu 
		// play
	
	
	
	
	// score streak 

		int score_streak_SIZE = 100;
		int score_streak_loc_x = 400;
		int score_streak_loc_y = 400;
		int score_streak_ms = 50;
		GRect score_streak = new GRect(score_streak_SIZE, score_streak_SIZE, score_streak_loc_x,score_streak_loc_y );
		Timer score_streak_graphic = new Timer(score_streak_ms, this);
		GLabel score;
		GLabel streak;
		GLabel fail; 
		
	
	// spawner
	
	
	// Food items 
	public void run() {
		
	}
	public static void main(String args[]) {
		//new Map_graphics().start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}