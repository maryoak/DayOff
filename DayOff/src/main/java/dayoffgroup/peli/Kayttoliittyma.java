
package dayoffgroup.peli;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Container;
import java.awt.Dimension;


public class Kayttoliittyma implements Runnable {
    
    private JFrame frame;
    
    public Kayttoliittyma() {
        
    }
    
    @Override
    public void run() {
        frame = new JFrame("DayOff Tower Defence!");
        frame.setPreferredSize(new Dimension(700, 600));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setLocationRelativeTo(null);          //Asettaa ikkunan keskelle
        frame.setVisible(true);
    }
    
    public void luoKomponentit(Container container) {
        Valikko valikko = new Valikko();
        valikko.lisaaValikko(container);
    }
    
    
}
