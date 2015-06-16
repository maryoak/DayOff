
package dayoffgroup.domain;

import java.awt.Graphics;
import java.awt.Color;

/**
 * Luokka piirtää ja hallinnoi pelin Opiskelija hahmoa.
 */
public class Opiskelija {
    public int elamaa;
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
    
    public int getElamaa() {
        return this.elamaa;
    }
    
    /**
     * Opiskelija piirtää itsensä.
     * 
     * @param g 
     */
    
    public void piirra(Graphics g){
        g.fillOval(0, 0, 30, 30);
        g.setColor(Color.orange);
    }
    
    /**
     * Metodi päättää pelin.
     */
    public void tuhoudu() {
      
    }
    
}
