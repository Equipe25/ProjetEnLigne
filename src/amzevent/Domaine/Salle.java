package amzevent.Domaine;

import amzevent.Domaine.Util.Vector2F;
import java.util.List;

public class Salle
{
    private String nom;
    private Vector2F dimension;
    private Vector2F espaceVital;
    
    public Salle(String nom) {
        this.nom = nom;
        this.dimension = new Vector2F(960.0f, 680.0f);
        this.espaceVital = new Vector2F(1.0f, 1.0f);
    }
    
    public Salle(String nom, Vector2F dimension) {
        this.nom = nom;
        this.dimension = dimension;
        this.espaceVital = new Vector2F(1.0f, 1.0f);
    }
    
    public Salle(String nom, Vector2F dimension, Vector2F espaceVital) {
        this.nom = nom;
        this.dimension = dimension;
        this.espaceVital = espaceVital;
    }
    
    public Vector2F getDimension() {
        return dimension;
    }
    
    public void setDimension(Vector2F dimension) {
        this.dimension = dimension;
    }
    
    public Vector2F getEspaceVital() {
        return espaceVital;
    }
    
    public void setEspaceVital(Vector2F espaceVital) {
        this.espaceVital = espaceVital;
    } 
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
}
