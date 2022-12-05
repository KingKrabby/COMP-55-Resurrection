package classes;
import acm.graphics.*;

 
public class Food {
	public FoodType ftype;
	public double spawnOnBeat;
	public boolean rightSpawn; //dsnji

	Food(FoodType type, double beat) {
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

		
	
	public double getSpawnBeat() {
		return spawnOnBeat;
	}

}