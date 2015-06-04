
package dayoffgroup.peli;

import dayoffgroup.domain.Opiskelija;
import dayoffgroup.domain.Tili;
import dayoffgroup.GUI.Piirtoalusta;
/**
 *
 * @author hannamari
 */
public class Peli {
    
    private Opiskelija opiskelija;
    private Tili tili;
    private int taso;
    
    public Peli() {
        this.opiskelija = new Opiskelija();
        this.tili = new Tili();
        this.taso = 1;   
    }
    
    public int getTaso() {
        return this.taso;
    }
    
    public boolean seuraavaTaso() {
        this.taso++;
            return true;
    }
    
}
