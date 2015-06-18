
package dayoffgroup.domain;

import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author hannamari
 */
public class Tentti extends Uhka {
    
    private int elamaa;
            
    /**
     *
     */
    public Tentti() {
        this.kentalla = false;
        this.elamaa = 50;
    }
    
    @Override
    public void piirra(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(this.x, this.y, 15, 15);
    }

    @Override
    public boolean lisaaTililleRahaa(int rahaa) {
        return true;
    }

    @Override
    public boolean tuhoudu() {
        return true;
    }
    
    public int getElamaa() {
        return this.elamaa;
    }
    
}
