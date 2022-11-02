import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import acm.program.GraphicsProgram;

public class map extends GraphicsProgram implements ActionListener{
	Timer t = new Timer(1000,this);
	// Conveyor
	// int: current note -- > pulls from conductor
	Action Waction;
	Action Aaction;
	Action Saction;
	Action Daction;
	
	
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