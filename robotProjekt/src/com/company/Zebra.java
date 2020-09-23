package com.company;


public class Zebra extends Djur {
    private boolean dead;
    private int steps;


    public Zebra() {
       
        steps = 1;
        dead = false;

    }


    public boolean getDead() {
        return dead;
    }

    public void setDead() {
        dead = true;
    }

    @Override
    public int getSteps() {
        return steps;
    }

    public void setSteps() {

    }


}

