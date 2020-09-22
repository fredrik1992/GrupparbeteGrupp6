package com.company;

import java.util.Random;

public class Djur {
        Random random = new Random();
        int x;
        int y;
        int direction;
        String dir;

        public Djur() {
            x = random.nextInt(10);
            y = random.nextInt(10);
            direction = random.nextInt(4);
        }
        public String Direction() {
            switch (direction) {
                case 0: // up
                    dir = "up";
                    break;
                case 1: // down
                    dir = "down";
                    break;
                case 2: // left
                    dir = "left";
                    break;
                case 3: // right
                    dir = "right";
                    break;
            }
            return dir;
        }
}
