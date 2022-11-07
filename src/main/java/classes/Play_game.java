package classes;

//import classes.Title_screen;
import classes.Pass_screen;
import classes.Fail_screen;
import classes.Menu_screen;

public class Play_game {
	// function to identify map 
	private int identifier = 4;
	int get_identifier() {
		return identifier;
	}
	
	//private Title_screen title;
	private Menu_screen menu;
	private Pass_screen pass;
	private Fail_screen fail;
	
	public void run() {
		System.out.println("Hello, world!");
		//menu = new menuPane(this);
		//setupInteractions();
		switchToMenu();
	}
	
	
	public void switchToMenu() {
		//switchToScreen(menu);
	}
	
	public void switchToFail() {
		//switchToScreen(fail);
	}
	
	public void switchToPass() {
		//switchToScreen(pass);
	}
	
	public static void main(String[] args) {
		//new Play_game().start();
	}
}