package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Map_graphics extends Map implements KeyListener {

	
	
	
	public void run() {
		addKeyListeners();
		//play game background 
		GImage blue = new GImage("title_screen_bluebackground.jpg", 0, 0);
		add(blue);
		
		//DJ
		GImage dj = new GImage("DJ 1.png", 270, 285);
		add(dj);
		
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
	  	Food currentNote = current.getConductor().getCurrentNote(current.get_string());
		double currentBeat = current.getConductor().getCurrentBeat(current.get_string());
		GImage toBeSpawned = null;
		if (Math.round(currentNote.getSpawnBeat()) == Math.round(currentBeat)) {
			if (currentNote.getFoodType() == FoodType.BUN) {
				toBeSpawned = new GImage("bun.png", 10, 10);
				add(toBeSpawned);
			}
			if (currentNote.getFoodType() == FoodType.KETCHUP) {
				toBeSpawned = new GImage("ketchup.png", 10, 10);
				add(toBeSpawned);
			}
			if (currentNote.getFoodType() == FoodType.TOFU) {
				toBeSpawned = new GImage("tofu.png", 10, 10);
				add(toBeSpawned);
			}
			if (currentNote.getFoodType() == FoodType.TOMATO) {
				toBeSpawned = new GImage("tomato.png", 10, 10);
				add(toBeSpawned);
			}
			if (toBeSpawned != null) {
				toBeSpawned.move(5, 300);
			}
		}
		
		// hit Circle
		final int WINDOW_WIDTH = 800;
		final int WINDOW_HEIGHT = 600;
		final int h1 = 550; //will be for HitCircle on large conveyor
		final int w1 = 400; //will be for HitCircle on large conveyornb
		final int h2 = 275; //will be for first HitCircle on smaller conveyor
		final int w2 = 400; //will be for first HitCircle on smaller conveyor
		final int h3 = 425; //will be for second HitCircle on smaller conveyor
		final int w3 = 400; //will be for second HitCircle on smaller conveyor
		int numHitCircles;
	  	if (current.get_string() == "level1.mp3" || current.get_string() == "level2") {
	  		GImage singleHitCircle = new GImage("hitcircle.png", h1, w1);
	  		add(singleHitCircle);
	  	}
	  	if (current.get_string() == "level3.mp3") {
	  		GImage hitCircle1 = new GImage("hitcircle.png", h2, w2);
	  		add(hitCircle1);
	  		GImage hitCircle2 = new GImage("hitcircle.png", h3, w3);
	  		add(hitCircle2);
	  	}

	}
	boolean fail(Score_streak current) {
		System.out.println("fail");
		//activates when buttons are pressed
		// looks at current map --> fail screen
		if (box.get_failCount() == 3) {
			box.reset_fail();
			return true;
		}
		int score_streak_SIZE_x = 60;
		int score_streak_SIZE_y = 50;
		int score_streak_loc_x = 0;
		int score_streak_loc_y = 40;
		GRect score_streak = new GRect(score_streak_loc_x, score_streak_loc_y, score_streak_SIZE_x,score_streak_SIZE_y );
		add(score_streak);
		GLabel score1 = new GLabel("Score: " + current.get_score(),0, 50);
		GLabel streak1 = new GLabel("Streak: " + current.get_streak(),0, 60);
		int fail_x = 0;
		GLabel fail = new GLabel("Fail: " ,0, 70);
		add(fail);
		fail_x += 25;
		for (int i = 0; i < + current.get_failCount(); i++) {
			fail = new GLabel("X " , fail_x, 70);
			fail_x += 10;
			add(fail);
		}
		
		
		add(score1);
		add(streak1);
		return false;
	}
	boolean pass(int score, Level level) {
		System.out.println("pass");
		if(score == level.get_food_length()) {
			box.reset();
			curr_level_num ++;
			if (curr_level_num < 3) {
				current = level_arr[curr_level_num];
			}
			pass.run();
			return true;
		}
		return false;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar());
		int key = e.getKeyCode();
		System.out.println(current.get_string());
		
		//current.getConductor().playSong(current.get_string());
		
		Food curr_food = current.getConductor().getCurrentNote(current.get_string());
		if (key == KeyEvent.VK_W) {
			if (curr_food.getFoodType().toString() == "bun" && current.getHitCircle().isHit(curr_food, current)) {
				box.incrementScore();
				GImage dj = new GImage("DJ 2.png", 270, 285);
				add(dj);
				dj = new GImage("DJ 1.png", 270, 285);
				add(dj);
			}
			else {
				box.reset_streak();
				box.incrementFail();
				
			}
			
			if (fail(box)) {
				System.out.println("before");
				current.getConductor().stopSong(current.get_string());
				System.out.println("after");
				
				System.out.println("failure");
				fail.start();
			}
			if (pass(box.get_score(), current)) {
				System.out.println("lol");
				current.getConductor().stopSong(current.get_string());
				pass.start();
			}
			
		}
		if (key == KeyEvent.VK_A) {
			if (curr_food.getFoodType().toString()== "tomato" && current.getHitCircle().isHit(curr_food, current)) {
				box.incrementScore();
				GImage dj = new GImage("DJ 2.png", 270, 285);
				add(dj);
				dj = new GImage("DJ 1.png", 270, 285);
				add(dj);
			}
			else {
				box.reset_streak();
				box.incrementFail();
			}
			if (fail(box)) {
				current.getConductor().stopSong(current.get_string());
				fail.start();
			}
			if (pass(box.get_score(), current)) {
				current.getConductor().stopSong(current.get_string());
				pass.start();
			}
		}
		if (key == KeyEvent.VK_S) {
			if (curr_food.getFoodType().toString()== "tofu" && current.getHitCircle().isHit(curr_food, current)) {
				box.incrementScore();
				GImage dj = new GImage("DJ 2.png", 270, 285);
				add(dj);
				dj = new GImage("DJ 1.png", 270, 285);
				add(dj);
			}
			else {
				box.reset_streak();
				box.incrementFail();
			}
			if (fail(box)) {
				current.getConductor().stopSong(current.get_string());
				fail.start();
			}
			if (pass(box.get_score(), current)) {
				current.getConductor().stopSong(current.get_string());
				pass.start();
			}
		}
		if (key == KeyEvent.VK_D) {
			if (curr_food.getFoodType().toString()== "bun" && current.getHitCircle().isHit(curr_food, current)) {
				box.incrementScore();
				GImage dj = new GImage("DJ 2.png", 270, 285);
				add(dj);
				dj = new GImage("DJ 1.png", 270, 285);
				add(dj);
				
			}
			else {
				box.reset_streak();
				box.incrementFail();
			}
			if (fail(box)) {
				current.getConductor().stopSong(current.get_string());
				fail.start();
			}
			if (pass(box.get_score(), current)) {
				current.getConductor().stopSong(current.get_string());
				pass.start();
			}
		}
		
		
	}
	
	public static void main(String args[]) {
		//new Map_graphics().start();
	}
	
	 
}