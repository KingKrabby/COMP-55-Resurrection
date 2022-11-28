package classes;

public class Level{
	
	Conductor conductor;
	Conveyor conveyorBelt;
	Food[] foodItems;
	Song song;
	HitCircle hitCircle;
	Spawner spawner;
	String s;
	HitCircle[] hitCircles;
	
	Level(String string, Conductor currConductor, Conveyor currBelt, Food[] currItems, Song currSong, HitCircle currCircle, Spawner currSpawner, HitCircle[] currCircles) {
		conductor = currConductor;
		conveyorBelt = currBelt;
		foodItems = currItems;
		song = currSong;
		hitCircle = currCircle;
		spawner = currSpawner;
		s = string;
		hitCircles = currCircles;
		
	}

	public Conductor getConductor() {
		return conductor;
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
	
	public HitCircle[] getHitCircles() {
		return hitCircles;
	}
	//needs a background screen
	//needs background music
	
	
}