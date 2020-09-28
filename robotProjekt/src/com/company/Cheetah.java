package com.company;

import java.util.Random;

public class Cheetah extends Animals {
    private boolean resting;
    private boolean eating;
    int steps;
    Random rand;

    public Cheetah() {
        resting = false;
        eating = false;
        rand = new Random();
        steps = 1 + rand.nextInt(1);
    }


    public boolean isResting() {
        return resting;
    }

    @Override
    public int getSteps() {
        turnCounter++;
        setRest();
        Direction();
        return steps;
    }

    public void restAfterEating() {
        this.rest = true;
    }

    public void setRest() {///kolla på denna
        if (turnCounter == 3) {
            rest = true;
            turnCounter = 0;
        } else if (turnCounter != 3) {
            rest = false;
        }

    }
}
