package amzevent.UI;

import amzevent.Domaine.LarmanController;
import amzevent.Domaine.SectionAssise;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;

import amzevent.Domaine.Util.Vector2F;
import java.awt.geom.Point2D;

public class AfficheurSalle {
	
    private LarmanController larmanController;
    
    private Color contourColor = Color.BLACK;
    private Color sceneColor = new Color(100, 100, 100);
    private Color sectionColor = new Color(120, 213, 251);
    private Color selectionColor = Color.RED;
    
    private String sceneName = "scene";
    private String selection = "Section2";
    
    private AffineTransform affineTransform;

    public AfficheurSalle(LarmanController larmanController) {
        this.larmanController = larmanController;
    }

    public void draw(Graphics g) {
        affineTransform = CameraHandler.getAffineTransform();
        Graphics2D g2d = (Graphics2D) g;
        drawSalle(g2d);
        drawScene(g2d);
        drawSections(g2d);
    }

    private void drawSalle(Graphics2D g2d) {
        int width = (int)larmanController.getSalleDimension().x;
        int height = (int)larmanController.getSalleDimension().y;
        g2d.setColor(contourColor);
        Rectangle rect = new Rectangle(0, 0, width, height);
        g2d.draw(affineTransform.createTransformedShape(rect));
    }
    
    private void drawScene(Graphics2D g2d) {
        int width = (int)larmanController.getSceneDimension().x;
        int height = (int)larmanController.getSceneDimension().y;
        Rectangle rect = new Rectangle((int)larmanController.getScenePosition().x, (int)larmanController.getScenePosition().y, width, height);
        
        double rotation = Math.toRadians(larmanController.getSceneOrientation());
        Vector2F center = larmanController.getSceneCenter();
        g2d.rotate(rotation, (int)center.x, (int)center.y);
        
        g2d.setColor(sceneColor);
        g2d.fill(affineTransform.createTransformedShape(rect));
        g2d.setColor(getContourColor(sceneName));
        g2d.draw(affineTransform.createTransformedShape(rect));
        
        g2d.rotate(-1.0 * rotation, (int)center.x, (int)center.y);
    }
    
    private void drawSections(Graphics2D g2d) {
        List<SectionAssise> listeSection = larmanController.getListeSectionAssise();
        for(int x =0; x < listeSection.size();x++){
            int nbPoints = listeSection.get(x).getPoints().size();
            Polygon sect = new Polygon();
            for (Integer y=0; y< nbPoints;y++){
                float xx = listeSection.get(x).getPoints().get(y).x;
                float yy = listeSection.get(x).getPoints().get(y).y;
                sect.addPoint((int)xx,(int)yy);
            }
            
            double rotation = Math.toRadians(listeSection.get(x).getOrientation());
            Vector2F center = listeSection.get(x).getCenter();
            g2d.rotate(rotation, (int)center.x, (int)center.y);

            g2d.setColor(sectionColor);
            g2d.fill(affineTransform.createTransformedShape(sect));
            g2d.setColor(getContourColor(listeSection.get(x).getNom()));
            g2d.draw(affineTransform.createTransformedShape(sect));
            
            g2d.rotate(-1.0 * rotation, (int)center.x, (int)center.y);
        }
    }
    
    private Color getContourColor(String name)
    {
        if(selection == name)
        {
            return selectionColor;
        }
        else
        {
            return contourColor;
        }
    }
    
    private void drawRect(Graphics g){
            Graphics2D g2d = (Graphics2D)g;
            Rectangle rect = new Rectangle((int)larmanController.getScenePosition().x, (int)larmanController.getScenePosition().y, 15, 200);
        
            g2d.draw(rect);
            g2d.fill(rect);
        
            g2d.setColor(Color.GREEN);
        
            g2d.draw(rect);

    }
}
