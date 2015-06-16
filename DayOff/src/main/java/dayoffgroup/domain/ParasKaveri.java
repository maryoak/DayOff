
package dayoffgroup.domain;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author hannamari
 */
public class ParasKaveri extends Torni {
    
    private Ammus ammus;
    private int hinta;
    
    public ParasKaveri(int id) {
        super(id);
        this.ammus = new Ammus(this);
        this.hinta = 50;
    }
    
    /**
     * Piirtää tornin.
     * 
     * @param g 
     */
    
    @Override
    public void piirra(Graphics g) {
        g.setColor(Color.ORANGE);
      //  g.fillOval(this.getX(), this.getY(), 25, 25);
    }
    
}
