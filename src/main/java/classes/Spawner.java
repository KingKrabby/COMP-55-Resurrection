package classes;
import acm.program.*;

import java.util.Scanner;

import acm.graphics.*;

public class Spawner {
	private Play_game game;
	
	public Spawner(int x, int y) {
		spawnerX = x;
		spawnerY = y;
	}
	
	public void setGame(Play_game game) {
		this.game = game;
	}
	
	Boolean hardMode;
	int spawnerX;
	int spawnerY;
	
	void spawnFood(Level currLevel) {
		
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
		
	}
	public static void main(String args[]) {
		/*Spawner testSpawner = new Spawner(-100, 100);
		testSpawner.start();
		Song testSong = Song.getInstance();
		Conductor testConductor = new Conductor(150, testSong, 1, Map_Database.tutorialFood);*/
		Scanner scan = new Scanner(System.in);
		Map_Database data = new Map_Database();
		Level testLevel = data.level1;
		testLevel.conductor.playSong("tutorial");
		for(int i = 0; i < 10; i++) {
			int input = scan.nextInt();
			if(input == 1) {
				testLevel.getSpawner().spawnFood(testLevel);
			}
			else {
				System.out.println("no money");
			}
		}

	}
} 