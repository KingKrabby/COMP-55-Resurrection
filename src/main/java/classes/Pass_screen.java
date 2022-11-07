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