
package dayoffgroup.domain;

import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author hannamari
 */
public class AikainenHeratys extends Uhka {
    
    private int elamaa;
    private int arvo;

    /**
     * Konstruktori
     * x ja y ilmaitsevat uhkan sijainnin
     * @param x
     * @param y
     */
    public AikainenHeratys(int x, int y) {
        super(x, y);
        this.elamaa = 10;
        this.arvo = 10;
    }
    
    @Override
    public void piirra(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(this.x, this.y, 10, 10);
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
