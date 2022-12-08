package classes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.Timer;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Map_graphics extends Map implements KeyListener {
	long start, end;
	int speed = 3;
	int count = 0;
	ArrayList <GImage> spawned_list = new ArrayList<GImage> ();
	ArrayList <GImage> passed_hit_circle = new ArrayList<GImage> ();
	ArrayList <String> food_images = new ArrayList<String> ();
	// String[] food_images = new String[] {"bun", "ketchup", "tofu", "tomato"};
	
	
	public void run() {
		start = System.currentTimeMillis();
		requestFocus();
		addKeyListeners();
		//play game background 
		GImage blue = new GImage("title_screen_bluebackground.jpg", 0, 0);
		add(blue);
		
		//DJ
		GImage dj = new GImage("DJ 1.png", 270, 285);
		add(dj);
		
		// Score Streak box
		int score_streak_SIZE_x = 100;
		int score_streak_SIZE_y = 100;
		int score_streak_loc_x = 0;
		int score_streak_loc_y = 0;
		int score_streak_ms = 50;
		GRect score_streak = new GRect(score_streak_loc_x, score_streak_loc_y, score_streak_SIZE_x,score_streak_SIZE_y );
		score_streak.setFillColor(Color.white);
		score_streak.setFilled(true);
		
		Timer score_streak_graphic = new Timer(score_streak_ms, this);
		GLabel score1;
		GLabel streak1;
		GLabel fail;
		add(score_streak);
		score1 = new GLabel("Score: " + box.get_score(),0, 20);
		streak1 = new GLabel("Streak: " + box.get_streak(),0, 40);
		int fail_x = 0;
		fail = new GLabel("Fail: " ,0, 60);
		add(fail);
		fail_x += 25;
		for (int i = 0; i < + box.get_failCount(); i++) {
			fail = new GLabel("X " , fail_x, 60);
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

		
		// hit Circle
		final int WINDOW_WIDTH = 800;
		final int WINDOW_HEIGHT = 600;
		final int h1 = 550; //will be for HitCircle on large conveyor
		final int w1 = 400; //will be for HitCircle on large conveyornb
		final int h2 = 275; //will be for first HitCircle on smaller conveyor
		final int w2 = 400; //will be for first HitCircle on smaller conveyor
		final int h3 = 425; //will be for second HitCircle on smaller conveyor
		final int w3 = 400; //will be for second HitCircle on smaller conveyor
		//int numHitCircles;
	  	if (current.getHitCircle().returnNHC() == 1) {
	  		GImage singleHitCircle = new GImage("hitcircle.png", h1, w1);
	  		add(singleHitCircle);
	  	}
	  	if (current.getHitCircle().returnNHC() == 2) {
	  		GImage hitCircle1 = new GImage("hitcircle.png", h2, w2);
	  		add(hitCircle1);
	  		GImage hitCircle2 = new GImage("hitcircle.png", h3, w3);
	  		add(hitCircle2);
	  	}
	  	
	  	GImage logo = new GImage("World's Hardest Games Logo.png", 680, -20);
		logo.sendToFront();
  		add(logo);

	}
	
	boolean fail(Score_streak current) {
		System.out.println("fail");
		//activates when buttons are pressed
		// looks at current map --> fail screen
		if (box.get_failCount() + passed_hit_circle.size() >= 3) {
			box.reset_fail();
			return true;
		}
		int score_streak_SIZE_x = 100;
		int score_streak_SIZE_y = 100;
		int score_streak_loc_x = 0;
		int score_streak_loc_y = 0;
		GRect score_streak = new GRect(score_streak_loc_x, score_streak_loc_y, score_streak_SIZE_x,score_streak_SIZE_y );
		add(score_streak);
		GLabel score1 = new GLabel("Score: " + current.get_score(),0, 20);
		GLabel streak1 = new GLabel("Streak: " + current.get_streak(),0, 40);
		int fail_x = 0;
		GLabel fail = new GLabel("Fail: " ,0, 60);
		add(fail);
		fail_x += 25;
		for (int i = 0; i < + current.get_failCount(); i++) {
			fail = new GLabel("X " , fail_x, 60);
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
	//Spawner
	void spawn_food() {
		long end = System.currentTimeMillis();
		int i = 0;
		ArrayList<Food> items = current.getFoodList();
		
		for (Food f: items) {
			long elapsed = end - start;

			if (elapsed > f.getDuration() && count == i) {
				System.out.println(count);
				System.out.println(i);
				GImage image = creates_new_image(f);
				add(image);
				spawned_list.add(image);
				count ++;
				
			}
			i ++;
		}
	}
	GImage creates_new_image(Food food) {
		GImage item = null;
		int x = 0;
		int y = 435;
		FoodType type = food.getFoodType();
		if (type == FoodType.BUN) {
			item = new GImage("bun.png", x, y);
			food_images.add("bun");
		}
		if (type == FoodType.KETCHUP) {
			item = new GImage("ketchup.png", x, y);
			food_images.add("ketchup");
			
		}
		if (type == FoodType.TOFU) {
			item = new GImage("tofu.png", x, y);
			food_images.add("tofu");
			
		}
		if (type== FoodType.TOMATO) {
			item = new GImage("tomato.png", x, y);
			food_images.add("tomato");
		}
		return item;
	}
	public void actionPerformed(ActionEvent e) {
		spawn_food();
		for (GImage i: spawned_list) {
			i.move(speed, 0);
		}
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