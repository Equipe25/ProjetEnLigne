package amzevent.Domaine;
import amzevent.Domaine.Util.Vector2F;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
        
public abstract class Section {
    protected String nom;
    protected Vector2F position;
    protected Float orientation;
    protected Float elevation;
    protected Boolean rectangulaire;
    protected Boolean assise;
    protected Map<Integer,Vector2F> points;
    protected Vector2F defaultSize = new Vector2F(100.0f, 100.0f);

    public Section(String pnom,Vector2F pposition, Float porientation,Float pelevation,Boolean prectangulaire, Boolean passise){    
        this.nom = pnom;
        this.position = pposition;
        this.orientation = porientation;
        this.elevation = pelevation;
        this.rectangulaire = prectangulaire;
        this.assise =passise;
        this.points = new HashMap<Integer,Vector2F>();
            this.points.put(0,new Vector2F(pposition.x, pposition.y));
            this.points.put(1,new Vector2F(pposition.x + defaultSize.x, pposition.y));
            this.points.put(2,new Vector2F(pposition.x + defaultSize.x, pposition.y + defaultSize.y));
            this.points.put(3,new Vector2F(pposition.x, pposition.y + defaultSize.y));
    }

    public Boolean EstRectangulaire() {
        return rectangulaire;
    }
    public Boolean EstAssise() {
        return assise;
    }
        
    //getter and setter
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Vector2F getPosition() {
        return position;
    }
    public void setPosition(Vector2F position) {
        this.position = position;
    }
    public Vector2F getCenter() {
        if(rectangulaire)
        {
            return new Vector2F((points.get(0).x + points.get(1).x) / 2.0f,
                                (points.get(0).y + points.get(2).y) / 2.0f);
        }
        else
        {
            System.out.println("a implementer");
            return new Vector2F(0.0f, 0.0f);
        }
    }
    
    public Float getOrientation() {
        return orientation;
    }
    public void setOrientation(Float orientation) {
        this.orientation = orientation;
    }
    public Float getElevation() {
        return elevation;
    }
    public void setElevation(Float elevation) {
        this.elevation = elevation;
    }
    public Map<Integer,Vector2F> getPoints() {
        return points;
    }
    public void setPoints(Map<Integer,Vector2F> points) {
        this.points = points;
    }
    
    public void ajouterPoint(int index,Vector2F position){
        this.points.put(index, position);
    }
    public void supprimerPoint(int index){
        this.points.remove(index);
    }
    public void modifierPoint(Integer index,Vector2F position){
        this.points.remove(index);
        this.points.put(index,position);
    }
}
