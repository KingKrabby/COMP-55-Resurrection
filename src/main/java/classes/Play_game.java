package classes;
//The main screen where everything is displayed

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.Timer;

import acm.graphics.GImage;


public class Play_game implements ActionListener{
	private Timer spawnerTimer;
	//screen windows
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	//title screen background music
	public static final String MUSIC_FOLDER = "sounds";
	private static final String[] SOUND_FILES = { "level1.mp3", "level2.mp3", "level3.mp3", "tutorial.mp3" };
	
	Conveyor belt;
	private int count;
	private Spawner spawner;
	Map_graphics map_graphics;

	public void run() {
		spawnerTimer =  new Timer(500, this);
		spawnerTimer.start();
		System.out.println("game is running");
		
		System.out.println("Turnt Up Tofu!");
		map_graphics = new Map_graphics();
		map_graphics.start();
		map_graphics.map_track = 0;
		belt = map_graphics.current.getConveyorBelt();
		playBackgroundNoise();
		spawner = Map_Database.spawner1;
		spawner.setGame(map_graphics.game);
		//switchToMenu();		
	}
	public void add(GImage img) {
		map_graphics.add(img);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		spawner.spawnFood(Map_Database.level1);
	}
	
	public void switchToMenu() {
		playBackgroundNoise();
		count++;
		map_graphics.map_track = 1;
		//play_game_check(menu);
	}
	
	public void switchToFail() {
		playBackgroundNoise();
		count++;
		map_graphics.map_track = 3;
		//play_game_check(fail)
	}
	
	public void switchToPass() {
		playBackgroundNoise();
		count++;
		map_graphics.map_track = 2;
		//play_game_check(pass);
	} 
	
	private void playBackgroundNoise() {
		Song test = Song.getInstance();
		test.playSound(MUSIC_FOLDER, map_graphics.current.get_string());
		
	}
}