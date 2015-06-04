
package dayoffgroup.domain;

/**
 *
 * @author hannamari
 */
public class Opiskelija {
    private int elamaa;
    private Tili tili;
    
    /**
     * Parametritön konstruktori.
     * Opiskelijalla luotaessa uusi tili ja elämää 1000.
     */
    public Opiskelija() {
        this.elamaa = 1000;
        this.tili = new Tili();
    }

    public void tuhoudu() {
        // peli päättyy
    }
    
}
