package com.company;

import java.util.Random;

public class Player {
    Random r = new Random();
    private int x;
    private int y;

    public Player() {
        this.x = getRandomNumberUsingNextInt(1, 8);
        this.y = getRandomNumberUsingNextInt(1, 8);
    }

    public int getRandomNumberUsingNextInt(int min, int max) {
        return r.nextInt(max - min) + min;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
