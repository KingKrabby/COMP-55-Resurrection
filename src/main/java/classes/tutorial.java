package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.Timer;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class tutorial extends Map{
	int x_loc = 0;
	int y_loc = 435;
	int speed = 20;
	int track = 0;
	long start;
	long end;
	long elapsed;
	int count;
	int count1 = 0;
	int check;
	Timer movement;
	GLabel W;
	ArrayList<GImage> list = new ArrayList<GImage> ();
	public void run() {

		GImage belt = new GImage("longconveyor.png", 0, 500);
		GImage background = new GImage("title_screen_bluebackground.jpg", 0, 0);
		
		GImage hCircle = new GImage("hitcircle.png", 550, 400);
		W = new GLabel("W", 650, 300);
		W.setFont("Arial-70");
		
		
		
		final int MS = 1000;
		
		count = 0;
		check = 1000;
		start = System.currentTimeMillis();
		add(background);
		add(belt);
		add(hCircle);
		add(W);
		
		
		movement = new Timer(MS, this);
		movement.start();
		addKeyListeners();
		
		
	}
	public void actionPerformed(ActionEvent e) {
		GImage bun = new GImage("bun.png", x_loc, y_loc);
		GImage ketchup = new GImage("ketchup.png", x_loc, y_loc);
		GImage tofu = new GImage("tofu.png", x_loc, y_loc);
		GImage tomato = new GImage("tomato.png", x_loc, y_loc);
		GImage[] food = new GImage[] {bun, ketchup, tofu, tomato};
		long change = 0, schange, echange;
		int i = 0;
		for (GImage f:list) {
			f.move(speed, 0);
			if (f.getX() > 600 && count1 == i) {
				schange = System.currentTimeMillis();
				while (change < 5000) {
					echange = System.currentTimeMillis();
					change = echange - schange;	
				}
				count1 ++;
				
			}
			i ++;
		}
		end = System.currentTimeMillis();
		elapsed = end - start;
		
		if (elapsed > check && count < 4) {
			list.add(food[count]);
			add(food[count]);
			check += 4000;
			count += 1;
		}
		
	}
	public void label(int num) {
		
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_RIGHT) {
			speed += 5;
		}
		if (keyCode == KeyEvent.VK_LEFT) {
			if (speed > 0) {
				speed --;
			}
			
		}
		if (keyCode == KeyEvent.VK_ESCAPE) {
			menu.start();
		}
	}
	public static void main(String args[]) {
		new tutorial().start();
	}
	
}