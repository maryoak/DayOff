
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
<<<<<<< HEAD
            g.setColor(Color.GREEN);
            g.fillRect(x, y, width, height);
            g.setColor(Color.LIGHT_GRAY);
            g.drawRect(x, y, width, height);
=======
            g.setColor(Color.green);
            g.fillRect(x, y, width, height);
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
        } else if (this.maaID == 1){
            g.setColor(Color.orange);
            g.fillRect(x, y, width, height);
        }
        
        if (ilmaID != Arvo.ilmaIlma) {
            
        }
    }
}
