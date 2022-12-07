package classes;
import java.awt.Color;
import java.awt.event.KeyEvent;
import acm.graphics.*;

public class Pass_screen extends Map{
	//private Play_game program;
	// function to identify map 
	private int identifier = 2;
	int get_identifier() {
		return identifier;
	}
	public int levelCount = 0;
	public Pass_screen(Play_game app){
		super();
		//program = app;
		//area for creating a pass screen once we start communicating between classes
		//"Great Work!" at the top of the screen
		//Picture of a tofu cartoon dancing at the bottom right
		//"Press space bar to move onto the next level" underneath "Great Work!"
		//"Press Enter to return back to the menu" underneath "Press space bar to move onto the next level"
		//"World's Hardest Games" symbol in the bottom left

	}
	
	public void run() {
		System.out.println("pass");
		
		GImage green = new GImage("greenbackground.jpg", 0, 0);
		add(green);
		
		GImage baby = new GImage("babymeme.png", 525, 290);
		add(baby);
		
		GImage x = new GImage("GreatWork.png", 100, 0);
		//x.setColor(Color.white);
		//x.setFont("Arial-30");
		add(x);
		
		GLabel y = new GLabel("Press Spacebar to move onto the next level!", 20, 90);
		y.setColor(Color.white);
		y.setFont("Arial-30");
		add(y);
		
		GLabel z = new GLabel("Press Enter to return back to the menu", 20, 130);
		z.setColor(Color.white);
		z.setFont("Arial-30");
		add(z);
		
		GImage logo = new GImage("World's Hardest Games Logo.png", -25, 475);
  		add(logo);
  		addKeyListeners();
	}

	@Override
	public void keyPressed(KeyEvent r) {
		int keyCode = r.getKeyCode();
		if (keyCode == KeyEvent.VK_ENTER) {
			menu.start();
		}
		if (keyCode == KeyEvent.VK_SPACE) {
			//move onto next level jbsx
			//put onSpacePressed in mainApplication
			//what will be our main application
			//keep the logic in the classes
			if (curr_level_num == 2) {
				menu.start();
			}
			else {
				curr_level_num += 1;
				current = level_arr[curr_level_num];
				game.run();
			}

		}
	}
	public static void main(String[] args) {
		new Pass_screen(game).start();
	}
	 
	
}