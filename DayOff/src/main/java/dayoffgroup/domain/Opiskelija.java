
package dayoffgroup.domain;

import dayoffgroup.peli.Peli;
import java.awt.Graphics;
import java.awt.Color;

/**
 * Luokka piirtää ja hallinnoi pelin Opiskelija hahmoa.
 */
public class Opiskelija {
    public static int elamaa;
    private int x;
    private int y;
    
    /**
     * Konstruktori määrittelee Opiskelian sijainnin kentällä.
     * X-arvo on aina sama suhteessa kentän pituuteen.
     * Y-arvo annetaan parametrina (saa luokan Rata metodilla getLoppu()).
     * Opiskelijalla luotaessa elämää 1000.
     * @param y
     */
    public Opiskelija() {
        this.elamaa = 1000;
        this.x = ((Peli.kentta.leveys - 1) * 32);
        this.y = (Peli.rata.getLoppu() * 32); 
    }
    
    public int getElamaa() {
        return this.elamaa;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    /**
     * Opiskelija piirtää itsensä.
     * @param g 
     */
    
    public void piirra(Graphics g){
        g.setColor(Color.red);
        g.fillOval(this.x, this.y, 30, 30);
        g.setColor(Color.orange);
    }
    
    /**
     * Metodi päättää pelin.
     */
    public void tuhoudu() {
      
    }
    
}
