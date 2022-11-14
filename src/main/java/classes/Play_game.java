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
	private KeyEvent menu2;
	private Menu_screen menu;
	private Pass_screen pass;
	private Fail_screen fail;
	private int count;

	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}
	
	public void run() {
		System.out.println("Turnt Up Tofu!");
		title = new Title_screen();
		menu = new Menu_screen();
		//switchToMenu();
	}
	
	
	public void switchToMenu() {
		playBackgroundNoise();
		count++;
		//map_track = 1;
		//switchToScreen(menu);
		keyPressed(menu2);
	}
	
	public void switchToFail() {
		//switchToScreen(fail);
	}
	
	public void switchToPass() {
		//switchToScreen(pass);
	}
	
	private void playBackgroundNoise() {
		Song test = Song.getInstance();
		test.playSound(MUSIC_FOLDER, SOUND_FILES[count % SOUND_FILES.length]);
	}
	
	public static void main(String[] args) {
		new Play_game().start();
	}
}