
package dayoffgroup.domain;

/**
 *
 * @author hannamari
 */
public class Torni {
    private int x;
    private int y;
    private Ammus ammus;
    
    /**
     *
     * @param x
     * @param y
     * @param ammus
     */
    public Torni(int x, int y, Ammus ammus) {
        this.x = x;
        this.y = y;
        this.ammus = ammus;
    }
    
    /**
     *
     * @return
     */
    public int getX() {
        return this.x;
    }
    
    /**
     *
     * @return
     */
    public int getY() {
        return this.y;
    }
}
