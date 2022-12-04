package classes;


import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.Timer;



import acm.program.GraphicsProgram;

public class Map extends GraphicsProgram implements ActionListener, KeyListener {
	Timer t = new Timer(1000,this);
	Score_streak box = new Score_streak();
	int map_track  = 0;
	Timer g ;

	
	
	
	// All Maps
	
	static Title_screen title = new Title_screen(); // 0
	
	static Play_game game = new Play_game(); // 3
	static Menu_screen menu = new Menu_screen(game); // 1
	static Pass_screen pass = new Pass_screen(game); // 2
	static Fail_screen fail = new Fail_screen();
	
	// 3 Levels
	Map_Database data = new Map_Database();
	 
	Level level_1 = data.get_level1();
	Level level_2 = data.get_level2();
	Level level_3 = data.get_level3();
	Level[] level_arr = new Level[] {level_1, level_2, level_3};
	int curr_level_num = 0;
	Level current = level_1;
	
	boolean fail() {
		System.out.println("fail");
		//activates when buttons are pressed
		// looks at current map --> fail screen
		if (box.get_failCount() == 3) {
			box.reset_fail();
			return true;
		}
		return false;
	}
	boolean pass(int score, Level level) {
		System.out.println("pass");
		if(score == level.get_food_length()) {
			box.reset();
			curr_level_num ++;
			if (curr_level_num < 3) {
				current = level_arr[curr_level_num];
			}
			pass.run();
			return true;
		}
		return false;
	}
	//Take Screen to menu screen
	public void run() { 
		addKeyListeners();
		title.start();
		
	
	
	}


	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("hello");
		int key = e.getKeyCode(); 
		
		if (map_track == 2) {
			System.out.println("hello");
			pass.run();
			}
		
		
			
		

		
	}
	

	
	
	
	

	
	public static void main(String args[]) {
		new Map().start();
		
		 
	}
	

}