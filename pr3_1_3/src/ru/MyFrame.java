
package ru;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String imagePath) {
        setTitle("Моя картинка");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        ImageIcon image = new ImageIcon(imagePath);

        JLabel label = new JLabel(image);

        add(label);
    }
}
