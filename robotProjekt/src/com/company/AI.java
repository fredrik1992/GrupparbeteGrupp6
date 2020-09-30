package com.company;

public class AI {

    int numberOfZebrasLeft;
    int round;
    Zebra[] zebra;
    Cheetah[] cheetah;
    AnimalList list;
    GameBoard plan;
    Message deathMessage;

    public AI() {
        list = new AnimalList();
        numberOfZebrasLeft = 0;
    }


    public void createVectors() {//this whole method is used to give our vectors a size and give them objects
        list.getInputOnAnimalQuantity();//using the list object we call on the method getQuantity and sets values for zebras and cheetas
        numberOfZebrasLeft = list.getQuantityZebras();//assigns the total number of zebras  alive at the start of the game

        zebra = new Zebra[list.getQuantityZebras()];//gives our zebra vector its size
        cheetah = new Cheetah[list.getQuantityCheetahs()];//gives our cheetah vector its size

        //remove this  we allredy have an animalList vector AnimalList name = new AnimalList();
        list.setArrays(zebra, cheetah);// using our list object we send our vectors into it's set vector method that
        plan = new GameBoard(zebra, cheetah);
    }                           //assigns objects to them



    public void startGame() {//this lope runs the entire game using values from the animal vectors
        while (numberOfZebrasLeft > 0) {//checks if we reached the end of game''all zebras are dead''
            if (numberOfZebrasLeft <= 2) {//slows the program down when 2 zebras are left in the game
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }

            round++;//adds to round to remember what round we are in
            System.out.println("\nRound: " + round);//prints the current round
            plan.print();


            // This loop moves all the cheetahs
            for (Cheetah value : cheetah) {//checks every cheetahs current direction and changes it if they are at the edge
                switch (value.getDirection()) {//otherwise it just moves it
                    case "up":// checks if the value up is in the current cheetah
                        if (value.getY() == 9) {//checks if they have reached the edge
                            while (value.getDirection().equals("up"))//changes the value to a random direction that
                                value.Direction();                   //is not the current one
                        } else {// if they are not at the edge the cheetah is moved
                            value.setY(value.getSteps(), true);
                        }

                        break;
                    case "down":
                        if (value.getY() == 0) {
                            while (value.getDirection().equals("down"))
                                value.Direction();
                        } else {
                            value.setY(value.getSteps(), false);
                        }

                        break;
                    case "left":
                        if (value.getX() == 0) {
                            while (value.getDirection().equals("left"))
                                value.Direction();
                        } else {
                            value.setX(value.getSteps(), false);
                        }

                        break;
                    case "right":
                        if (value.getX() == 9) {
                            while (value.getDirection().equals("right"))
                                value.Direction();
                        } else {
                            value.setX(value.getSteps(), true);
                        }
                        break;
                }
            }

            // This loop moves all of the zebras
            for (Zebra value : zebra) {
                switch (value.getDirection()) {
                    case "up":
                        if (value.getY() == 9) {
                            while (value.getDirection().equals("up"))
                                value.Direction();
                        } else {
                            value.setY(value.getSteps(), true);
                        }

                        break;
                    case "down":
                        if (value.getY() == 0) {
                            while (value.getDirection().equals("down"))
                                value.Direction();
                        } else {
                            value.setY(value.getSteps(), false);
                        }

                        break;
                    case "left":
                        if (value.getX() == 0) {
                            while (value.getDirection().equals("left"))
                                value.Direction();
                        } else {
                            value.setX(value.getSteps(), false);
                        }

                        break;
                    case "right":
                        if (value.getX() == 9) {
                            while (value.getDirection().equals("right"))
                                value.Direction();
                        } else {
                            value.setX(value.getSteps(), true);
                        }
                        break;
                }
            }

            for (Cheetah value : cheetah) {// cheecks every cheetah against each zebra to see if they have the same
                for (Zebra item : zebra) {//position (x,y)
                    int zebrasToPrint = 0;//gives zebrasto print the initual value to check how many dies at one round

                    if (item.getX() == value.getX() && item.getY() == value.getY()) {//checks x,y of cheetahs against zebras
                        if (!item.getDead() && !value.isResting()) {//checks if a zebra is going do die
                            item.setDead();
                            value.restAfterEating();
                            numberOfZebrasLeft--;//this will eventually end the game
                            zebrasToPrint++;
                        }
                    }
                    if (zebrasToPrint > 0) {//checks if we need to print enything this round
                        printCheetah();
                    }
                }
            }
        }
    }


    public void printCheetah() {
        deathMessage = new Message();
        String zebraWaysToDiePrint = deathMessage.Choice();

        System.out.print("\n" +
                "\n" +
                "\n" +
                "\n" +
                "                                                                                                                                        _____\n" +
                "                                                                                                                                      _/ _ _ \\\n" +
                "                                                                                                                                     /    \\ \\_\\__\n" +
                "                                                                                                                               _____/    /(      \\\n" +
                "                                                                                                                              |  _______/         \\\n" +
                "                                                                                                                             _| /                  \\     \n" +
                "                                                                                                                ____________|__/                    \\\n" +
                "                                                                                                               /                            __       \\   \n" +
                "                                                         _____________/\\____                                __/                            /   \\      | \n" +
                "  ---                        __________                 /             \\/    \\___                           /                              |     \\____/ \n" +
                "  | |                       |          \\_______________/                        )                         /                               |          \n" +
                "  | |          -------------                                            \\______/                   ______/                      /         /\n" +
                "  \\ \\         / -----------                                             /                         / _____                      /         /\n" +
                "   \\ \\-------/ /          /                                            /              -- ________/ /   /                       |        /______\n" +
                "    ----------/          /                                            |               \\___________/    |       _____            \\      _____   \\   \n" +
                "                  ______/        ____                                \\|                                |      /    \\_____________\\          \\   \\\n" +
                "                 /              /    \\___                             \\                                |     /     /              \\________  |   \\\n" +
                "                /              /         \\_______________________|     \\                              /     /     /                        | |\\  |\n" +
                "               /  ____________/                                  |      \\_________                   /   __/  ___|                         | | \\ |\n" +
                "              (  /                                                \\_____________  \\                 /   /    /                             | | / /\n" +
                "           ___| /                                                  \\    \\       |  \\             __/  _//___/                              / /  /\n" +
                "          |   _/                                                    \\__  \\      |   |           /    /                                   |  /\\__|\n" +
                "          \\/_/                                                         \\  \\      \\ /           /____/                                    \\__|\n" +
                "                                                                        \\  \\__\n" +
                "                                                                         \\ ____\\                                                                        \n" +
                "                                                                             ");
        System.out.printf("%s", zebraWaysToDiePrint);
    }
}
