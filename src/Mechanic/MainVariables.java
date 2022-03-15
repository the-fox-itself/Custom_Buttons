package Mechanic;

import Mechanic.GameThreads.GameLoop;

import javax.swing.*;

import java.io.File;

import static Libraries.Methods.*;

public abstract class MainVariables {
    public static double millisecondsPerUpdate = 1000d/30;
    public static boolean gameLoopOn;

    public static final DrawPanel drawPanel = new DrawPanel();
    public static final GameLoop gameLoop = new GameLoop();

    public static JFrame frame = getFrame("Task Board Prototype", null, FRAME_SIZE.width, FRAME_SIZE.height, null, null, true);

    final public static File FONT_ALUNDRA_TEXT = new File("resources"+SEPARATOR+"fonts"+SEPARATOR+"AlundraText.ttf");
    public static final String FONT_USED = "AlundraText";
}
