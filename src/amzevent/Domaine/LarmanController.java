package amzevent.Domaine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.List;
import amzevent.Domaine.Salle;
import amzevent.Domaine.Scene;
import amzevent.Domaine.Section;
import amzevent.Domaine.SectionAssise;
import amzevent.Domaine.Util.Vector2F;
import java.util.ArrayList;
import javax.swing.ListModel;


/// test commite

public class LarmanController {
    private Salle salle;
    private Scene scene;
    private List<SectionAssise> ListeSectionAssise;
    
    public LarmanController() {
        this.salle = new Salle("Salle 1");
        Vector2F sceneDimension = new Vector2F(125.0f, 125.0f);
        this.scene = new Scene(sceneDimension,
                               new Vector2F((salle.getDimension().x - sceneDimension.x) / 2.0f, (salle.getDimension().y - sceneDimension.y) / 2.0f));
        this.ListeSectionAssise = new ArrayList<SectionAssise>();
        this.ListeSectionAssise.add(new SectionAssise ("Section1",new Vector2F(25.0f,50.0f) ,0.0f,0.0f, true, true));
        this.ListeSectionAssise.add(new SectionAssise ("Section2",new Vector2F(150.0f,50.0f) ,0.0f,0.0f, true, true));
    }
    
    public Vector2F getSalleDimension() {
        return salle.getDimension();
    }
    
    public void setSalleDimension(float largeur, float profondeur) {
        salle.setDimension(new Vector2F(largeur, profondeur));
    }
    
    public Vector2F getSalleEspaceVital() {
        return salle.getEspaceVital();
    }
    
    public void setSalleEspaceVital(float largeur, float profondeur) {
        salle.setEspaceVital(new Vector2F(largeur, profondeur));
    }
    
    public String getSalleNom() {
        return salle.getNom();
    }
    
    public void setSalleNom(String nom) {
        salle.setNom(nom);
    }
    
    public Vector2F getSceneDimension() {
        return scene.getDimension();
    }
    
    public void setSceneDimension(float largeur, float profondeur) {
        scene.setDimension(new Vector2F(largeur, profondeur));
    }
    
    public Vector2F getScenePosition() {
        return scene.getPosition();
    }
    
    public Vector2F getSceneCenter() {
        return scene.getCenter();
    }
    
    public void setScenePosition(float x, float y) {
        scene.setPosition(new Vector2F(x, y));
    }
    
    public float getSceneOrientation() {
        return scene.getOrientation();
    }
    
    public void setSceneOrientation(float orientation) {
        scene.setOrientation(orientation);
    }

    public List<SectionAssise> getListeSectionAssise() {
        return ListeSectionAssise;
    }

    public void AddSectionAssise(SectionAssise sectionA) {
        this.ListeSectionAssise.add(sectionA);
    }
    public String[] GetNomsSectionAssise(){
        int nbSection = this.ListeSectionAssise.size();
        String[] retour = new String[nbSection];
        for(int x = 0 ; x< nbSection ;x++ ){
            retour[x] = this.ListeSectionAssise.get(x).getNom();
        }
        return retour;                 
    }
}

