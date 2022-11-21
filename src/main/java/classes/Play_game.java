package classes;
//The main screen where everything is displayed

import java.awt.event.KeyEvent;


public class Play_game extends Map{
	//screen windows
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	//title screen background music
	public static final String MUSIC_FOLDER = "songs";
	private static final String[] SOUND_FILES = { "tutorial.mp3" };
	
	private Title_screen title;
	private KeyEvent menu;
	private KeyEvent pass;
	private KeyEvent fail;
	private int count;

	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}
	
	public void run() {
		System.out.println("Turnt Up Tofu!");
		map_track = 0;
		title = new Title_screen();
		//switchToMenu();
		playBackgroundNoise();
	}
	
	
	public void switchToMenu() {
		playBackgroundNoise();
		count++;
		map_track = 1;
		//play_game_check(menu);
	}
	
	public void switchToFail() {
		playBackgroundNoise();
		count++;
		map_track = 3;
		//play_game_check(fail);
	}
	
	public void switchToPass() {
		playBackgroundNoise();
		count++;
		map_track = 2;
		//play_game_check(pass);
	}
	
	private void playBackgroundNoise() {
		Song test = Song.getInstance();
		test.playSound(MUSIC_FOLDER, SOUND_FILES[count % SOUND_FILES.length]);
	}
	
	public static void main(String[] args) {
		new Play_game().start();
	}
}