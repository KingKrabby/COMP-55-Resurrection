package classes;
import acm.program.*;

import java.util.ArrayList;
import java.util.Scanner;

import acm.graphics.*;

public class Spawner extends Map{
	private Play_game game;
	
//	public Spawner(int x, int y) {
//		spawnerX = x;
//		spawnerY = y;
//	}
	
	public void setGame(Play_game game) {
		this.game = game;
	}
	
	Boolean hardMode;
	int spawnerX;
	int spawnerY;
	

	/*t.start()
	 * count = 0;
	 * for currLevel.getFood:
	 * 		if (elapsed > food.getint() && count == i):
	 * 			spawn_image();
	 * 			add image to global list;
	 * 
	 *  // to check
	 *  
	 *  pass():
	 *  * for curr.food.images:
	 *  	* check if any food item matches the key pressed
	 *  		-get string of current food type == bun, tofu...;
	 *  	* within x bounds of the hit circle
	 *  	
	 *  
	 *  
	 *  @Override 
	 *  (if key):
	 *  	
	 *  
	 *  	
	 */
	void spawn_food() {
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		int count = 0;
		ArrayList<Food> items = current.getFoodList();
		for (Food f: items) {
			long elapsed = end - start;
			if (elapsed > f.getDuration()) {
				GImage image = creates_new_image(f);
				add(image);
				count ++;
				
			}
			
		}
	}
	
	GImage creates_new_image(Food food) {
		GImage item = null;
		int x = 0;
		int y = 435;
		FoodType type = food.getFoodType();
		if (type == FoodType.BUN) {
			item = new GImage("bun.png", x, y);
		}
		if (type == FoodType.KETCHUP) {
			item = new GImage("ketchup.png", x, y);
			
		}
		if (type == FoodType.TOFU) {
			item = new GImage("tofu.png", x, y);
			
		}
		if (type== FoodType.TOMATO) {
			item = new GImage("tomato.png", x, y);
		}
		return item;
	}
	
	void spawnFood(Level currLevel) {
		
		
		double currentBeat = currLevel.getConductor().getCurrentBeat(currLevel.get_string());
		Food currentNote = currLevel.getConductor().getCurrentNote(currLevel.get_string());
		GImage toBeSpawned = null;
		if (Math.round(currentNote.getSpawnBeat()) == Math.round(currentBeat)) {
			
			if (currentNote.getFoodType() == FoodType.BUN) {
				toBeSpawned = new GImage("bun.png", spawnerX, spawnerY);
				game.add(toBeSpawned);
			}
			if (currentNote.getFoodType() == FoodType.KETCHUP) {
				toBeSpawned = new GImage("ketchup.png", spawnerX, spawnerY);
				game.add(toBeSpawned);
			}
			if (currentNote.getFoodType() == FoodType.TOFU) {
				toBeSpawned = new GImage("tofu.png", spawnerX, spawnerY);
				game.add(toBeSpawned);
			}
			if (currentNote.getFoodType() == FoodType.TOMATO) {
				toBeSpawned = new GImage("tomato.png", spawnerX, spawnerY);
				game.add(toBeSpawned);
			}
			if (toBeSpawned != null) {
				toBeSpawned.move(5, 300);
			}
		}
	}
	public void run() {
		spawn_food();
	}
	public static void main(String args[]) {
		/*Spawner testSpawner = new Spawner(-100, 100);
		testSpawner.start();
		Song testSong = Song.getInstance();
		Conductor testConductor = new Conductor(150, testSong, 1, Map_Database.tutorialFood);*/
		new Spawner().start();

	}
} 