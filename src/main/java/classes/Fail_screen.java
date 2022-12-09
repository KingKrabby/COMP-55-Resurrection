package classes;
import java.awt.Color;

import java.awt.event.KeyEvent;

import acm.graphics.GImage;
import acm.graphics.GLabel;

public class Fail_screen extends Map{
	private Level level;
	public Fail_screen(Level l) {
		this.level = l;
	}
	// function to identify map 
	// function to identify map 
	private int identifier = 3;
	int get_identifier() {
		return identifier;
	}
	public int levelCount = 0;

	Song test = Song.getInstance();
	public static final String MUSIC_FOLDER = "sounds";
	private static final String[] SOUND_FILES = { "Raw.mp3" };
	public Fail_screen(Play_game app){
		super();
	}
	
	public void stop() {
		test.stopSound(MUSIC_FOLDER, SOUND_FILES[0]);
	}
	
	public void run() {
		
		playBackgroundNoise();
		System.out.println("fail");
		
		GImage red = new GImage("Red Background.jpg");
		add(red);
		
		
		GImage gordon = new GImage("Gordon.png", 475, 400);
		add(gordon);
		
		GLabel b = new GLabel("ITS RAW! >:(", 125, 500);
		b.setColor(Color.white);
		b.setFont("Arial-50");
		add(b);
		
		GLabel x = new GLabel("IF YOU CANT HANDLE THE HEAT", 0, 80);
		x.setColor(Color.white);
		x.setFont("Arial-50");
		add(x);
		
		GLabel a = new GLabel("STAY OUT OF THE KITCHEN!", 50, 125);
		a.setColor(Color.white);
		a.setFont("Arial-50");
		add(a);		
		
		GLabel y = new GLabel("Press Spacebar to try again", 0, 280);
		y.setColor(Color.white);
		y.setFont("Arial-40");
		add(y);
		
		GLabel z = new GLabel("Press Enter to return back to the menu", 0, 380);
		z.setColor(Color.white);
		z.setFont("Arial-40");
		add(z);
		
		GImage logo = new GImage("World's Hardest Games Logo.png", -25, 475);
  		add(logo);
  		addKeyListeners();
	}
	
	@Override
	public void keyPressed(KeyEvent r) {
		int keyCode = r.getKeyCode();
		if (keyCode == KeyEvent.VK_ENTER) {
			//returns back to menu
			menu.start();
		}
		if (keyCode == KeyEvent.VK_SPACE) {
			//replays level
			Play_game g = new Play_game(level);
			g.start();
		}
	}
	
	private void playBackgroundNoise() {
		test.playSound(MUSIC_FOLDER, SOUND_FILES[0], false);
	}
	public static void main(String[] args) {
		new Fail_screen(game).start();
	}
}