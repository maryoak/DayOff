
package dayoffgroup.GUI;

import java.io.File;
import java.util.Scanner;
import dayoffgroup.peli.Peli;

/**
 * Luokka lukee ja sijoittaa annetusta tiedostosta id-tunnukset ruuduille.
 */
public class Rata {
    
    public void lataaRata(File file) {
        try {
            Scanner lukija = new Scanner(file);
            
            while(lukija.hasNext()) {
                for (int y = 0; y < Peli.kentta.ruutu.length; y++) {
                    for (int x = 0; x < Peli.kentta.ruutu[0].length; x++) {
                        Peli.kentta.ruutu[y][x].maaID = lukija.nextInt();
                    }                
                }
                
                for (int y = 0; y < Peli.kentta.ruutu.length; y++) {
                    for (int x = 0; x < Peli.kentta.ruutu[0].length; x++) {
                        Peli.kentta.ruutu[y][x].ilmaID = lukija.nextInt();
                    }                
                }                
            }
            
            lukija.close();
        } catch(Exception e) {
            System.out.println("Tiedostoa ei löytynyt tai se on väärän mallinen");
        }
    }
}
