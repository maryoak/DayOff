
package dayoffgroup.domain;

import java.awt.Graphics;

/**
 *
 * @author hannamari
 */
public abstract class Torni {
    private int x;
    private int y;
    
    /**
     * Parametritön konstruktori.
     * 
     */
    public Torni() {
        this.x = 0;
        this.y = 0;
    }
    
    public abstract void piirra(Graphics g);

    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setX(int x) {
        this.x = x; 
    }
    
    public void setY(int y) {
        this.y = y; 
    }    
}
