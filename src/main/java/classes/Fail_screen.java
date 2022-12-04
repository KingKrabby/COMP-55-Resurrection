package classes;
import java.awt.Color;
import java.awt.event.KeyEvent;

import acm.graphics.GImage;
import acm.graphics.GLabel;

public class Fail_screen extends Map{
	private Play_game program;
	// function to identify map 
	private int identifier = 3;
	int get_identifier() {
		return identifier;
	}
	public Fail_screen(){
		//area for creating a pass screen once we start communicating between classes
		//"Oof, better luck next time" at the top of the screen
		//Picture of a tofu cartoon being sad at the bottom right
		//"Press space bar to try again" underneath "Oof, better luck next time"
		//"Press Enter to return back to the menu" underneath "Oof, better luck next time"
		//"World's Hardest Games" symbol in the bottom left

	}
	public void run() {
		GLabel x = new GLabel("Oof, better luck next time", 20, 50);
		x.setColor(Color.black);
		x.setFont("Arial-18");
		add(x);
		
		GLabel y = new GLabel("Press Spacebar to try again", 20, 90);
		y.setColor(Color.black);
		y.setFont("Arial-18");
		add(y);
		
		GLabel z = new GLabel("Press Enter to return back to the menu", 20, 130);
		z.setColor(Color.black);
		z.setFont("Arial-18");
		add(z);
		
		GImage logo = new GImage("World's Hardest Games Logo.png", 0, 400);
  		add(logo);
  		addKeyListeners();
	}
	
	
	public void keyPressed(KeyEvent r) {
		int keyCode = r.getKeyCode();
		if (keyCode == KeyEvent.VK_ENTER) {
			//returns back to menu
			menu.run();
		}
		if (keyCode == KeyEvent.VK_SPACE) {
			//replays level
			game.run();
		}
	}
}