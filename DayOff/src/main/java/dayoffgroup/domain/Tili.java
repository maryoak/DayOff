
package dayoffgroup.domain;

/**
 *
 * @author hannamari
 */
public class Tili {
    
    private int rahat;
    
    /**
     * Parametritön konstruktori.
     * Tilillä luotaessa 100 rahaa. 
     */
    public Tili() {
        this.rahat = 100;
    }
    
    public int getRahat() {
        return this.rahat;
    }
    
    public void setRahaa(int rahaa) {
        this.rahat += rahaa;
    }
}
