package classes;

import java.util.ArrayList;

public class Level {

	Conveyor conveyorBelt;
	Song song;
	HitCircle hitCircle;
	Spawner spawner;
	String s;
	ArrayList<Food> food_items;
	ArrayList<Food> food_items_3;

	Level(String string, Conveyor currBelt, HitCircle currCircle, Spawner currSpawner, ArrayList<Food> list,
			ArrayList<Food> list2) {

		conveyorBelt = currBelt;
		// song = currSong;
		hitCircle = currCircle;
		spawner = currSpawner;
		s = string;
		food_items = list;
		food_items_3 = list2;

	}

	public ArrayList<Food> getFoodList() {
		return food_items;
	}

	public Conveyor getConveyorBelt() {
		return conveyorBelt;
	}

	public Song getSong() {
		return song;
	}

	public HitCircle getHitCircle() {
		return hitCircle;
	}

	public Spawner getSpawner() {
		return spawner;
	}

	public String get_string() {
		return s;
	}

	public ArrayList<Food> getFoodList3() {
		return food_items_3;
	}

}