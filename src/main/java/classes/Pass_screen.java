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
	
	Song test = Song.getInstance();
	public static final String MUSIC_FOLDER = "sounds";
	private static final String[] SOUND_FILES = { "Hurray.mp3" };
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
	
	public void stop() {
		test.stopSound(MUSIC_FOLDER, SOUND_FILES[0]);
	}
	
	public void run() {
		//game.stop();
		playBackgroundNoise();
		System.out.println("pass");
		
		GImage green = new GImage("greenbackground.jpg", 0, 0);
		add(green);
		
		GImage baby = new GImage("babymeme.png", 525, 290);
		add(baby);
		
		GImage x = new GImage("GreatWork.png", 70, 200);
		//x.setColor(Color.white);
		//x.setFont("Arial-30");
		add(x);
		
		GLabel y = new GLabel("Press Spacebar to move onto the next level!", 0, 80);
		y.setColor(Color.white);
		y.setFont("Arial-40");
		add(y);
		
		GLabel z = new GLabel("Press Enter to return back to the menu", 0, 180);
		z.setColor(Color.white);
		z.setFont("Arial-40");
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
	
	private void playBackgroundNoise() {
		test.playSound(MUSIC_FOLDER, SOUND_FILES[0], false);
	}
	
	public static void main(String[] args) {
		new Pass_screen(game).start();
	}
	 
	
}