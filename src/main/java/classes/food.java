package classes;

public class food {
	public FoodType ftype;
	public double spawnOnBeat;
	public boolean rightSpawn;

	food(FoodType type, double beat) {
		ftype = type;
		spawnOnBeat = beat;
	}
	
	// add public FoodType getFoodType() {
		
	
	public double getSpawnBeat(food currFood) {
		return spawnOnBeat;
	}

}