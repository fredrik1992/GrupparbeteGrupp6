package com.company;


import java.util.Random;

public class Gepard extends Djur {
    private boolean resting;
    private boolean eating;
    private int direction;
    private int x;
    private int y;
    int steps;
    Random rand;

    public Gepard() {
        //super(x, y);

        resting = false;
        eating = false;
        rand = new Random();
        steps = 1 + rand.nextInt(1);
    }


    public boolean isResting() {
        return resting;
    }


    public boolean isEating() {
        return eating;
    }

    public void Eat() {
        eating = true;
    }

    public void rest() {
        resting = true;
    }

    public void Stop_rest() {
        resting = false;
    }

    @Override
    public int getSteps() {
        return steps;
    }

}

