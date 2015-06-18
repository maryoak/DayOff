
package dayoffgroup.GUI;

import java.io.File;
import java.util.Scanner;
import dayoffgroup.peli.Peli;

/**
 * Luokka käsittelee rata-alueen määrittelevää tiedostoa.
 */
public class Rata {
    
    private File file;
    private Scanner lukija;
    
    public Rata(File file) {
        this.file = file;
    }
    /**
    * Metodi lukee ja sijoittaa annetusta tiedostosta id-tunnukset ruuduille.
    */
    public void lataaRata() {
        try {
            lukija = new Scanner(this.file);
            System.out.println("rata ladattu: " + this.file);
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
    /**
     * Metodi palauttaa reitin viimeisen ruudun y-arvon.
     * Viimeisen ruudun x-arvo on aina sama kuin Kentän muuttuja leveys.
     * @return loppuY
     */
    public int getLoppu() {
        
        int loppuY = 0;
        int loppuYLkm = 1;
        try {
            lukija = new Scanner(this.file);
            System.out.println("getlopppu: " + this.file);
            
            while (lukija.hasNext()) {
                int i = 0;
                for (int y = 0; y < Peli.kentta.ruutu.length; y++) {
                        for (int x = 0; x < Peli.kentta.ruutu[0].length; x++) {
                            i = lukija.nextInt();
                            if (i == 1 && x == (Peli.kentta.ruutu[0].length - 1)) {
                                loppuY = y;
                                loppuYLkm++;                            
                            }
                    }    
                }
        
                if (loppuYLkm > 2) {
                    System.out.println("Radalla useampi loppu");
                } else if (loppuYLkm == 1) {
                    System.out.println("Rata ei pääty oikeaan laitaan");
                }
            }    
            
            } catch (Exception e) {
                System.out.println("Ratatiedostoa ei ole tai se on väärän mallinen");
        }

        return loppuY;
    }    
}
