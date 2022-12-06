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
	GLabel W, A, S, D;
	ArrayList<GImage> list = new ArrayList<GImage> ();
	public void run() {

		GImage belt = new GImage("longconveyor.png", 0, 500);
		GImage background = new GImage("title_screen_bluebackground.jpg", 0, 0);
		
		GImage hCircle = new GImage("hitcircle.png", 550, 400);
		W = new GLabel("W", 650, 300);
		W.setFont("Arial-70");
		A = new GLabel("W", 650, 300);
		A.setFont("Arial-70");
		S = new GLabel("W", 650, 300);
		S.setFont("Arial-70");
		D = new GLabel("W", 650, 300);
		D.setFont("Arial-70");
		
		
		
		final int MS = 1000;
		
		count = 0;
		check = 1000;
		start = System.currentTimeMillis();
		add(background);
		add(belt);
		add(hCircle);
		add(W);
		add(A);
		add(S);
		add(D);
		W.setVisible(false);
		A.setVisible(false);
		S.setVisible(false);
		D.setVisible(false);
		
		
		
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
				while (change < 2000) {
					echange = System.currentTimeMillis();
					change = echange - schange;	
				}
				label(count1);
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
	public void delay() {
		long s = System.currentTimeMillis();
		long e = System.currentTimeMillis();
		while (e - s < 4000) {
			e = System.currentTimeMillis();
		}
		
		}
	public void label(int num) {
		// W
		if (num == 0) {
			GLabel w_label = new GLabel("Press the Right Key for the Right Item (e.g. Bun for W)", 20, 20);
			add(w_label);
			delay();
			w_label.setVisible(false);
		}
		// 
		else if (num == 1) {
			GLabel a_label = new GLabel("Pressing the right button generates a streak and adds a point", 20, 20);
			add(a_label);
			delay();
			a_label.setVisible(false);
		}
		// S
		else if ( num == 2) {
			GLabel s_label = new GLabel("Pressing the wrong button resets streak and point", 20, 20);
			add(s_label);
			delay();
			s_label.setVisible(false);
		}
		
		// D
		else if ( num == 3) {
			GLabel d_label = new GLabel("Enjoy game", 20, 20);
			add(d_label);
			delay();
			d_label.setVisible(false);
			
		}
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