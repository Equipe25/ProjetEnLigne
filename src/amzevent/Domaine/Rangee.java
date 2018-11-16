package amzevent.Domaine;

import amzevent.Domaine.Siege;
import amzevent.Domaine.Util.Vector2F;
import java.util.List;
import java.util.ArrayList;

public class Rangee {
    private int no;
    private Vector2F position;
    private List<Siege> siege;

    public Rangee(int no, Vector2F position, List<Siege> siege) {
        this.no = no;
        this.position = position;
        this.siege = siege;
    }

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public Vector2F getPosition() {
        return position;
    }
    public void setPosition(Vector2F position) {
        this.position = position;
    }
    public List<Siege> getSiege() {
        return siege;
    }
    public  void ajouterSiege(Siege s){
        siege.add(s);
    }      
    public void supprimerSiege(Siege s){
    
    }    
}
