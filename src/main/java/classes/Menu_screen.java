package classes;
import java.awt.event.KeyEvent;
import acm.graphics.*;

public class Menu_screen extends Play_game{
	// function to identify map 
	private Play_game program;
	private int identifier = 1;
	int get_identifier() {
		return identifier;
	}
	
	public static final String MUSIC_FOLDER = "songs";
	private static final String[] SOUND_FILES = { "menu.mp3" };
	
	private int count;
	
	public Menu_screen(Play_game app){
		super();
		program = app;
		playBackgroundNoise();
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
			count++;
			map_track = 3;
		}
	}
	
	public void onLPress(KeyEvent L) {
		int keyCode = L.getKeyCode();
		if (keyCode == KeyEvent.VK_L) {
			//plays the tutorial
			count++;
			map_track = 1;
			
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_ESCAPE) {
			//quits the game
			System.exit(0);
		}
	}
	
	private void playBackgroundNoise() {
		Song test = Song.getInstance();
		test.playSound(MUSIC_FOLDER, SOUND_FILES[count % SOUND_FILES.length]);
	}
}