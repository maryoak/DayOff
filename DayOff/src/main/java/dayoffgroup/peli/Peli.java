
package dayoffgroup.peli;

import dayoffgroup.GUI.Kentta;
import dayoffgroup.GUI.Rata;
import dayoffgroup.GUI.Sivupalkki;
import dayoffgroup.domain.Opiskelija;
import dayoffgroup.domain.Tili;
<<<<<<< HEAD
import dayoffgroup.domain.Uhka;
import dayoffgroup.domain.AikainenHeratys;
=======
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
import java.io.File;
/**
 *Luokka luo uuden pelin.
 */
public class Peli {
    
<<<<<<< HEAD
    public static Opiskelija opiskelija;
    public static Tili tili;
    public static Rata rata;
    public static Kentta kentta;
    public Sivupalkki sivupalkki;
    public static Uhka[] uhkat = new Uhka[30];
=======
    public Opiskelija opiskelija;
    private Tili tili;
    private Rata rata;
    public static Kentta kentta;
    public Sivupalkki kauppa;
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
    
    public Peli() {
        alusta();
    }
    
    public void alusta() {
        kentta = new Kentta();
<<<<<<< HEAD
        rata = new Rata(new File("src/main/resources/radat/rata1.txt"));
        tili = new Tili();
        rata.lataaRata();
        opiskelija = new Opiskelija();
        sivupalkki = new Sivupalkki();
        
        for (int i = 1; i < uhkat.length; i++) {
            uhkat[i] = new AikainenHeratys();
            uhkat[i].luoUhka(0);
        }
=======
        rata = new Rata();
        kauppa = new Sivupalkki();
        tili = new Tili();
        opiskelija = new Opiskelija();
        
        rata.lataaRata(new File("src/main/resources/radat/rata1.txt"));
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
    }
    
    public Tili getTili() {
        return this.tili;
    }
    
}
