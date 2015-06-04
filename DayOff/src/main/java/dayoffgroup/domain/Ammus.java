
package dayoffgroup.domain;

/**
 *
 * @author hannamari
 */
public class Ammus {
    
    private int x;
    private int y;
    private Torni torni;
    private Suunta suunta;
    
    /**
     *
     * @param torni
     */
    public Ammus(Torni torni) {
        this.x = torni.getX();
        this.y = torni.getY();
    }
}
