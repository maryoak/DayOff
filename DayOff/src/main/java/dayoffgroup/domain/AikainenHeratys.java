
package dayoffgroup.domain;

import java.awt.Graphics;
import java.awt.Color;

/**
 * Luokka on yksi Uhkan ilmentymistä.
 * @author hannamari
 */
public class AikainenHeratys extends Uhka {
    
    private int elamaa;
    private int arvo;

    /**
     * Konstruktori.
     * x ja y ilmaitsevat uhkan sijainnin
     */
    public AikainenHeratys() {
        this.kentalla = false;
        this.elamaa = 10;
        this.arvo = 10;
    }
    
    @Override
    public void piirra(Graphics g) {
            g.setColor(Color.black);
            g.fillOval(this.x, this.y, 20, 20);
    }
    
    @Override
    public boolean lisaaTililleRahaa(int rahaa) {
        
        return true;
    } 
    
    @Override
    public boolean tuhoudu() {
        lisaaTililleRahaa(this.arvo);
        return true;
    }
    
}
