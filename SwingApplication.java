
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingApplication extends JFrame implements ActionListener {

    JCheckBox red, green, blue;
    JLabel label;
    JButton button;

    SwingApplication() {
        setTitle("Color Selector");
        setSize(400, 300);
        setLayout(new FlowLayout());

        red = new JCheckBox("Red");
        green = new JCheckBox("Green");
        blue = new JCheckBox("Blue");

        label = new JLabel("Selected Color");
        label.setOpaque(true);
        label.setPreferredSize(new Dimension(200, 50));
        label.setHorizontalAlignment(JLabel.CENTER);

        button = new JButton("Apply Color");

        add(red);
        add(green);
        add(blue);
        add(label);
        add(button);

        button.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int r = red.isSelected() ? 255 : 0;
        int g = green.isSelected() ? 255 : 0;
        int b = blue.isSelected() ? 255 : 0;

        label.setBackground(new Color(r, g, b));
    }

    public static void main(String[] args) {
        new SwingApplication();
    }
}
