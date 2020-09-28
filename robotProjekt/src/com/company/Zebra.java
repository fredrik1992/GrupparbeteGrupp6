package com.company;

public class Zebra extends Animals {
    private boolean dead;
    private final int steps;

    public Zebra() {

        steps = 1;
        this.dead = false;

    }


    public boolean getDead() {
        return dead;
    }

    public void setDead() {
        dead = true;
    }

    @Override
    public int getSteps() {
        turnCounter++;
        setRest();
        Direction();
        return steps;

    }

    public void setRest() {
        if (turnCounter == 1) {
            rest = true;
            turnCounter = 0;
        } else if (turnCounter == 0) {
            rest = false;
        }

    }
}
