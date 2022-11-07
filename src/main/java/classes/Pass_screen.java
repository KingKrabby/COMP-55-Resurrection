package classes;
import java.awt.event.KeyEvent;

public class Pass_screen {
	private Play_game program;
	// function to identify map 
	private int identifier = 2;
	int get_identifier() {
		return identifier;
	}
	public Pass_screen(){
		//area for creating a pass screen once we start communicating between classes
		//"Great Work!" at the top of the screen
		//Picture of a tofu cartoon dancing at the bottom right
		//"Press space bar to move onto the next level" underneath "Great Work!"
		//"Press Enter to return back to the menu" underneath "Press space bar to move onto the next level"
		//"World's Hardest Games" symbol in the bottom left
	}
	
	public void onSpacePressed(KeyEvent s) {
		int keyCode = s.getKeyCode();
		if (keyCode == KeyEvent.VK_SPACE) {
			//move onto next level
		}
	}
	
	public void keyPressed(KeyEvent r) {
		int keyCode = r.getKeyCode();
		if (keyCode == KeyEvent.VK_ENTER) {
			//returns back to menu
			program.switchToMenu();
		}
	}
	
}