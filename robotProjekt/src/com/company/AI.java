package com.company;

public class AI {
    //variables
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

        AnimalList name = new AnimalList();
        name.setVectors(zebra, cheetah);
    }

    public void startGame() {
        gameLoop();
    }

    public void gameLoop() {
        while (numberOfZebrasLeft > 0) {
            round++;
            System.out.println("\nRound: " + round);
            for (Zebra value : zebra) {
                if (!value.getDead()) {
                    System.out.println(numberOfZebrasLeft);

                    //send a object of zebra to GamePlan vector (zebra)
                }
            }
            //send a object of zebra to GamePlan vector (zebra)

            // This loop moves all the cheetahs
            for (Cheetah value : cheetah) {
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

            for (Cheetah value : cheetah) {
                for (Zebra item : zebra) {
                    int zebrasToPrint = 0;

                    if (item.getX() == value.getX() && item.getY() == value.getY()) {
                        if (!item.getDead() && !value.isResting()) {
                            item.setDead();
                            value.restAfterEating();
                            numberOfZebrasLeft--;
                            zebrasToPrint++;
                        }
                    }
                    if (zebrasToPrint > 0) {
                        printCheetah(zebrasToPrint);
                    }
                }
            }
        }
    }

    public void printCheetah(int zebrasToPrint) {
        Message m = new Message();
        String message = m.Choice();

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
        System.out.printf("%s", message);
    }
}
