
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
    Tili tili;

    /**
     *
     * @param x
     * @param y
     * @param suunta
     */
    public AikainenHeratys(int x, int y, Suunta suunta) {
        super(x, y, suunta);
        this.elamaa = 10;
        this.arvo = 10;
    }
    
    @Override
    public void piirra(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(this.x, this.y, 10, 10);
    }
    
    /**
     *
     * @param rahaa
     * @return
     */
    @Override
    public boolean ansaitseRahaa(int rahaa) {
        tili.setRahaa(this.arvo);
        return true;
    } 
    
    /**
     *
     * @return
     */
    @Override
    public boolean tuhoudu() {
        ansaitseRahaa(this.arvo);
        return true;
    }
    
}
