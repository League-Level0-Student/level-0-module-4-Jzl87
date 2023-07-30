package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    PImage creeper;     //at the top of your program
    int x = 244;
    int y = 123;
    
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	  PImage minecraft = loadImage("HEROBIRNE.jpg");     //in setup method
          minecraft.resize(width, height);          //in setup method
          background(minecraft);          //in setup method
          creeper=loadImage("CREEPERAWWWMANNNNN.png");   
          creeper.resize(10, 10);//in setup method
    }
    
    @Override
    public void draw() {
    	image(creeper, x, y);
    	if (isNear(mouseX, x) && isNear(mouseY, y)) {
    		fill(0, 255, 0);
    	} else {
    	fill(255,0,0 ); }
    	ellipse(mouseX, mouseY, 5,5);//in draw method
    
    }
    boolean isNear(int a, int b) {
		if (abs(a - b) < 10)
		     return true;
		else
		     return false;
	}

    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
