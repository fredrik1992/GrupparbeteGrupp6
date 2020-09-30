package com.company;

import java.util.Random;

public class Message {
    Random random = new Random();
    int death;
    String returnChoice;

    public Message(){
        death = random.nextInt(8);
    }

    public String Choice() {

        switch (death) {
            case 0:
                returnChoice = "A young foal got eaten by a low ranked cheetah!";
                break;

            case 1:
                returnChoice = "The alfa-cheetah eating raw liver, poor zebra!";
                break;

            case 2:
                returnChoice = "A zebra zigged when it should have zaged, poor zebra!";
                break;

            case 3:
                returnChoice = "a crippled zebra got caught, you can only run so far on three legs";
                break;

            case 4:
                returnChoice = "Sorry buddy, too slow...";
                break;

            case 5:
                returnChoice = "A young cheetah with a killer instinct showing excellent hunting skills, poor zebra...";
                break;

            case 6:
                returnChoice = "Eeny meeny miny mo - one more zebra had to go!";
                break;
                
            case 7 :
                returnChoice = "A young zebra got separated from the herd and ...";
                break;

        }
        return returnChoice;


    }
}



