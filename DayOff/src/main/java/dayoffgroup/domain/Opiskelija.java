
package dayoffgroup.domain;

import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author hannamari
 */
public class Opiskelija {
    private int elamaa;
    private int x;
    private int y;
    
    /**
     * Parametritön konstruktori.
     * Opiskelijalla luotaessa elämää 1000.
     */
    public Opiskelija() {
        this.elamaa = 1000;
        this.x = 400;
        this.y = 400;       
    }
    
    public void piirra(Graphics g){
        g.fillOval(0, 0, 30, 30);
        g.setColor(Color.orange);
    }

    public void tuhoudu() {
        // peli päättyy
    }
    
}
