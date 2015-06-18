
package dayoffgroup.domain;

import dayoffgroup.GUI.Arvo;
import java.awt.Graphics;
import dayoffgroup.peli.Peli;
import java.awt.Rectangle;
/**
 *
 * @author hannamari
 */
public abstract class Uhka extends Rectangle {
    
    public int uhkaID = Arvo.uhkaIlma;
    public int koko = 32;
    public boolean kentalla;
    public int ylos = 0, alas = 1, oikealle = 2;
    public int suunta = oikealle;
    public int uhkaLiiku = 0;
    public int xC, yC;
    public boolean mennytAlas = false;
    public boolean mennytYlos = false;
    /**
     *
     */
    public Uhka() {
        this.kentalla = false;
    }
    
    public void luoUhka(int uhkaID) {
        for (int y = 0; y < Peli.kentta.ruutu.length; y++) {
            if (Peli.kentta.ruutu[y][0].maaID == Arvo.maaPolku) {
                setBounds(Peli.kentta.ruutu[y][0].x, Peli.kentta.ruutu[y][0].y, koko, koko);
                xC = 0;
                yC = 0;
            }
        }
        this.uhkaID = uhkaID;
        this.kentalla = true;
    }

    /**
     * Piirtää uhkan aliluokissa.
     * 
     * @param g 
     */
    public abstract void piirra(Graphics g);
    
    public int kavelyKehys = 0, kavelyNopeus = 10; 
    
    /**
     * Laittaa uhkan seuraamaan reittiä.
     */
    public void liiku() {
        if (kavelyKehys >= kavelyNopeus) {
            if (suunta == oikealle) {
                x += 1;
            } else if (suunta == ylos) {
                y -= 1;
            } else if (suunta == alas) {
                y += 1;
            }
            uhkaLiiku += 1;
            
            if (uhkaLiiku == Peli.kentta.ruudunKoko) {
                if (suunta == oikealle) {
                    xC += 1;
                } else if (suunta == ylos) {
                    yC -= 1;
                    mennytYlos = true;
                } else if (suunta == alas) {
                    yC += 1;
                    mennytAlas = true;
                }
                
                try {
                    if (Peli.kentta.ruutu[yC + 1][xC].maaID == Arvo.maaPolku) {
                       suunta = alas;
                    }   
                } catch (Exception e) {}
                
                if(!mennytAlas) {
                    try {
                        if (Peli.kentta.ruutu[yC - 1][xC].maaID == Arvo.maaPolku) {
                            suunta = ylos;
                        }   
                    } catch (Exception e) {}
                }
                
                if(!mennytYlos) {
                    try {
                        if (Peli.kentta.ruutu[yC][xC + 1].maaID == Arvo.maaPolku) {
                        suunta = ylos;
                        }   
                    } catch (Exception e) {}                
                }
                
                uhkaLiiku = 0;
            }
            kavelyKehys = 0;
        } else {
            kavelyKehys += 1;
        }
    }
    /**
     * Opiskelijan tilille siirretään rahaa Uhkan tuhoutuessa.
     * Aliluokat toteuttavat, koska rahamäärä vaihtelee uhkasta riippuen.
     * 
     * @param rahaa
     * @return
     */
    public abstract boolean lisaaTililleRahaa(int rahaa);
    
    /**
     * Lakkauttaa uhkan piirtämisen
     * 
     * @return
     */
    public abstract boolean tuhoudu();
   
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
