
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ColorPalette extends Applet implements ActionListener {

    Button red, green, blue, yellow, white;

    public void init() {
        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");
        yellow = new Button("Yellow");
        white = new Button("White");

        add(red);
        add(green);
        add(blue);
        add(yellow);
        add(white);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        white.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red)
            setBackground(Color.RED);
        else if (e.getSource() == green)
            setBackground(Color.GREEN);
        else if (e.getSource() == blue)
            setBackground(Color.BLUE);
        else if (e.getSource() == yellow)
            setBackground(Color.YELLOW);
        else if (e.getSource() == white)
            setBackground(Color.WHITE);
    }
}
