package classes;

public class food {
	public FoodType ftype;
	public double spawnOnBeat;
	public boolean rightSpawn;

	food(FoodType type, double beat) {
		ftype = type;
		spawnOnBeat = beat;
	}
	
	public FoodType getFoodType() {
		if (ftype.toString() == "bun") {
			return FoodType.BUN;
		}
		if (ftype.toString() == "tomato") {
			return FoodType.TOMATO;
		}
	if (ftype.toString() == "ketchup") {
			return FoodType.KETCHUP;
		}
		return FoodType.TOFU;
	}

		
	
	public double getSpawnBeat(food currFood) {
		return spawnOnBeat;
	}

}