package classes;

import java.util.ArrayList;

public class Level{
	
	Conductor conductor;
	Conveyor conveyorBelt;
	Food[] foodItems;
	Song song;
	HitCircle hitCircle;
	Spawner spawner;
	String s;
	ArrayList <Food> food_items;
	ArrayList <Food> food_items_3;

	
	Level(String string, Conductor currConductor, Conveyor currBelt, Food[] currItems, HitCircle currCircle, Spawner currSpawner, ArrayList <Food> list, ArrayList<Food> list2) {
		conductor = currConductor;
		conveyorBelt = currBelt;
		foodItems = currItems;
		//song = currSong;
		hitCircle = currCircle;
		spawner = currSpawner;
		s = string;
		food_items = list;
		food_items_3 = list2;
		
	}

	public Conductor getConductor() {
		return conductor;
	}
	public ArrayList<Food> getFoodList() {
		return food_items;
	}
	public Conveyor getConveyorBelt() {
		return conveyorBelt;
	}
	
	public Food[] getFoodItems(){
		return foodItems;
	}
	
	public int get_food_length() {
		return foodItems.length; // for pass
	}
	
	public Song getSong(){
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
	

	//needs a background screen
	//needs background music
	
	
}