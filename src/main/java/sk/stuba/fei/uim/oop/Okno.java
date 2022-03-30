package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;




public class Okno extends JFrame {

    public Okno() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new MojPanel());
        this.pack();
        this.setVisible(true);
    }


}
