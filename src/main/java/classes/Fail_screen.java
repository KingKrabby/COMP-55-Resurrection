package classes;
import java.awt.event.KeyEvent;

public class Fail_screen extends Play_game{
	private Play_game program;
	// function to identify map 
	private int identifier = 3;
	int get_identifier() {
		return identifier;
	}
	public Fail_screen(){
		//area for creating a pass screen once we start communicating between classes
		//"Oof, better luck next time" at the top of the screen
		//Picture of a tofu cartoon being sad at the bottom right
		//"Press space bar to try again" underneath "Oof, better luck next time"
		//"Press Enter to return back to the menu" underneath "Oof, better luck next time"
		//"World's Hardest Games" symbol in the bottom left
	}
	
	public void onSpacePressed(KeyEvent s) {
		int keyCode = s.getKeyCode();
		if (keyCode == KeyEvent.VK_SPACE) {
			//replays level
			map_track = 3;
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