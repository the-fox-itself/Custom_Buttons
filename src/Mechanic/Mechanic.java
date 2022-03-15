package Mechanic;

import Libraries.MButton;

import java.awt.*;
import java.io.IOException;

import static Libraries.Methods.*;
import static Mechanic.MainVariables.*;

public class Mechanic {
    public void preparation() {
        try {
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(Font.createFont(Font.TRUETYPE_FONT, FONT_ALUNDRA_TEXT));
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }

        frame.add(drawPanel);
        drawPanel.setLayout(null);
        drawPanel.setBounds(0, 0, (int) Math.pow(10, 5), (int) Math.pow(10, 5));

        mainMenu();

        visTrue(frame);

        gameLoopOn = true;
        gameLoop.start();
    }
    public void mainMenu() {
        new MButton(drawPanel, new Point(200, 400), new Dimension(200, 100), "Ctr");
        new MButton(drawPanel, new Point(420, 400), new Dimension(500, 100), "Space");
        new MButton(drawPanel, new Point(1230, 400), new Dimension(100, 100), "");
        new MButton(drawPanel, new Point(1120, 400), new Dimension(100, 100), "");
        new MButton(drawPanel, new Point(1340, 400), new Dimension(100, 100), "");
        new MButton(drawPanel, new Point(1230, 290), new Dimension(100, 100), "");
    }
}
