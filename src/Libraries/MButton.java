package Libraries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MButton extends JComponent implements MouseListener {
    public String text;

    public Dimension size;

    public Point position;

    public Container container;

    private boolean mouseEntered;
    private boolean pressed;

    public MButton(Container container, Point position, Dimension size, String text) {
        super();

        this.container = container;
        this.position = position;
        this.size = size;
        container.add(this);
        this.setBounds(position.x, position.y, size.width, size.height);
        System.out.println(this.position.x + " " + this.position.y + " " + this.size.width + " " + this.size.height);

        this.text = text;

        enableInputMethods(true);
        addMouseListener(this);

        setSize(size.width, size.height);
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (pressed) {
            g.setColor(new Color(0x34FFE7));
            g.fillRoundRect(0, (int) (size.height * 0.1), size.width, (int) (size.height * 0.9), size.height / 5, size.height / 5);
            g.setColor(new Color(0x1D8379));
            g.setFont(Methods.getFont(50));
            g.drawString(text, 10, (int) (size.height * 0.9)/2+(int) (size.height * 0.1));
        } else {
            g.setColor(new Color(0x23A99A));
            g.fillRoundRect(0, 0, size.width, size.height, size.height / 5, size.height / 5);
            g.setColor(new Color(0x34FFE7));
            g.fillRoundRect(0, 0, size.width, (int) (size.height * 0.9), size.height / 5, size.height / 5);
            g.setColor(new Color(0x23A99A));
            g.setFont(Methods.getFont(50));
            g.drawString(text, 10, (int) (size.height * 0.9)/2);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(getWidth(), getHeight());
    }

    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

    @Override
    public Dimension getMaximumSize() {
        return getPreferredSize();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        pressed = true;
        System.out.println("pressed " + this);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        pressed = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseEntered = true;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseEntered = false;
    }
}
