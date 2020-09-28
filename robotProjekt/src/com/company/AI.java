package com.company;


public class AI {
    //variabler
    int numberOfZebrasLeft;
    Zebra[] zebra;
    Gepard[] gepard;
    Djurlista list;
    int round;


    public AI() {
        list = new Djurlista();
        numberOfZebrasLeft = 0;

    }

    public void createArrays() {
        list.getInputOnAnimalQuantity();
        numberOfZebrasLeft = list.getQuantityZebras();
        zebra = new Zebra[list.getQuantityZebras()];
        gepard = new Gepard[list.getQuantityCheetahs()];

        Djurlista namn = new Djurlista();
        namn.setVektors(zebra, gepard);
    }

    public void startGame() {
        gameLoop();

    }

    public void gameLoop() {
        while (numberOfZebrasLeft > 0) {
            round++;
            System.out.println("\nRound: " + round);
            for (int i = 0; i < zebra.length; i++) {
                if (zebra[i].getDead() == false) {
                    System.out.println(numberOfZebrasLeft);

                    //send a object of zebra  to spelplan vektor (zebra)

                }
            }
            for (int i = 0; i < gepard.length; i++) {
                if (gepard[i].isResting() == false) {

                    //send a object of zebra  to spelplan vektor (zebra)

                }
            }

            // This loop moves all the cheetahs
            for (int i = 0; i < gepard.length; i++) {
                if (gepard[i].getDirection().equals("up")) {
                    if (gepard[i].getY() == 9) {
                        while (gepard[i].getDirection().equals("up"))
                            gepard[i].Direction();
                    } else {
                        gepard[i].setY(gepard[i].getSteps(), true);
                    }

                } else if (gepard[i].getDirection().equals("down")) {
                    if (gepard[i].getY() == 0) {
                        while (gepard[i].getDirection().equals("down"))
                            gepard[i].Direction();
                    } else {
                        gepard[i].setY(gepard[i].getSteps(), false);
                    }

                } else if (gepard[i].getDirection().equals("left")) {
                    if (gepard[i].getX() == 0) {
                        while (gepard[i].getDirection().equals("left"))
                            gepard[i].Direction();
                    } else {
                        gepard[i].setX(gepard[i].getSteps(), false);
                    }

                } else if (gepard[i].getDirection().equals("right")) {
                    if (gepard[i].getX() == 9) {
                        while (gepard[i].getDirection().equals("right"))
                            gepard[i].Direction();
                    } else {
                        gepard[i].setX(gepard[i].getSteps(), true);
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

            for (int j = 0; j < gepard.length; j++) {
                for (int i = 0; i < zebra.length; i++) {
                    int zebrasToPrint=0;

                    if (zebra[i].getX() == gepard[j].getX() && zebra[i].getY() == gepard[j].getY()) {
                        if (zebra[i].getDead() == false && gepard[j].isResting() == false) {
                            zebra[i].setDead();
                            gepard[j].restAfterEating();
                            numberOfZebrasLeft--;
                            zebrasToPrint++;


                        }
                    }
                    if(zebrasToPrint>0) {
                        printcheetah(zebrasToPrint);
                        zebrasToPrint = 0;
                    }
                }
            }
        }
    }
    public void printcheetah(int zebrasToPrint){
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


    /*for gepard[i]
        for  zebra[i]
            while (xebra gepad x,y && gepar.vila false)
            zebra (i).set(true)
            if gepard != vilar &&zebra !=död
     */

//äta
//gå


//ha


//constructor
