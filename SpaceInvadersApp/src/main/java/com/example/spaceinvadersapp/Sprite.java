package com.example.spaceinvadersapp;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Sprite extends Rectangle {

    public String type;
    public boolean dead = false;

    public Sprite(int x, int y, int h, int w, String type, Color color) {
        super(w, h, color);
        this.type = type;
        setTranslateX(x);
        setTranslateY(y);
    }

    public void moveLeft() {
        double newX = getTranslateX() - 5;
        setTranslateX(newX);
    }

    public void moveUp() {
        double newY = getTranslateY() - 5;
        setTranslateX(newY);
    }

    public void moveRight() {
        double newX = getTranslateX() + 5;
        setTranslateX(newX);
    }

    public void moveDown() {
        double newY = getTranslateY() + 5;
        setTranslateY(newY);

    }
    public void kill(){
        this.dead = true;
    }
}
