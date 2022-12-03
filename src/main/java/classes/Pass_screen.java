package classes;
import java.awt.Color;
import java.awt.event.KeyEvent;
import acm.graphics.*;

public class Pass_screen extends Play_game{
	private Play_game program;
	// function to identify map 
	private int identifier = 2;
	int get_identifier() {
		return identifier;
	}
	public int levelCount = 0;
	public Pass_screen(Play_game app){
		super();
		program = app;
		//area for creating a pass screen once we start communicating between classes
		//"Great Work!" at the top of the screen
		//Picture of a tofu cartoon dancing at the bottom right
		//"Press space bar to move onto the next level" underneath "Great Work!"
		//"Press Enter to return back to the menu" underneath "Press space bar to move onto the next level"
		//"World's Hardest Games" symbol in the bottom left

	}
	
	public void run() {
		GLabel x = new GLabel("Great Work!", 20, 50);
		x.setColor(Color.black);
		x.setFont("Arial-18");
		add(x);
		
		GLabel y = new GLabel("Press Spacebar to move onto the next level!", 20, 90);
		y.setColor(Color.black);
		y.setFont("Arial-18");
		add(y);
		
		GLabel z = new GLabel("Press Enter to return back to the menu", 20, 130);
		z.setColor(Color.black);
		z.setFont("Arial-18");
		add(z);
		
		GImage logo = new GImage("World's Hardest Games Logo.png", 0, 400);
  		add(logo);
	}
	public void onSpacePressed(KeyEvent s) {
		int keyCode = s.getKeyCode();
		if (keyCode == KeyEvent.VK_SPACE) {
			//move onto next level
			//put onSpacePressed in mainApplication
			//what will be our main application
			//keep the logic in the classes
			levelCount++;
			map_track = 3;
		}
	}
	
	public void keyPressed(KeyEvent r) {
		int keyCode = r.getKeyCode();
		if (keyCode == KeyEvent.VK_ENTER) {
			//returns back to menu
			program.switchToMenu();
		}
	}
	public static void main(String[] args) {
		new Pass_screen(game).start();
	}
	 
	
}