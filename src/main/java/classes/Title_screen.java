package classes;
import java.awt.Color;
import java.awt.event.KeyEvent;

import acm.program.*;
import acm.graphics.*;

public class Title_screen extends GraphicsProgram{
	private Play_game program;
	public static final String MUSIC_FOLDER = "sounds";
	private static final String[] SOUND_FILES = { "tutorial.mp3" };
	// function to identify map 
	private int identifier = 0;
	int get_identifier() {
		return identifier;
	}
	/*
	private static final int START_Y = 250;
	private static final int START_X = 300;
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	
	public void init() {
		//setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		//requestFocus();
	}
	*/
	
	public void run(){
		//Title of Game
		System.out.println("title");
		playBackgroundNoise();
		GLabel x = new GLabel("Turnt Up Tofu!", 20, 50);
		x.setColor(Color.black);
		x.setFont("Arial-18");
		add(x);
		
		GLabel y = new GLabel("Press Spacebar to Start!", 20, 80);
		y.setColor(Color.black);
		y.setFont("Arial-18");
		add(y);
		
		GImage blue = new GImage("title_screen_bluebackground.jpg", 200, 200);
  		add(blue);
		
		
		//area for creating a title screen once we start communicating between classes
		//"Turnt Up Tofu" at the top of the screen
		//Picture of a record player with a spinning burger bun instead of a vinyl at the center of the screen
		//"Press space bar to start!" underneath record player
		//"World's Hardest Games" symbol in the bottom right
	}

	

	@Override
	public void keyPressed(KeyEvent s) {
		int keyCode = s.getKeyCode();
		if (keyCode == KeyEvent.VK_SPACE) {
			//takes you too menu screen
			program.switchToMenu();
		}
	}
	private void playBackgroundNoise() {
		Song test = Song.getInstance();
		
		test.playSound(MUSIC_FOLDER, SOUND_FILES[0], true);
	}
	public static void main(String[] args) {
		new Title_screen().start();
	}
}