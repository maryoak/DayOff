
package dayoffgroup.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hannamari
 */
public class ValikonKuuntelija implements ActionListener {
    
    private String painikkeenNimi;
    private Kayttoliittyma kali;
    
    /**
     * 
     * 
     * @param painikkeenNimi
     */
    public ValikonKuuntelija(String painikkeenNimi, Kayttoliittyma kali) {
        this.painikkeenNimi = painikkeenNimi;
        this.kali = kali;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (this.painikkeenNimi.equals("Pelaa")) {
            System.out.println("Pelin pitäisi käynnistyä");
            kali.setNakyma(1);
            kali.luoKomponentit(null);
        }else if (this.painikkeenNimi.equals("Ohjeet")) {
            System.out.println("Ohjeiden pitäisi tulla");
            kali.setNakyma(2);
            kali.luoKomponentit(null);
        }else if (this.painikkeenNimi.equals("Poistu")) {
            System.exit(0);
        }
    }
    
    /**
     *
     * @return
     */
    public String getPainikkeenNimi() {
        return this.painikkeenNimi;
    }
}
