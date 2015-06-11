
package dayoffgroup.GUI;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author hannamari
 */
public class Ruutu extends Rectangle {
    
    private int id;
    private int x;
    private int y;
    private int leveys = 30;
    private int korkeus = 30;
    
    
    public Ruutu(int x, int y, int sivunPituus, int id) {
        setBounds(x, y, sivunPituus, sivunPituus);
        this.id = id;
    }
    
    public void piirraRuutu(Graphics g){
        g.drawRect(x, y, leveys, korkeus);
    }
}
