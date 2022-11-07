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
	
	public void onSpacePressed(KeyEvent s) {
		int keyCode = s.getKeyCode();
		if (keyCode == KeyEvent.VK_SPACE) {
			//plays first level
		}
	}
	
	public void onLPress(KeyEvent L) {
		int keyCode = L.getKeyCode();
		if (keyCode == KeyEvent.VK_L) {
			//plays the tutorial
		}
	}
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_ESCAPE) {
			//quits the game
		}
	}
}