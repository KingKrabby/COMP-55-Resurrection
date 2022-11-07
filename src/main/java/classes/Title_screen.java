package classes;
import java.awt.event.KeyEvent;
//import acm.graphics.GObject;

public class Title_screen {
	private Play_game program;
	// function to identify map 
	private int identifier = 0;
	int get_identifier() {
		return identifier;
	}
	
	
	public Title_screen(){
		//area for creating a title screen once we start communicating between classes
		//"Turnt Up Tofu" at the top of the screen
		//Picture of a record player with a spinning burger bun instead of a vinyl at the center of the screen
		//"Press space bar to start!" underneath record player
		//"World's Hardest Games" symbol in the bottom right
	}
	
	public void keyPressed(KeyEvent s) {
		int keyCode = s.getKeyCode();
		if (keyCode == KeyEvent.VK_SPACE) {
			//takes you too menu screen
			program.switchToMenu();
		}
	}
}