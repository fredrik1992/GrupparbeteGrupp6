package com.company;

import java.util.Random;

public class Message {
    Random random = new Random();
    int val;
    String returnChoice;



    public Message(){
        val = random.nextInt(7);
    }





    public String Choice() {

        switch (val) {
            case 0:
                returnChoice = "A young foal got eaten by a low ranked cheetha!";
                break;

            case 1:
                returnChoice = "The alfa-cheetha eating raw liver, poor zebra!";
                break;

            case 2:
                returnChoice = "A zebra zigged when it should zaged, poor zebra!";
                break;

            case 3:
                returnChoice = "a crippled zebra got caught, you can only run so far on three legs";
                break;

            case 4:
                returnChoice = "Sorry buddy, to slow...";
                break;

            case 5:
                returnChoice = "A young cheetha whit a killer instinct showing excellent hunting skills, poor zebra...";
                break;

            case 6:
                returnChoice = "Eeny meeny miny mo - one more zebra had to go!";
                break;

        }
        return returnChoice;


    }
}







