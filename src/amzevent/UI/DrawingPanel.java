package amzevent.UI;

import amzevent.UI.MainWindow;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class DrawingPanel extends JPanel implements Serializable {
    
    private MainWindow mainWindow;
    
    public DrawingPanel() {
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        if (mainWindow != null){
            super.paintComponent(g); 
            AfficheurSalle mainDrawer = new AfficheurSalle(mainWindow.larmanController);
            mainDrawer.draw(g);
        }
    }
    
    public MainWindow getMainWindow() {
        return mainWindow;
    }
    
    public void setMainWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }
}
