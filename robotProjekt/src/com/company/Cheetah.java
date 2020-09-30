package com.company;

import java.util.Random;

public class Cheetah extends Animals {
    private final boolean resting;
    int steps;
    Random rand;

    public Cheetah() {
        resting = false;
        rand = new Random();
        steps = 1 + rand.nextInt(1);
    }


    public boolean isResting() {
        return resting;
    }

    @Override
    public int getSteps() {// called when moving an animal to keep track on its turn and if it has to rest and getting how many steps to take
        turnCounter++;
        setRest();
        Direction();
        return steps;
    }

    public void restAfterEating() {
        this.rest = true;
    }// used when the cheetah eats to make it rest

    public void setRest() {//used to check if the cheetah has moved more then 3 turns then it have to rest
        if (turnCounter == 3) {
            rest = true;
            turnCounter = 0;
        } else {
            rest = false;
        }

    }
}
