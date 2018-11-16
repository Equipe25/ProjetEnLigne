/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzevent.Domaine;
import amzevent.Domaine.Util.Vector2F;
import amzevent.Domaine.Siege;
import amzevent.Domaine.Rangee;
import amzevent.Domaine.Section;
import java.util.ArrayList;
import java.util.List;


public class SectionAssise extends Section{
    private Float espaceVital;
    private Boolean DistributionAuto;
    private List<Rangee> rangee;

    public SectionAssise(String pnom, Vector2F pposition, Float porientation, Float pelevation, Boolean prectangulaire, Boolean passise) {
        super(pnom, pposition, porientation, pelevation, prectangulaire, passise);
        this.espaceVital = espaceVital;
        this.rangee = new ArrayList<>();
    }
    public Float getEspaceVital() {
        return espaceVital;
    }

    public void setEspaceVital(Float espaceVital) {
        this.espaceVital = espaceVital;
    }

    public Boolean getDistributionAuto() {
        return DistributionAuto;
    }
    public void setDistributionAuto(Boolean DistributionAuto) {
        this.DistributionAuto = DistributionAuto;
    }

    public List<Rangee> getRangee() {
        return rangee;
    }
    public void ajouterRangee(Rangee r){
            rangee.add(r);
    }
    public void supprimerRangee(Rangee r){
    
    }

    public void ajouterSiege(Rangee r,Siege s){
        r.ajouterSiege(s);
    }
    
    public void supprimerSiege(Rangee r,Siege s){
        r.supprimerSiege(s);
    }
    
    
}    

