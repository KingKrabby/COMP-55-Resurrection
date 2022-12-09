package classes;

import acm.program.*;

import java.util.ArrayList;
import java.util.Scanner;

import acm.graphics.*;

public class Spawner extends Map {
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

	void spawn_food() {
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		int count = 0;
		ArrayList<Food> items = current.getFoodList();
		for (Food f : items) {
			long elapsed = end - start;
			if (elapsed > f.getDuration()) {
				GImage image = creates_new_image(f);
				add(image);
				count++;

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
		if (type == FoodType.TOMATO) {
			item = new GImage("tomato.png", x, y);
		}
		return item;
	}

	public void run() {
		spawn_food();
	}

	public static void main(String args[]) {
		/*
		 * Spawner testSpawner = new Spawner(-100, 100); testSpawner.start(); Song
		 * testSong = Song.getInstance(); Conductor testConductor = new Conductor(150,
		 * testSong, 1, Map_Database.tutorialFood);
		 */
		new Spawner().start();

	}
}