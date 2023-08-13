package _99_extra.pong;

import processing.core.PApplet;
import processing.core.PImage;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int xPos = 400;
    int yPos = 300;
    int pY = 580;
    int speedX = 3;
    int speedY = 3;
    PImage background;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    	background = loadImage("HEROBIRNE.jpg");
    	background.resize(WIDTH, HEIGHT);
    	
    	}

    @Override
    public void draw() {
    	xPos = xPos + speedX;
    	if (xPos > width) {
    		speedX = speedX * -1;
    	}
    	if (xPos < 0) {
    		speedX = speedX * -1;
    	}
    	
    	yPos = yPos + speedY;
    	if (yPos > height) {
    		speedY = speedY * -1;
    	}
    	
    	if (yPos < 0) {
    		speedY = speedY * -1;
    	}
    	
    	background(background);
    	
    	fill(240,0,0);
    	noStroke();
    	ellipse(xPos, yPos, 10,10);
    	
    	rect(mouseX, pY, 50, 20 );
    	if (xPos > mouseX && xPos < mouseX + 50 && yPos > pY) {
    		speedY = speedY * -1;
    	}
    	
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}