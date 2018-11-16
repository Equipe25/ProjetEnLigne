package amzevent.Domaine;
import amzevent.Domaine.Util.Offre;
import amzevent.Domaine.Util.TypeAttributionPrixAutomatique;
import java.util.ArrayList;
import java.util.List;
public class Evenement {
    private int m_nbSpectateur ;
    private float m_revenuTotal;
    private float m_prixMin;
    private float m_prixMax;
    private Salle m_salle;
    private List<Offre> m_offres;
    private TypeAttributionPrixAutomatique m_typeAttributionPrix;
    
    
   public Evenement(Salle p_salle){
       this.m_salle= p_salle;
       this.m_offres = new ArrayList<Offre>();
       
   }
   public int getNbSpectateurs(){
     return this.m_nbSpectateur;
   }
    public void setNbSpectateurs(int p_nbSpectateurs){
       this.m_nbSpectateur = p_nbSpectateurs;
   }
   public float getRevenueTotal(){
     return this.m_revenuTotal;
   }
  
   public void setRevenueTotal(float p_RevenueTotal){
    this.m_revenuTotal = p_RevenueTotal;
   }
   public float getPrixMaxSiege(){
     return this.m_prixMax;
   }
   public void setPrixMaxSiege(float p_prixMax){
     this.m_prixMax = p_prixMax;
   }
   public float getPrixMinSiege(){
     return this.m_prixMin;
   }
   public void setPrixMinSiege(float p_prixMinSiege){
     this.m_prixMin = p_prixMinSiege;
   }
   public TypeAttributionPrixAutomatique getTypeAttributionPrix(){
      return this.m_typeAttributionPrix; 
   }
   public void setAttributionPrix(TypeAttributionPrixAutomatique p_TypeAttribution){
     this.m_typeAttributionPrix = p_TypeAttribution;
   }
   public List<Offre> getOffres(){
     return this.m_offres;
   }
   public void ajouterOffre(Offre p_offre){
      this.m_offres.add(p_offre);
   }
   public void supprimerOffre(String p_nom){
      for (Offre offre : this.m_offres) {
    if (offre.GetName() == p_nom) {
       this.m_offres.remove(offre);
    }
 }   
   }
}
