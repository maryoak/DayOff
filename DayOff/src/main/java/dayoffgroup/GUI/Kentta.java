
package dayoffgroup.GUI;

import java.awt.Graphics;

/** 
 * Luokka luo alustan pelille.
 *
 */
public class Kentta {
    
<<<<<<< HEAD
    public int leveys = 17;
    public int korkeus = 15;
    public int ruudunKoko = 32;
=======
    public int leveys = 15;
    public int korkeus = 12;
    public int ruudunKoko = 40;
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
    
    public Ruutu[][] ruutu;
    
    public Kentta() {
        alusta();
    }
    
    public void alusta(){
        ruutu = new Ruutu[korkeus][leveys];
        for (int y = 0; y < ruutu.length; y++) {
            for ( int x = 0; x < ruutu[0].length; x++) {
               ruutu[y][x] = new Ruutu(x * ruudunKoko, y * ruudunKoko, ruudunKoko, ruudunKoko, Arvo.maaRuoho, Arvo.ilmaIlma);
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
