
package dayoffgroup.peli;

import dayoffgroup.GUI.Kayttoliittyma;
import javax.swing.SwingUtilities;

/**
 *
 * @author hannamari
 */
public class DayOff {
    
    /**
     * Main-metodi käynnistää käyttöliittymän.
     * @param args
     */
    public static void main(String[] args) {
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
        SwingUtilities.invokeLater(kayttoliittyma);
    }
}
