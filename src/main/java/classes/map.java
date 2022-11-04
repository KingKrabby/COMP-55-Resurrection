package classes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import org.apache.commons.math3.ode.events.Action;

import acm.program.GraphicsProgram;

public class map extends GraphicsProgram implements ActionListener{
	Timer t = new Timer(1000,this);
	score_streak box;
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
	
	public class Waction extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	public class Aaction extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	public class Saction extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	public class Daction extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	public class escape extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	} 

}