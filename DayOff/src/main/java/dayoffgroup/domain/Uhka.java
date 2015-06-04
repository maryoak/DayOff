
package dayoffgroup.domain;

import java.awt.Graphics;
/**
 *
 * @author hannamari
 */
public abstract class Uhka implements Liikkuva {
    protected int x;
    protected int y;
    private Suunta suunta;
  
    
    /**
     *
     * @param x
     * @param y
     * @param suunta
     */
    public Uhka(int x, int y, Suunta suunta) {
        this.x = x;
        this.y = y;
        this.suunta = suunta;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    /**
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
    
    public abstract void piirra(Graphics g);
    
    /**
     *
     * @param rahaa
     * @return
     */
    public abstract boolean ansaitseRahaa(int rahaa);
    
    /**
     *
     * @return
     */
    public abstract boolean tuhoudu();   //lopettaa piirron
   
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
