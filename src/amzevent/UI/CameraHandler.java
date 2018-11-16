package amzevent.UI;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import javafx.scene.input.KeyCode;


public class CameraHandler implements MouseWheelListener, KeyListener
{
    private static double scale = 1.0;
    private double zoomSpeed = 1.0;
    private double zoomFactor;
    
    private double cameraSpeed = 10.0;

    private Point drawingPanelPad = new Point(16, 67);

    private static AffineTransform affineTransform = new AffineTransform();

    private MainWindow mainWindow;

    public CameraHandler(MainWindow mainWindow)
    {
        zoomFactor = Math.pow(0.9, zoomSpeed);
        this.mainWindow = mainWindow;
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
                affineTransform.translate(0, cameraSpeed);
                break;
            case KeyEvent.VK_S:
                affineTransform.translate(0, -cameraSpeed);
                break;
            case KeyEvent.VK_A:
                affineTransform.translate(cameraSpeed, 0);
                break;
            case KeyEvent.VK_D:
                affineTransform.translate(-cameraSpeed, 0);
                break;
            default:
                break;
        }
        mainWindow.PlanSalleUpdated();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e)
    {
        if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL)
        {
            if(e.getX() < 0 || e.getX() > (mainWindow.getDrawingPanelWidth() + drawingPanelPad.x))
                return;

            scale *= Math.pow(zoomFactor, e.getWheelRotation());

            Point worldPoint = screenToWorldPosition(e.getPoint());
            affineTransform.setToIdentity();
            affineTransform.translate(e.getX() - worldPoint.x * scale - drawingPanelPad.x,
                                      e.getY() - worldPoint.y * scale - drawingPanelPad.y);
            affineTransform.scale(scale, scale);

            mainWindow.PlanSalleUpdated();
        }
    }

    private Point screenToWorldPosition(Point screenPoint)
    {
        int pointX = (int)((screenPoint.getX() - drawingPanelPad.x - affineTransform.getTranslateX()) / affineTransform.getScaleX());
        int pointY = (int)((screenPoint.getY() - drawingPanelPad.y - affineTransform.getTranslateY()) / affineTransform.getScaleY());
        return new Point(pointX, pointY);
    }

    private Point worldToScreenPosition(Point worldPoint)
    {
        int pointX = (int)(worldPoint.x * affineTransform.getScaleX() + drawingPanelPad.x + affineTransform.getTranslateX());
        int pointY = (int)(worldPoint.y * affineTransform.getScaleY() + drawingPanelPad.y + affineTransform.getTranslateY());
        return new Point(pointX, pointY);
    }

    public static AffineTransform getAffineTransform()
    {
        return affineTransform;
    }
}
