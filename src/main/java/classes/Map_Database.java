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
	public static Food[] food3; //nate needs to complete initialization
	
	public static Song song1; //nate needs to complete initialization
	public static Song song2; //nate needs to complete initialization
	public static Song song3; //nate needs to complete initialization
	
	public static HitCircle[] circles1; //I need to complete initialization
	public static HitCircle[] circles2; //I need to complete initialization
	public static HitCircle[] circles3; //I need to complete initialization
	
	public static Spawner spawner1;  //I need to complete initialization
	public static Spawner spawner2;  //I need to complete initialization
	public static Spawner spawner3;  //I need to complete initialization
	
	Level level1 = new Level(conductor1, conveyor1, food1, song1, circles1, spawner1);
	Level level2 = new Level(conductor2, conveyor2, food2, song2, circles2, spawner2);
	Level level3 = new Level(conductor3, conveyor3, food3, song3, circles3, spawner3);
	
	
}
