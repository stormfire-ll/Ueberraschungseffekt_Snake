package org.example;

import java.awt.*;
import java.util.Random;
import java.util.Timer;

public class GameBoard {
    private final int WIDTH = 300;
    private final int HEIGHT = 300;
    private final int SQUARE_SIZE = 10;
    private final int ROWS = 30;
    private final int COLUMNS = ROWS;
    private final int ALL_SQUARES = 900;
    private final int RANDOM_POS = 31;
    private final int SPEED = 100;
    private final int x[] = new int[ALL_SQUARES];
    private final int y[] = new int[ALL_SQUARES];

    private Timer timer;
    //load pictures, gameboard, snake, apple, head

    private void randomApple() {
        Random random = new Random();
        int randomApple = random.nextInt(300)+1;
    }
}



