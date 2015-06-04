
package dayoffgroup.GUI;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Container;
import java.awt.Dimension;
/**
 *
 * @author hannamari
 */
public class Kayttoliittyma implements Runnable, Paivitettava {
    
    JFrame frame;
    public int nakyma;
    
    /**
     *
     */
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
    
    /**
     *
     * @param container
     */
    public void luoKomponentit(Container container) {
        
        if (this.nakyma == 0) {
            Valikko valikko = new Valikko(this);
            valikko.lisaaValikko(container); 
        } else if (this.nakyma == 1) {
            //peli käynnistyy
            System.out.println("LOADING...");
        } else if (this.nakyma == 2) {
            Ohjeet ohjeet = new Ohjeet();
            ohjeet.naytaOhjeet(container);
        }

    }
    
    public void setNakyma(int i) {
        this.nakyma = i;
    }
   
    
    /**
     *
     */
    @Override
    public void paivita() {
        
    }
    
}
