package projektarbetet;


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
        turnCounter ++;
        setRest();
        return steps;

    }

    public void setRest() {
        if (turnCounter ==1){
            rest = true;
            turnCounter =0;
        }
        else if(turnCounter == 0){
            rest = false;
        }

    }



}
