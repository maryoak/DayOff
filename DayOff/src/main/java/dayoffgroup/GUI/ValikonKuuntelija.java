
package dayoffgroup.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;

/**
 * Kuuntelee aloitusvalikon ennaltamäärättyjä painikkeita.
 */
public class ValikonKuuntelija implements ActionListener {
    
    private String painikkeenNimi;
    Piirtoalusta pa;
    
    /**
     * Konstruktori
     * 
     * @param painikkeenNimi
     * @param pa
     */
    public ValikonKuuntelija(String painikkeenNimi, Piirtoalusta pa) {
        this.painikkeenNimi = painikkeenNimi;
        this.pa = pa;
    }
    
    /**
     * Metodi määrää, mitä painikkeet tekevät.
     * 
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (this.painikkeenNimi.equals("Uusi peli")) {
            System.out.println("Pelin pitäisi käynnistyä");
            pa.setNakyma(1);
        }else if (this.painikkeenNimi.equals("Ohjeet")) {
            System.out.println("Ohjeiden pitäisi tulla");
            pa.setNakyma(2);
        }else if (this.painikkeenNimi.equals("Poistu")) {
            System.exit(0);
        }
    }
    
    public String getPainikkeenNimi() {
        return this.painikkeenNimi;
    }
}
