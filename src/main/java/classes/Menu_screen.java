package classes;
import java.awt.Color;
import java.awt.event.KeyEvent;
import acm.graphics.*;

public class Menu_screen extends Map {
	// function to identify map 
	
	GLabel x;
	private int identifier = 1;
	int get_identifier() {
		return identifier;
	}
	Song test = Song.getInstance();
	public static final String MUSIC_FOLDER = "sounds";
	private static final String[] SOUND_FILES = { "menu.mp3" };
	
	private int count;
	
	public Menu_screen(Play_game app){
		super();
		//program = app;
		//playBackgroundNoise();
		//area for creating a menu screen once we start communicating between classes
		//"Turnt Up Tofu" at the top left of the screen
		//Picture of a tofu cartoon dancing at the middle left
		//"Press 'L' to play the Tutorial!" at middle right
		//"Press Space bar to play the first level!" underneath "Press 'L' to play the Tutorial!"
		//"Press 'Esc' to quit the game" underneath "Press Space bar to play the first level!"
		//"World's Hardest Games" symbol in the bottom right
		


	}
	public void run() {
		playBackgroundNoise();
		current = level_1;
		System.out.println("hello");
		x = new GLabel("Turnt Up Tofu", 20, 50);
		x.setColor(Color.black);
		x.setFont("Arial-18");
		add(x);
		
		GLabel y = new GLabel("Press 'L' to play the Tutorial!", 20, 90);
		y.setColor(Color.black);
		y.setFont("Arial-18");
		add(y);
		
		GLabel z = new GLabel("Press Spacebar to play the first level!", 20, 130);
		z.setColor(Color.black);
		z.setFont("Arial-18");
		add(z);
		
		GLabel a = new GLabel("Press 'Esc' to quit the game", 20, 170);
		a.setColor(Color.black);
		a.setFont("Arial-18");
		add(a);
		
		GImage logo = new GImage("World's Hardest Games Logo.png", 0, 400);
  		add(logo);
  		GImage blue = new GImage("title_screen_bluebackground.jpg", 200, 200);
  		add(blue);
  		addKeyListeners();
	}
	public void stop() {
		
		test.stopSound(MUSIC_FOLDER, SOUND_FILES[0]);
		
	}
	@Override
	public void keyPressed(KeyEvent s) {
		int keyCode = s.getKeyCode();
		if (keyCode == KeyEvent.VK_SPACE) {
			//plays first level
			menu.stop();
			game.start();
			count++;
			map_track = 3;
		}
		if (keyCode == KeyEvent.VK_L) {
			//current = tutorial;
			//plays the tutorial
			menu.stop();
			game.start();
			count++;
			map_track = 1;
			
		}
		if (keyCode == KeyEvent.VK_ESCAPE) {
			menu.stop();
			title.start();
		}

	}
	

	
	private void playBackgroundNoise() {
		test.playSound(MUSIC_FOLDER, SOUND_FILES[count % SOUND_FILES.length]);
	}
}