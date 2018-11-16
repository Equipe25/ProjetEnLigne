package amzevent.UI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawRectangle extends JFrame {

    public DrawRectangle() {
        super("Eric Lyons-Davis");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new DrawRectanglePanel());
        final int sixHun = 600; //used to clear magic numbers
        
        setSize(sixHun, sixHun);
        setVisible(true);
    }

    /**
     * <p>
     * This creates a panel which is where the info for
     * mouse action events occur. This also holds variables that
     * are responsible for holding the coordinates of both
     * of the clickpoints used to create the rectangle. They
     * are x1, y1, x2 and y2.
     * </p>
     * 
     */
    private class DrawRectanglePanel extends JPanel implements MouseListener,
            MouseMotionListener {

        //Coordonnée Click
        private int x1;
        private int y1;
        
        //Coordonnée Drag
        private int x2;
        private int y2;

        public DrawRectanglePanel() {
            addMouseListener(this);
            addMouseMotionListener(this);
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // DRAWING CODE HERE
            g.setColor(Color.blue);
            g.fillRect(x1, y1, x2, y2);

        }
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
            x2 = 0;
            y2 = 0;
        }

        public void mouseReleased(MouseEvent e) {

        }
        public void mouseDragged(MouseEvent e) {
            x2 = e.getX() - x1;
            y2 = e.getY() - y1;
            repaint();
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }
        public void mouseClicked(MouseEvent e) {
        }
        public void mouseMoved(MouseEvent e) {
        }

    }

    public static void main(String[] args) {
        new DrawRectangle();
    }

};
