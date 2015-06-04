
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
     * @param x
     * @param y
     * @param suunta
     */
    public Tentti(int x, int y, Suunta suunta) {
        super(x, y, suunta);
        this.elamaa = 50;
    }
    
    @Override
    public void piirra(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(this.x, this.y, 15, 15);
    }
    /**
     *
     * @param rahaa
     * @return
     */
    @Override
    public boolean ansaitseRahaa(int rahaa) {
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean tuhoudu() {
        return true;
    }
    
    public int getElamaa() {
        return this.elamaa;
    }
    
}
