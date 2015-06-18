
package dayoffgroup.peli;

import dayoffgroup.GUI.Kentta;
import dayoffgroup.GUI.Rata;
import dayoffgroup.GUI.Sivupalkki;
import dayoffgroup.domain.Opiskelija;
import dayoffgroup.domain.Tili;
import dayoffgroup.domain.Uhka;
import dayoffgroup.domain.AikainenHeratys;
import java.io.File;
/**
 *Luokka luo uuden pelin.
 */
public class Peli {
    
    public static Opiskelija opiskelija;
    public static Tili tili;
    public static Rata rata;
    public static Kentta kentta;
    public Sivupalkki sivupalkki;
    public static Uhka[] uhkat = new Uhka[30];
    
    public Peli() {
        alusta();
    }
    
    public void alusta() {
        kentta = new Kentta();
        rata = new Rata(new File("src/main/resources/radat/rata1.txt"));
        tili = new Tili();
        rata.lataaRata();
        opiskelija = new Opiskelija();
        sivupalkki = new Sivupalkki();
        
        for (int i = 1; i < uhkat.length; i++) {
            uhkat[i] = new AikainenHeratys();
            uhkat[i].luoUhka(0);
        }
    }
    
    public Tili getTili() {
        return this.tili;
    }
    
}
