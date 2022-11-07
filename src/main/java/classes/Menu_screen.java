package classes;
import java.awt.event.KeyEvent;

public class Menu_screen {
	// function to identify map 
	private int identifier = 1;
	int get_identifier() {
		return identifier;
	}
	public Menu_screen(){
		//area for creating a menu screen once we start communicating between classes
		//"Turnt Up Tofu" at the top left of the screen
		//Picture of a tofu cartoon dancing at the middle left
		//"Press 'L' to play the Tutorial!" at middle right
		//"Press Space bar to play the first level!" underneath "Press 'L' to play the Tutorial!"
		//"Press 'Esc' to quit the game" underneath "Press Space bar to play the first level!"
		//"World's Hardest Games" symbol in the bottom right
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