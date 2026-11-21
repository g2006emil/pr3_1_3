package ru;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Укажите путь к картинке!");
            return;
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyFrame frame = new MyFrame(args[0]);
                frame.setVisible(true);
            }
        });
    }
}
