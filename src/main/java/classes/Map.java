package classes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import org.apache.commons.math3.ode.events.Action;

import acm.program.GraphicsProgram;

public class Map extends GraphicsProgram implements ActionListener{
	Timer t = new Timer(1000,this);
	Score_streak box = new Score_streak();
	int map_track  = 0;
	Timer g ;

	
	
	
	// All Maps
	
	static Title_screen title = new Title_screen(); // 0
	static Play_game game = new Play_game(); // 3
	static Menu_screen menu = new Menu_screen(game); // 1
	static Pass_screen pass = new Pass_screen(game); // 2
	
	// 3 Levels
	Map_Database data = new Map_Database();
	 
	Level level_1 = data.get_level1();
	Level level_2 = data.get_level2();
	Level level_3 = data.get_level3();
	Level[] level_arr = new Level[] {level_1, level_2, level_3};
	int curr_level_num = 0;
	Level current = level_1;
	
	boolean fail() {
		System.out.println("fail");
		//activates when buttons are pressed
		// looks at current map --> fail screen
		if (box.get_failCount() == 3) {
			box.reset_fail();
			return true;
		}
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
		 
		int key = e.getKeyCode(); 
		
		if (map_track == 0) {
			System.out.println("hello");
			//Run Title Graphics
			title.run();
			title.keyPressed(e);
		}
		if (map_track == 1) {
			System.out.println("hello");
			//Run Meu Graphics
			menu.run();
			menu.onSpacePressed(e);
			menu.onLPress(e);
			menu.keyPressed(e);
		}
		if (map_track == 2) {
			System.out.println("hello");
			pass.run();
			}
		
		if (map_track == 3) {
			//Run Game Graphics
			System.out.println("hello");
			if (curr_level_num >= 3) {
				map_track = 2;
			}
			pass(box.get_score(), current);
			box.run();
			game.run();
			current.getConductor().playSong(current.get_string());
			Food curr_food = current.getConductor().getCurrentNote(current.get_string());
			
			if (key == KeyEvent.VK_W) {
				if (curr_food.getFoodType().toString() == "bun" && current.getHitCircle().isHit(curr_food, current)) {
					box.incrementScore();
				}
				else {
					box.reset_streak();
					box.incrementFail();
					if (fail()) {
						current.getConductor().stopSong(current.get_string());
					}
				}
			} 
			// press A
			if (key == KeyEvent.VK_A) {
				
				if (curr_food.getFoodType().toString() == "tomato" && current.getHitCircle().isHit(curr_food, current)) {
					box.incrementScore();
				} 
				else { 
					box.reset_streak();
					box.incrementFail();
					if (fail()) {
						current.getConductor().stopSong(current.get_string());
					}
				}
				
			}
			//press S
			if (key == KeyEvent.VK_S) {
				if (curr_food.getFoodType().toString() == "tofu" && current.getHitCircle().isHit(curr_food, current)) {
					box.incrementScore();
				}
				else {
					box.reset_streak();
					box.incrementFail();
					if (fail()) {
						current.getConductor().stopSong(current.get_string());
					}
				}
				
			}
			//press D
			if (key == KeyEvent.VK_D) {
				if (curr_food.getFoodType().toString() == "bun" && current.getHitCircle().isHit(curr_food, current)) {
					box.incrementScore();
					current.getConductor().stopSong(current.get_string());
				}
				else {
					box.reset_streak();
					box.incrementFail();
					if (fail()) {
						current.getConductor().stopSong(current.get_string());
					}
				}
				
			}
			
		}

		
	}
	
	
	//Title Screen
	
	
	
	
	//Take Screen to menu screen
	public void run() {
		
	}
	
	public static void main(String args[]) {
		new Map().start();
		
		 
	}
	

}