package amzevent.Domaine.Util;

/**
 *
 * @author hhaml
 */
public class Offre {
    private String m_nom;
    private float m_rabais;
    public Offre(String p_Nom, float p_Rabais){
         this.m_nom = p_Nom;
         this.m_rabais= p_Rabais;
    }
    /**
     * 
     * @return m_rabais 
     */
    public float getRabais(){
        return this.m_rabais;
    }

    /**
     *
     * @param p_Rabais
     */
    void setRabais(float p_Rabais){
       this.m_rabais= p_Rabais;
    }
    public String GetName(){
      return this.m_nom;
    }
    
}
