
package dayoffgroup.GUI;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author hannamari
 */
public class HiirenKuuntelija implements MouseListener, MouseMotionListener {
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
<<<<<<< HEAD
        Piirtoalusta.hiiri = new Point((e.getX()) - ((Kayttoliittyma.koko.width - 
                Piirtoalusta.leveys) / 2), (e.getY()) - ((Kayttoliittyma.koko.height) - 
=======
        Piirtoalusta.hiiri = new Point((e.getX()) + ((Kayttoliittyma.koko.width - 
                Piirtoalusta.leveys) / 2), (e.getY()) + ((Kayttoliittyma.koko.height) - 
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
                        (Piirtoalusta.korkeus)) - (Kayttoliittyma.koko.width - Piirtoalusta.leveys) /2);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
<<<<<<< HEAD
        Piirtoalusta.hiiri = new Point((e.getX()) - ((Kayttoliittyma.koko.width - 
                Piirtoalusta.leveys) / 2), (e.getY()) - ((Kayttoliittyma.koko.height) - 
=======
        Piirtoalusta.hiiri = new Point((e.getX()) + ((Kayttoliittyma.koko.width - 
                Piirtoalusta.leveys) / 2), (e.getY()) + ((Kayttoliittyma.koko.height) - 
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
                        (Piirtoalusta.korkeus)) - (Kayttoliittyma.koko.width - Piirtoalusta.leveys) /2);    
    }
    
}
