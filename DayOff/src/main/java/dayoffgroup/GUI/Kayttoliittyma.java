
package dayoffgroup.GUI;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Container;
import java.awt.Dimension;
import dayoffgroup.peli.Peli;
import dayoffgroup.GUI.Piirtoalusta;
/**
 *
 * @author hannamari
 */
public class Kayttoliittyma implements Runnable {
    
    JFrame frame;
    public int nakyma;
    Piirtoalusta piirtoalusta;
    
    public Kayttoliittyma() {
        
    }
    
    @Override
    public void run() {
        frame = new JFrame("DayOff Tower Defence!");
        frame.setPreferredSize(new Dimension(700, 600));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);          //Asettaa ikkunan keskelle
        frame.setVisible(true);
        
    }
    
    /**
     *
     * @param container
     */
    public void luoKomponentit(Container container) {
        
        Piirtoalusta piirtoalusta = new Piirtoalusta(this);
        container.add(piirtoalusta);
    }

}
