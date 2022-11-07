package classes;
import java.awt.event.KeyEvent;

public class Fail_screen{
	
	public Fail_screen(){
		
	}
	
	public void onSpacePressed(KeyEvent s) {
		int keyCode = s.getKeyCode();
		if (keyCode == KeyEvent.VK_SPACE) {
			//replays level
		}
	}
	
	public void keyPressed(KeyEvent r) {
		int keyCode = r.getKeyCode();
		if (keyCode == KeyEvent.VK_ENTER) {
			//returns back to menu
		}
	}
}