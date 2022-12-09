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
import edu.pacific.comp55.starter.GraphicsApplication;

public class Map_graphics extends Map implements KeyListener {
	private Level current;
	public Map_graphics(Level c){
		this.current = c;
	}
	GraphicsApplication app = this;
	long start, end;
	int speed = 8;
	int count = 0;
	int spawned = 0;
	GImage overall_delete;
	ArrayList <GImage> spawned_list = new ArrayList<GImage> ();
	ArrayList <GImage> passed_hit_circle = new ArrayList<GImage> ();
	ArrayList <String> food_images = new ArrayList<String> ();
	// String[] food_images = new String[] {"bun", "ketchup", "tofu", "tomato"};

	GRect score_streak;
	GLabel score1;
	GLabel streak1;
	GLabel fail1;
	GImage wasd = new GImage("wasd2.png", 200,0);
	int fail_x = 0;
	Timer score_streak_graphic;
	
	public static final String MUSIC_FOLDER = "sounds";
	

	
	public void run() {
		if (current == level_2) {
			speed = 20;
		}
		System.out.println("Current: " + curr_level_num);
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
		
		score_streak_graphic = new Timer(score_streak_ms, this);
		add(score_streak);
		score1 = new GLabel("Score: " + box.get_score(),0, 20);
		streak1 = new GLabel("Streak: " + box.get_streak(),0, 40);
		fail1 = new GLabel("Fail: " ,0, 60);
		add(fail1);
		
		
		score_streak_graphic.start();
		add(score1);
		add(streak1);
		add(wasd);
		
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
	public void reset() {
		overall_delete = null;
		spawned_list = new ArrayList<GImage> ();
		passed_hit_circle = new ArrayList<GImage> ();
		food_images = new ArrayList<String> ();
		score_streak_graphic.stop();
	}
	
	boolean failed(Score_streak current) {
		//activates when buttons are pressed
		// looks at current map --> fail screen
		if (box.get_failCount() + passed_hit_circle.size() >= 3) {
			box.reset_fail();
			return true;
		}
		return false;
	}

	
	boolean passed(int score) {
		
		if(score == 1) {
			return true;
		}
		return false;
		

	}
	public void stopMusic() {
		Song test = Song.getInstance();
		test.stopSound(MUSIC_FOLDER, current.get_string());
	}
	//Spawner
	void spawn_food() {
		long end = System.currentTimeMillis();
		int i = 0;
		ArrayList<Food> items = current.getFoodList();
		
		for (Food f: items) {
			long elapsed = end - start;

			if (elapsed > f.getDuration() && count == i) {
				GImage image = creates_new_image(f);
				add(image);
				spawned_list.add(image);
				count ++;
				spawned ++;
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

	
	
	String check() {
		int i = 0;
		if (spawned_list.size() > 0) {
			for (GImage f: spawned_list) {
				if(f.getX() > 575 && f.getX() < 625) {
					String str = food_images.get(i);
					overall_delete = f;
					food_images.remove(i);
					return str;
				}
				i++;
			}
			
		}

		return "nope";

	}
	
	public void actionPerformed(ActionEvent e) {
//		System.out.println(spawned_list);
//		System.out.println(food_images);
		int score_streak_SIZE_x = 100;
		int score_streak_SIZE_y = 100;
		int score_streak_loc_x = 0;
		int score_streak_loc_y = 0;
		score_streak = new GRect(score_streak_loc_x, score_streak_loc_y, score_streak_SIZE_x,score_streak_SIZE_y );
		score1.setLabel("Score: " + box.get_score());
		streak1.setLabel("Streak: " + box.get_streak());
		int fail_x = 0;
		int total = box.get_failCount() + passed_hit_circle.size();
		fail_x += 25;
		if (total == 1) {
			GLabel x1 = new GLabel("X ", fail_x, 60);
			add(x1);
		}
		fail_x += 10;
		if (total == 2) {
			GLabel x2 = new GLabel("X ", fail_x, 60);
			add(x2);
		}
		fail_x += 10;
		if (total == 3) {
			GLabel x3 = new GLabel("X ", fail_x, 60);
			add(x3);
		}


		ArrayList<GImage> to_delete = new ArrayList<GImage> ();
		spawn_food();
		int count = 0;
		if (spawned_list.size() > 0) {
			for (GImage i: spawned_list) {
				i.move(speed, 0);
				if (i.getX() > 625) {
					food_images.remove(count);
					passed_hit_circle.add(i);
					to_delete.add(i);
					remove(getElementAt((i.getX()), (i.getY())));
					box.reset_streak();
					if (failed(box)) {
						stopMusic();
						box.reset();
						reset();
						Fail_screen f = new Fail_screen(current);
						f.start();
						score_streak_graphic.stop();
					}
				}
				count ++;
			}
			for (GImage a: to_delete) {
				spawned_list.remove(a);
			}
		}


	}
	
	@Override
	
	public void keyPressed(KeyEvent e) {
		//box_display_off();
		int key = e.getKeyCode();
		//up = bun
		//down = ketchup
		//left = tofu 
		//right = tomato
		//W
		if (key == KeyEvent.VK_W) {
			if (check() == "bun") {
				box.incrementScore();
				box.incrementStreak();
				spawned_list.remove(overall_delete);
				remove(getElementAt(overall_delete.getX(), overall_delete.getY()));
			}
		}
		if (key == KeyEvent.VK_A) {
			if (check() == "tofu") {
				box.incrementScore();
				box.incrementStreak();
				spawned_list.remove(overall_delete);
				remove(getElementAt(overall_delete.getX(), overall_delete.getY()));
			}
		}
		if (key == KeyEvent.VK_S) {
			if (check() == "ketchup") {
				box.incrementScore();
				box.incrementStreak();
				spawned_list.remove(overall_delete);
				remove(getElementAt(overall_delete.getX(), overall_delete.getY()));
				
			}
		}
		if (key == KeyEvent.VK_D) {
			if (check() == "tomato") {
				box.incrementScore();
				box.incrementStreak();
				spawned_list.remove(overall_delete);
				remove(getElementAt(overall_delete.getX(), overall_delete.getY()));
			}
		}
		if (failed(box) ){
			box.reset_fail();
			stopMusic();
			reset();
			Fail_screen f = new Fail_screen(current);
			f.start();
			//app.switch
		}
		if (passed(box.get_score())) {
			box.reset_fail();
			stopMusic();
			reset();
			Pass_screen p = new Pass_screen(current);
			p.start();
		}
		//box_display_on();
		 
	}
	
	
	public static void main(String args[]) {
		//new Map_graphics().start();
	}
	
	 
}