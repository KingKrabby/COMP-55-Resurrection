package classes;

public class Level{
	
	Conductor conductor;
	Conveyor[] conveyorBelts;
	Food[] foodItems;
	Song song;
	HitCircle[] hitCircles;
	Spawner spawner;
	
	Level(Conductor currConductor, Conveyor[] currBelts, Food[] currItems, Song currSong, HitCircle[] currCircles, Spawner currSpawner) {
		conductor = currConductor;
		conveyorBelts = currBelts;
		foodItems = currItems;
		song = currSong;
		hitCircles = currCircles;
		spawner = currSpawner;
		
	}

	public Conductor getConductor() {
		return conductor;
	}
	
	public Conveyor[] getConveyorBelts() {
		return conveyorBelts;
	}
	
	public Food[] getFoodItems(){
		return foodItems;
	}
	
	public Song getSong(){
		return song;
	}
	
	public HitCircle[] getHitCircles() {
		return hitCircles;
	}
	
	public Spawner getSpawner() {
		return spawner;
	}
	
	
}