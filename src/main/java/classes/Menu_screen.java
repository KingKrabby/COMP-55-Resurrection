package classes;
import java.awt.event.KeyEvent;

public class Menu_screen {
	// function to identify map 
	private int identifier = 1;
	int get_identifier() {
		return identifier;
	}
	public Menu_screen(){
		
	}
	
	public void keyPressed(KeyEvent s) {
		int keyCode = s.getKeyCode();
		if (keyCode == KeyEvent.VK_SPACE) {
			//plays first level
		}
	}
}