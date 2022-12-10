package org.example;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case 39:    //right
                break;

            case 37:    //left
                    break;
            case 38:    //up
                break;
            case 40:    //down
                break;
        }
    }
}
