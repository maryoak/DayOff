
package dayoffgroup.peli;

import dayoffgroup.GUI.Kentta;
import dayoffgroup.GUI.Rata;
import dayoffgroup.GUI.Sivupalkki;
import dayoffgroup.domain.Opiskelija;
import dayoffgroup.domain.Tili;
import java.io.File;
/**
 *Luokka luo uuden pelin.
 */
public class Peli {
    
    public Opiskelija opiskelija;
    private Tili tili;
    private Rata rata;
    public static Kentta kentta;
    public Sivupalkki kauppa;
    
    public Peli() {
        alusta();
    }
    
    public void alusta() {
        kentta = new Kentta();
        rata = new Rata();
        kauppa = new Sivupalkki();
        tili = new Tili();
        opiskelija = new Opiskelija();
        
        rata.lataaRata(new File("src/main/resources/radat/rata1.txt"));
    }
    
    public Tili getTili() {
        return this.tili;
    }
    
}
