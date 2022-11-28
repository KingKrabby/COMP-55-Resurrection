package classes;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.*;

public class Food {
	public FoodType ftype;
	public double spawnOnBeat;
	public boolean rightSpawn;
	public GImage foodImage;

	Food(FoodType type, double beat) {
		ftype = type;
		spawnOnBeat = beat;
		
		if (ftype.toString() == "bun") {
			foodImage = new GImage("bun.png", 0, 0);
		}
		if (ftype.toString() == "tomato") {
			foodImage = new GImage("tomato.png", 0, 0);
		}
		if (ftype.toString() == "ketchup") {
			foodImage = new GImage("ketchup.png", 0, 0);
		}
		if (ftype.toString() == "tofu") {
			foodImage = new GImage("tofu.png", 0, 0);
		}
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