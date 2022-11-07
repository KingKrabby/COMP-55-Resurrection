package classes;
import java.awt.event.KeyEvent;
//import acm.graphics.GObject;

public class Title_screen {
	// function to identify map 
	private int identifier = 0;
	int get_identifier() {
		return identifier;
	}
	
	//private Play_game program;
	
	
	public Title_screen(){
		
	}
	
	public void keyPressed(KeyEvent s) {
		int keyCode = s.getKeyCode();
		if (keyCode == KeyEvent.VK_SPACE) {
			//takes you too menu screen
		}
	}
}