package sk.stuba.fei.uim.oop;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;


public class Okno extends JFrame implements MouseListener, MouseMotionListener, KeyListener, ChangeListener {

    public Okno() throws HeadlessException {
        super();
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //  this.addMouseListener(this);
        //this.addMouseMotionListener(this);
        //this.addKeyListener(this);

        JSlider s = new JSlider(JSlider.HORIZONTAL,0,50,20);
        s.setMinorTickSpacing(1);
        s.setMajorTickSpacing(10);
        s.setPaintTicks(true);
        s.setPaintLabels(true);
        s.addChangeListener(this);

        this.add(s);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("KLIK: "+e.getPoint().toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed: "+e.getPoint().toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released: "+e.getPoint().toString());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entered: "+e.getPoint().toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exited: "+e.getPoint().toString());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Dragged: "+e.getPoint().toString());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moved: "+e.getPoint().toString());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Typed: "+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressed: "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released: "+e.getKeyChar());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        System.out.println(((JSlider)e.getSource()).getValue());
    }
}
