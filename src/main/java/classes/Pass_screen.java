package classes;
import java.awt.event.KeyEvent;

public class Pass_screen {
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
	
}