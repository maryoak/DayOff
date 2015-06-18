
package dayoffgroup.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * Luokka määrittelee ruudun joista kenttä rakentuu.
 */
public class Ruutu extends Rectangle {
    
    public int maaID;
    public int ilmaID;
    
    
    public Ruutu(int x, int y, int leveys, int korkeus, int maaID, int ilmaID) {
        setBounds(x, y, leveys, korkeus);
        this.maaID = maaID;
        this.ilmaID = ilmaID;
    }
    
    public void piirraRuutu(Graphics g){
        
        if (this.maaID == 0) {
            g.setColor(Color.GREEN);
            g.fillRect(x, y, width, height);
            g.setColor(Color.LIGHT_GRAY);
            g.drawRect(x, y, width, height);
        } else if (this.maaID == 1){
            g.setColor(Color.orange);
            g.fillRect(x, y, width, height);
        }
        
        if (ilmaID != Arvo.ilmaIlma) {
            
        }
    }
}
