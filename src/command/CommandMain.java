package command;

import command.drawer.DrawCanvas;
import command.drawer.DrawCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CommandMain extends JFrame implements MouseMotionListener, WindowListener {
    // 그리기 이력
    private MacroCommand history = new MacroCommand();

    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    private JButton clearButton = new JButton("clear");
    private JButton redButton = new JButton("red");
    private JButton greenButton = new JButton("green");
    private JButton blueButton = new JButton("blue");

    private JButton undoButton = new JButton("undo");

    public CommandMain(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);

        clearButton.addActionListener(e->{
            history.clear();
            canvas.init();
            canvas.repaint();
        });


        undoButton.addActionListener(e->{
            history.undo();
            canvas.repaint();
        });

        redButton.addActionListener(e->{
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);
            cmd.execute();

        });

        greenButton.addActionListener(e->{
            Command cmd = new ColorCommand(canvas, Color.GREEN);
            history.append(cmd);
            cmd.execute();

        });


        blueButton.addActionListener(e->{
            Command cmd = new ColorCommand(canvas, Color.BLUE);
            history.append(cmd);
            cmd.execute();

        });


        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(undoButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new CommandMain("Command Pattern Sample");
    }
}
