package classes;

public final class Map_Database {
	private Map_Database() {}
	
	public static Conductor conductor1; //nate needs to complete initialization
	public static Conductor conductor2; //nate needs to complete initialization
	public static Conductor conductor3; //nate needs to complete initialization
	
	public static Conveyor[] conveyor1; //I need to complete initialization
	public static Conveyor[] conveyor2; //I need to complete initialization
	public static Conveyor[] conveyor3; //I need to complete initialization
	
	public static Food[] tutorialFood = new Food[] { new Food(FoodType.BUN, 1), 
			new Food(FoodType.KETCHUP, 5),
			new Food(FoodType.TOFU, 9),
			new Food(FoodType.TOMATO, 13)};
	public static Food[] food1; //nate needs to complete initialization
	public static Food[] food2; //nate needs to complete initialization
	public static Food[] food3; //nate needs to complete initialization ifweo
	
	public static Song song1; //nate needs to complete initialization
	public static Song song2; //nate needs to complete initialization
	public static Song song3; //nate needs to complete initialization
	
	public static HitCircle circle1; //I need to complete initialization
	public static HitCircle circle2; //I need to complete initialization
	public static HitCircle circle3; //I need to complete initialization
	
	public static Spawner spawner1;  //Nate need to complete initialization
	public static Spawner spawner2;  //Nate need to complete initialization
	public static Spawner spawner3;  //Nate need to complete initialization
	
	Level level1 = new Level("level1",conductor1, conveyor1, food1, song1, circle1, spawner1);
	Level level2 = new Level("level2",conductor2, conveyor2, food2, song2, circle2, spawner2);
	Level level3 = new Level("level3", conductor3, conveyor3, food3, song3, circle3, spawner3);
	// get hitcircles
	
	
	
	//get level function
	Level get_level1() {
		return level1;
	}
	Level get_level2() {
		return level2;
	}
	Level get_level3() {
		return level3;
	}
	
}
