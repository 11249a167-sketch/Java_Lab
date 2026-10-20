
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingControls {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Controls");

        JLabel l = new JLabel("Enter your name:");
        JTextField t = new JTextField(15);
        JButton b = new JButton("Submit");
        JLabel result = new JLabel("");

        f.setLayout(new FlowLayout());

        f.add(l);
        f.add(t);
        f.add(b);
        f.add(result);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText("Welcome " + t.getText());
            }
        });

        f.setSize(350, 180);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
