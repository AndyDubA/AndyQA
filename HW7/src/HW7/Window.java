package HW7;

import javax.swing.*;

public class Window extends JFrame {

    private int winWidth = 1024;
    private int winHeight = 768;
    private int winPosX = 500;
    private int winPosY = 300;

    Window() {
        System.out.println("Window");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(winPosX,winPosY);
        setSize(winWidth, winHeight);
        setVisible(true);
    }
}
