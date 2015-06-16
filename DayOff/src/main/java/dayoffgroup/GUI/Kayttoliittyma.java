
package dayoffgroup.GUI;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Container;
import java.awt.Dimension;
/**
 *
 * @author hannamari
 */
public class Kayttoliittyma implements Runnable {
    
    JFrame frame;
    Piirtoalusta piirtoalusta;
    public static Dimension koko = new Dimension(700, 600); 
    
    public Kayttoliittyma() {
        
    }
    
    @Override
    public void run() {
        frame = new JFrame("DayOff Tower Defence!");
        frame.setPreferredSize(koko);
        
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
        
        piirtoalusta = new Piirtoalusta(this);
        container.add(piirtoalusta);
    }

}
