package command.drawer;

import command.ColorCommand;
import command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {

    private Color color;
    private int radius;

    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
        init();
    }

    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void init() { // 초기화
        color = Color.RED;
        radius = 6;
        history.append(new ColorCommand(this, color));
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
