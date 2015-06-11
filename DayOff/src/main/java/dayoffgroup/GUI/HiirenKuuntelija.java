
package dayoffgroup.GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author hannamari
 */
public class HiirenKuuntelija implements MouseListener, MouseMotionListener {
    
    private Piirtoalusta piirtoalusta;
    boolean hiiriPainettu = false;
    public int hiiriTarttunut = 0;
    public int hiiriX = 0;
    public int hiiriY = 0;
    
    public HiirenKuuntelija(Piirtoalusta piirtoalusta) {
        this.piirtoalusta = piirtoalusta;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        hiiriX = e.getXOnScreen();
        hiiriY = e.getYOnScreen();
    }
    
}
