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
	GLabel w_label, a_label, s_label, d_label;
	GImage bun, ketchup, tofu, tomato;
	GImage belt, background, hCircle;
	GImage[] food = new GImage[] {};
	int xlabel = 50, ylabel = 50;
	ArrayList<GImage> list = new ArrayList<GImage> ();
	public void run() {

		belt = new GImage("longconveyor.png", 0, 500);
		background = new GImage("title_screen_bluebackground.jpg", 0, 0);
		hCircle = new GImage("hitcircle.png", 550, 400);
		
		bun = new GImage("bun.png", x_loc, y_loc);
		ketchup = new GImage("ketchup.png", x_loc, y_loc);
		tofu = new GImage("tofu.png", x_loc, y_loc);
		tomato = new GImage("tomato.png", x_loc, y_loc);
		food = new GImage[] {bun, ketchup, tofu, tomato};
		W = new GLabel("W", 635, 290);
		W.setFont("Arial-70");
		A = new GLabel("A", 600, 350);
		A.setFont("Arial-70");
		S = new GLabel("S", 650, 350);
		S.setFont("Arial-70");
		D = new GLabel("D", 700, 350);
		D.setFont("Arial-70");
		

		w_label = new GLabel("Press the Right Key for the Right Item (e.g. Bun for W)", xlabel, ylabel);
		a_label = new GLabel("Pressing the right button generates a streak and adds a point",xlabel, ylabel);
		s_label = new GLabel("Pressing the wrong button resets streak and point",xlabel, ylabel);
		d_label = new GLabel("Enjoy game",xlabel, ylabel);
		
		
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

		
		
		
		movement = new Timer(MS, this);
		movement.start();
		addKeyListeners();
		
		
	}
	public void actionPerformed(ActionEvent e) {

		long change = 0, schange, echange;
		int i = 0;
		for (GImage f:list) {
			f.move(speed, 0);
			if (f.getX() > 600 && count1 == i) {
				label(count1);
				schange = System.currentTimeMillis();
				while (change < 2000) {
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
	public void delay() {
		long s = System.currentTimeMillis();
		long e = System.currentTimeMillis();
		while (e - s < 4000) {
			e = System.currentTimeMillis();
		}
		
		}
	public void label(int num) {
		System.out.println(num);
		
		// W
		if (num == 0) {
			add(w_label);
			//delay();
			
		}
		// A
		else if (num == 1) {
			
			w_label.setVisible(false);
			add(a_label);
			delay();
			
		}
		// S
		else if ( num == 2) {
			
			add(s_label);
			delay();
			a_label.setVisible(false);
			
		}
		
		// D
		else if ( num == 3) {
			s_label.setVisible(false);
			
			add(d_label);
			delay();
			
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_RIGHT) {
			speed += 5;
		}
		if (keyCode == KeyEvent.VK_LEFT) {
			if (speed > 1) {
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