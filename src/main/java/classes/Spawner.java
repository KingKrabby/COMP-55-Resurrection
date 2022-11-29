package classes;
import java.awt.Color;
import java.awt.event.KeyEvent;
import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.*;
import javafx.util.Duration;
import java.util.Scanner;


public class Spawner extends GraphicsProgram{
	public Spawner(int x, int y) {
		spawnerX = x;
		spawnerY = y;
	}
	Boolean hardMode;
	int spawnerX;
	int spawnerY;
	void spawnFood(Level currLevel) {
		Food currentNote = currLevel.getConductor().getCurrentNote(currLevel.get_string());
		double currentBeat = currLevel.getConductor().getCurrentBeat(currLevel.get_string());
		GImage toBeSpawned = null;
		if (Math.round(currentNote.getSpawnBeat()) == Math.round(currentBeat)) {
			if (currentNote.getFoodType() == FoodType.BUN) {
				toBeSpawned = new GImage("bun.png", spawnerX, spawnerY);
				add(toBeSpawned);
			}
			if (currentNote.getFoodType() == FoodType.KETCHUP) {
				toBeSpawned = new GImage("ketchup.png", spawnerX, spawnerY);
				add(toBeSpawned);
			}
			if (currentNote.getFoodType() == FoodType.TOFU) {
				toBeSpawned = new GImage("tofu.png", spawnerX, spawnerY);
				add(toBeSpawned);
			}
			if (currentNote.getFoodType() == FoodType.TOMATO) {
				toBeSpawned = new GImage("tomato.png", spawnerX, spawnerY);
				add(toBeSpawned);
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
		Conductor testConductor = new Conductor(150, testSong, 1, Map_Database.tutorialFood);
		Scanner scan = new Scanner(System.in);
		testConductor.playSong("tutorial");
		for(int i = 0; i < 10; i++) {
			int input = scan.nextInt();
			if(input == 1) {
				//testSpawner.spawnFood(level_1);
			}
			else {
				System.out.println("no money");
			}
		}*/

	}
} 