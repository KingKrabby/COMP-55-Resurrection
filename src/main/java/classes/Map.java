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
	
	
	
	
	/*
	 * Will Run each one:
	 	* title screen -- > 0
		 * Menu Screen --> 1
		 * Pass Screen --> 2
		 * play game --> 3
	 */
	
	// Conveyor
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
	
	
	
	
	void failChecker() {
		//activates when buttons are pressed
		// looks at current map --> fail screen
		

	}
	
	void passChecker() {
		//activates when buttons are pressed
		// looks at current map --> pass screen
	}
	void SpawnNotes() {
		// pulls from conductor
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
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		// if map.get(int) == play_game etc...
		//boolean of conveyor is true
		//perform action, which is to add to score streak box
		
		if (key == KeyEvent.VK_SPACE && map_track == 0) {
			map_track = 1 ;
			// employ graphics for Menu screen
			
			
		}
		
		

		if (map_track == 2) {
			//after pressing a button, do HitCircle
			//if HitCircle is positive, run score_streak box functions
			//press W
			if (key == KeyEvent.VK_W) {
				
			}
			// press A
			if (key == KeyEvent.VK_A) {
				
			}
			//press S
			if (key == KeyEvent.VK_S) {
				
			}
			//press D
			if (key == KeyEvent.VK_D) {
				
			}
			//press escape
			if (key == KeyEvent.VK_ESCAPE) {
				
			}
		}

		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	@Override
	public void run() {
		
		
	} 

}