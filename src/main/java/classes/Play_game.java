package classes;
//The main screen where everything is displayed

import java.awt.Component;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import acm.graphics.GImage;


public class Play_game extends Map_graphics{
	//screen windows
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	//title screen background music
	public static final String MUSIC_FOLDER = "sounds";
	private static final String[] SOUND_FILES = { "level1.mp3", "level2.mp3", "level3.mp3", "tutorial.mp3" };
	
	Conveyor belt = current.getConveyorBelt();
	private int count;
	
	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}
	boolean fail() {
		System.out.println("fail");
		//activates when buttons are pressed
		// looks at current map --> fail screen
		if (box.get_failCount() == 3) {
			box.reset_fail();
			return true;
		}
		return false;
	}
	boolean pass(int score, Level level) {
		System.out.println("pass");
		if(score == level.get_food_length()) {
			box.reset();
			curr_level_num ++;
			if (curr_level_num < 3) {
				current = level_arr[curr_level_num];
			}
			pass.run();
			return true;
		}
		return false;
	}
	public void run() {
		
		System.out.println("game is running");
		System.out.println("Turnt Up Tofu!");
		map_track = 0;
		Map_graphics map_graphics = new Map_graphics();
		map_graphics.start();
		playBackgroundNoise();
		//switchToMenu();
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		current.getConductor().playSong(current.get_string());
		Food curr_food = current.getConductor().getCurrentNote(current.get_string());
		if (key == KeyEvent.VK_W) {
			if (curr_food.getFoodType().toString() == "bun" && current.getHitCircle().isHit(curr_food, current)) {
				box.incrementScore();
			}
			else {
				box.reset_streak();
				box.incrementFail();
				
			}
			if (fail()) {
				current.getConductor().stopSong(current.get_string());
				fail.start();
			}
			if (pass(box.get_score(), current)) {
				current.getConductor().stopSong(current.get_string());
				pass.start();
			}
			
		}
		if (key == KeyEvent.VK_A) {
			if (curr_food.getFoodType().toString()== "tomato" && current.getHitCircle().isHit(curr_food, current)) {
				box.incrementScore();
			}
			else {
				box.reset_streak();
				box.incrementFail();
			}
			if (fail()) {
				current.getConductor().stopSong(current.get_string());
				fail.start();
			}
			if (pass(box.get_score(), current)) {
				current.getConductor().stopSong(current.get_string());
				pass.start();
			}
		}
		if (key == KeyEvent.VK_S) {
			if (curr_food.getFoodType().toString()== "tofu" && current.getHitCircle().isHit(curr_food, current)) {
				box.incrementScore();
			}
			else {
				box.reset_streak();
				box.incrementFail();
			}
			if (fail()) {
				current.getConductor().stopSong(current.get_string());
				fail.start();
			}
			if (pass(box.get_score(), current)) {
				current.getConductor().stopSong(current.get_string());
				pass.start();
			}
		}
		if (key == KeyEvent.VK_D) {
			if (curr_food.getFoodType().toString()== "bun" && current.getHitCircle().isHit(curr_food, current)) {
				box.incrementScore();
			}
			else {
				box.reset_streak();
				box.incrementFail();
			}
			if (fail()) {
				current.getConductor().stopSong(current.get_string());
				fail.start();
			}
			if (pass(box.get_score(), current)) {
				current.getConductor().stopSong(current.get_string());
				pass.start();
			}
		}
		
		
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
		test.playSound(MUSIC_FOLDER, current.get_string());
	}
	
	public static void main(String[] args) {
		new Play_game().start();
	}
}