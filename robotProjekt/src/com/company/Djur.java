package com.company;

import java.util.Random;

public abstract class Djur {
    Random random = new Random();
    int x;
    int y;


    int direction;
    String dir = "up";
    int turnCounter;
    boolean rest;

    public Djur() {
        x = random.nextInt(10);
        y = random.nextInt(10);
        direction = random.nextInt(4);
        rest = false;
        turnCounter = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x, boolean xCheck) {
        if (xCheck == true) {
            this.x += x;

        } else if (xCheck == false) {
            this.x -= x;
        }
        this.x = x;
    }

    public void setY(int y, boolean yCheck) {

            if (yCheck == true) {
                this.y += y;

            } else if (yCheck == false) {
                this.y -= y;
            }
    }


    public String Direction() {
        direction = random.nextInt(4);
        switch (direction) {
            case 0: // up
                dir = "up";
                break;
            case 1: // down
                dir = "down";
                break;
            case 2: // left
                dir = "left";
                break;
            case 3: // right
                dir = "right";
                break;
        }
        return dir;
    }

    abstract int getSteps();


    public String getDirection() {
        return this.dir;
    }
}
