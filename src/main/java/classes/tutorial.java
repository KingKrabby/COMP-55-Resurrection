package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class tutorial extends GraphicsProgram implements ActionListener{
	int x_loc = 0;
	int y_loc = 300;
	int speed = 20;
	int track = 0;
	long start;
	long end;
	long elapsed;
	int count;
	int check;
	ArrayList<GImage> list = new ArrayList<GImage> ();
	public void run() {

		GImage belt = new GImage("longconveyor.png", 0, 500);
		GImage background = new GImage("title_screen_bluebackground.jpg", 0, 0);
		
		GImage hCircle = new GImage("hitcircle.png", 550, 400);

		
		Timer movement;
		final int MS = 1000;
		
		count = 0;
		check = 1000;
		start = System.currentTimeMillis();
		add(background);
		add(belt);
		add(hCircle);
		movement = new Timer(MS, this);
		movement.start();
		
		
	}
	public void actionPerformed(ActionEvent e) {
		GImage bun = new GImage("bun.png", x_loc, y_loc);
		GImage ketchup = new GImage("ketchup.png", x_loc, y_loc);
		GImage tofu = new GImage("tofu.png", x_loc, y_loc);
		GImage tomato = new GImage("tomato.png", x_loc, y_loc);
		GImage[] food = new GImage[] {bun, ketchup, tofu, tomato};
		
		
		for (GImage f:list) {
			f.move(speed, 0);
		}
		end = System.currentTimeMillis();
		elapsed = end - start;
		
		if (elapsed > check && count < 4) {
			list.add(food[count]);
			add(food[count]);
			check += 1000;
			count += 1;
		}
		
		
	}
	public void move() {

	}
	public static void main(String args[]) {
		new tutorial().start();
	}
	
}