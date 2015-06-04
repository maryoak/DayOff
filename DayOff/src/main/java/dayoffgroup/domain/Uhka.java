
package dayoffgroup.domain;

import java.awt.Graphics;
/**
 *
 * @author hannamari
 */
public abstract class Uhka implements Liikkuva {
    protected int x;
    protected int y; 
    /**
     *
     * @param x
     * @param y
     */
    public Uhka(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    /**
     * Siirtää uhkaa halutuun suuntaan
     * 
     * @param xmuutos
     * @param ymuutos
     */
    public void liiku(int xmuutos, int ymuutos) {
        this.x += xmuutos;
        this.y += ymuutos;
    }
    
    public void seuraaReittia() {
       
    }
    
    /**
     * Piirtää uhkan.
     * 
     * @param g 
     */
    public abstract void piirra(Graphics g);
    
    /**
     * Opiskelijan tilille siirretään rahaa Uhkan tuhoutuessa.
     * Aliluokat toteuttavat, koska rahamäärä vaihtelee.
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
