package com.company;


public class AI {
    //variabler
    int numberOfZebrasLeft;
    Zebra[] zebra;
    Cheetah[] cheetah;
    AnimalList list;
    int round;


    public AI() {
        list = new AnimalList();
        numberOfZebrasLeft = 0;

    }

    public void createArrays() {
        list.getInputOnAnimalQuantity();
        numberOfZebrasLeft = list.getQuantityZebras();
        zebra = new Zebra[list.getQuantityZebras()];
        cheetah = new Cheetah[list.getQuantityCheetahs()];

        AnimalList namn = new AnimalList();
        namn.setVectors(zebra, cheetah);
    }

    public void startGame() {
        gameLoop();

    }

    public void gameLoop() {
        while (numberOfZebrasLeft > 0) {
            round++;
            System.out.println("\nRound: " + round);
            for (int i = 0; i < zebra.length; i++) {
                if (!zebra[i].getDead()) {
                    System.out.println(numberOfZebrasLeft);

                    //send a object of zebra  to spelplan vektor (zebra)

                }
            }
            for (int i = 0; i < cheetah.length; i++) {
                if (!cheetah[i].isResting()) {

                    //send a object of zebra  to spelplan vektor (zebra)

                }
            }

            // This loop moves all the cheetahs
            for (int i = 0; i < cheetah.length; i++) {
                if (cheetah[i].getDirection().equals("up")) {
                    if (cheetah[i].getY() == 9) {
                        while (cheetah[i].getDirection().equals("up"))
                            cheetah[i].Direction();
                    } else {
                        cheetah[i].setY(cheetah[i].getSteps(), true);
                    }

                } else if (cheetah[i].getDirection().equals("down")) {
                    if (cheetah[i].getY() == 0) {
                        while (cheetah[i].getDirection().equals("down"))
                            cheetah[i].Direction();
                    } else {
                        cheetah[i].setY(cheetah[i].getSteps(), false);
                    }

                } else if (cheetah[i].getDirection().equals("left")) {
                    if (cheetah[i].getX() == 0) {
                        while (cheetah[i].getDirection().equals("left"))
                            cheetah[i].Direction();
                    } else {
                        cheetah[i].setX(cheetah[i].getSteps(), false);
                    }

                } else if (cheetah[i].getDirection().equals("right")) {
                    if (cheetah[i].getX() == 9) {
                        while (cheetah[i].getDirection().equals("right"))
                            cheetah[i].Direction();
                    } else {
                        cheetah[i].setX(cheetah[i].getSteps(), true);
                    }
                }
            }

            // This loop moves all of the zebras
            for (int i = 0; i < zebra.length; i++) {
                if (zebra[i].getDirection().equals("up")) {
                    if (zebra[i].getY() == 9) {
                        while (zebra[i].getDirection().equals("up"))
                            zebra[i].Direction();
                    } else {
                        zebra[i].setY(zebra[i].getSteps(), true);
                    }

                } else if (zebra[i].getDirection().equals("down")) {
                    if (zebra[i].getY() == 0) {
                        while (zebra[i].getDirection().equals("down"))
                            zebra[i].Direction();
                    } else {
                        zebra[i].setY(zebra[i].getSteps(), false);
                    }

                } else if (zebra[i].getDirection().equals("left")) {
                    if (zebra[i].getX() == 0) {
                        while (zebra[i].getDirection().equals("left"))
                            zebra[i].Direction();
                    } else {
                        zebra[i].setX(zebra[i].getSteps(), false);
                    }

                } else if (zebra[i].getDirection().equals("right")) {
                    if (zebra[i].getX() == 9) {
                        while (zebra[i].getDirection().equals("right"))
                            zebra[i].Direction();
                    } else {
                        zebra[i].setX(zebra[i].getSteps(), true);
                    }
                }
            }

            for (int j = 0; j < cheetah.length; j++) {
                for (int i = 0; i < zebra.length; i++) {
                    int zebrasToPrint = 0;

                    if (zebra[i].getX() == cheetah[j].getX() && zebra[i].getY() == cheetah[j].getY()) {
                        if (zebra[i].getDead() == false && cheetah[j].isResting() == false) {
                            zebra[i].setDead();
                            cheetah[j].restAfterEating();
                            numberOfZebrasLeft--;
                            zebrasToPrint++;


                        }
                    }
                    if (zebrasToPrint > 0) {
                        printcheetah(zebrasToPrint);
                        zebrasToPrint = 0;
                    }
                }
            }
        }
    }

    public void printcheetah(int zebrasToPrint) {
        System.out.printf("\n" +
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
        System.out.printf("%d", zebrasToPrint);
    }
}
