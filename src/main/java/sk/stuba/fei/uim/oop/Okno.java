package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Okno extends JFrame {

    public Okno() throws HeadlessException {
        super("Okno");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new MojPanel());
        this.setVisible(true);
    }
}
