import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import org.apache.commons.math3.ode.events.Action;

import acm.program.GraphicsProgram;

public class map extends GraphicsProgram implements ActionListener{
	Timer t = new Timer(1000,this);
	// Conveyor
	// int: current note -- > pulls from conductor
	Action Waction;
	Action Aaction;
	Action Saction;
	Action Daction;
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
	
	//map.getInputMap().put(Key.Stroke.getKeyStroke("w"), "Waction");
	//label.getActionMap().put("Waction",Waction);
	
	//map.getInputMap().put(Key.Stroke.getKeyStroke("a"), "Aaction");
	//label.getActionMap().put("Aaction",Aaction);
	
	//map.getInputMap().put(Key.Stroke.getKeyStroke("s"), "Saction");
	//label.getActionMap().put("Saction",Saction);
	
	//map.getInputMap().put(Key.Stroke.getKeyStroke("d"), "Daction");
	//label.getActionMap().put("daction",Daction);
	
	
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
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	} 

}