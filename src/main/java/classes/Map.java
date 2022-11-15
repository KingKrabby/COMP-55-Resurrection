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
	Score_streak box;
	int map_track  = 0;
	Timer g;
	Conductor bob;
	
	
	// All Maps
	Title_screen title; // 0
	Menu_screen menu; // 1
	Pass_screen pass; // 2
	Play_game game; // 3
	
	// 3 Levels
	Map_Database data;
	
	Level level_1 = data.get_level1();
	Level level_2 = data.get_level2();
	Level level_3 = data.get_level3();
	

	// int: current note -- > pulls from conductor
	//gets boolean from conveyor
	
	Action Waction;
	Action Aaction;
	Action Saction;
	Action Daction;
	Action escape;
	// All map library
	
	//Title Screen
	//Take Screen to menu screen
	
	
	
	
	boolean failChecker() {
		//activates when buttons are pressed
		// looks at current map --> fail screen
		if (box.get_failCount() == 3) {
			return true;
		}
		return false;
	}
	
	void Correct_button_Checker(Level level) {
		
	}
	void SpawnNotes() {
		// pulls from conductor
	}
	

	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		// if map.get(int) == play_game etc...
		//boolean of conveyor is true
		//perform action, which is to add to score streak box
		
		//TITLE 
		if (key == KeyEvent.VK_SPACE && map_track == 0) {
			map_track = 1 ;
			// employ graphics for Menu screen
			
			
		}
		//plays first level
		if (key == KeyEvent.VK_SPACE && map_track == 1) {
			map_track = 3 ;
			// employ graphics for first level
			
			
		}
		//plays tutorial
		if (key == KeyEvent.VK_L && map_track == 1) {
			map_track = 1 ;
			// employ graphics for tutorial
			
			
		}
		//exit
		if (key == KeyEvent.VK_ESCAPE && map_track == 1) {
			map_track = 0 ;
			// employ graphics for title screen
			
			
		}
		
		
	}
	//for play_game
	public void play_game_check(KeyEvent e) {
		int key = e.getKeyCode();
		if (map_track == 3) {
			//how to implement tutorial
			//after pressing a button, do HitCircle
			//if HitCircle is positive, run score_streak box functions
			
			//waiting for Map_data base to be filled up
			
			//must extract food item for different levels
			//press W
			Level current = level_1;
			// Play song
			// song updates a variable
			
			/*	food = current.getConductor.getCurrentNote;
			 *  if (food.getFoodtype == "Bun and current.getHitCircle.isHit(food)){
			 *  }
			 */
			Food curr_food = current.getConductor().getCurrentNote(current.get_string());
			
			if (key == KeyEvent.VK_W) {
				if (curr_food.getFoodType().toString() == "bun" && current.getHitCircle().isHit(curr_food)) {
					box.incrementScore();
				}
				else {
					box.reset_streak();
					box.incrementFail();
				}
			}
			// press A
			if (key == KeyEvent.VK_A) {
				if (curr_food.getFoodType().toString() == "tomato" && current.getHitCircle().isHit(curr_food)) {
					box.incrementScore();
				}
				else {
					box.reset_streak();
					box.incrementFail();
				}
				
			}
			//press S
			if (key == KeyEvent.VK_S) {
				if (curr_food.getFoodType().toString() == "tofu" && current.getHitCircle().isHit(curr_food)) {
					box.incrementScore();
				}
				else {
					box.reset_streak();
					box.incrementFail();
				}
				
			}
			//press D
			if (key == KeyEvent.VK_D) {
				if (curr_food.getFoodType().toString() == "bun" && current.getHitCircle().isHit(curr_food)) {
					box.incrementScore();
				}
				else {
					box.reset_streak();
					box.incrementFail();
				}
				
			}
			//press escape
			if (key == KeyEvent.VK_ESCAPE) {
				// leaves the game
				
			}
		}
		// passing level conditions
		// converts map track: 3 -- > 2
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	@Override
	public void run() {
		t.start();
		t.stop();
		
	} 
	//root.getInputMap.put(Key.Stroke.getKeyStroke("w"), "Waction");
	//label.getActionMap().put("Waction",Waction);
	
	//map.getInputMap().put(Key.Stroke.getKeyStroke("a"), "Aaction");
	//label.getActionMap().put("Aaction",Aaction);
	
	//map.getInputMap().put(Key.Stroke.getKeyStroke("s"), "Saction");
	//label.getActionMap().put("Saction",Saction);
	
	//map.getInputMap().put(Key.Stroke.getKeyStroke("d"), "Daction");
	//label.getActionMap().put("daction",Daction);
	
	//map.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "escape");
	//label.getActionMap().put("escape",escape);
}