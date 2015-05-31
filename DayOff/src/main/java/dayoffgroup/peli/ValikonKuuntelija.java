
package dayoffgroup.peli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ValikonKuuntelija implements ActionListener {
    
    private String painikkeenNimi;
    
    public ValikonKuuntelija(String painikkeenNimi) {
        this.painikkeenNimi = painikkeenNimi;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (this.painikkeenNimi.equals("Pelaa")) {
            System.out.println("Pelin pitäisi käynnistyä");
        }else if (this.painikkeenNimi.equals("Ohjeet")) {
            System.out.println("Ohjeiden pitäisi tulla");
        }else if (this.painikkeenNimi.equals("Poistu")) {
            System.exit(0);
        }
    }
    
    public String getPainikkeenNimi() {
        return this.painikkeenNimi;
    }
}
