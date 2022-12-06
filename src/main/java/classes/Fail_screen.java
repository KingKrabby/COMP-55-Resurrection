package classes;
import java.awt.Color;

import java.awt.event.KeyEvent;

import acm.graphics.GImage;
import acm.graphics.GLabel;

public class Fail_screen extends Map{
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
		GImage gordon = new GImage("Gordon.jpg");
		add(gordon);
		GLabel x = new GLabel("IF YOU CANT HANDLE THE HEAT, STAY OUT OF THE KITCHEN ", 5, 250);
		x.setColor(Color.red);
		x.setFont("Arial-26");
		add(x);
		GLabel y = new GLabel("Press Spacebar to try again", 200, 300);
		y.setColor(Color.white);
		y.setFont("Arial-26");
		add(y);
		
		GLabel z = new GLabel("Press Enter to return back to the menu", 150, 400);
		z.setColor(Color.white);
		z.setFont("Arial-26");
		add(z);
		
		GImage logo = new GImage("World's Hardest Games Logo.png", 220, 400);
  		add(logo);
  		addKeyListeners();
	}
	
	@Override
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
	public static void main(String[] args) {
		new Fail_screen().start();
	}
}