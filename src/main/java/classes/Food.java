package classes;
import acm.graphics.*;

 
public class Food {
	public FoodType ftype;
	public double spawnOnBeat;
	public int time;
	public boolean rightSpawn; //d

	Food(FoodType type, int t) {
		ftype = type;
		//spawnOnBeat = beat;
		time = t;
		
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