
package dayoffgroup.GUI;

import java.awt.Graphics;

/** 
 * Luokka luo alustan pelille.
 * 
 * @author hannamari
 */
public class Kentta {
    
    public int leveys = 16;
    public int korkeus = 14;
    public int ruudunKoko = 30;
    
    public Ruutu[][] ruutu;
    
    public Kentta() {
        alusta();
    }
    
    public void alusta(){
        ruutu = new Ruutu[leveys][korkeus];
        for (int y = 0; y < ruutu.length; y++) {
            for ( int x = 0; x < ruutu[0].length; x++) {
               ruutu[y][x] = new Ruutu(x * ruudunKoko, y * ruudunKoko, ruudunKoko, 0);
            }
        }
    }
    
    public void piirra(Graphics g) {
        for (int y = 0; y < ruutu.length; y++) {
            for (int x = 0; x < ruutu[0].length; x++) {
                ruutu[y][x].piirraRuutu(g);
            }
        }
    }
    
        
        
}
