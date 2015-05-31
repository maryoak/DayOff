
package dayoffgroup.domain;

public class Tentti extends Uhka {
    
    private int elamaa;
            
    public Tentti(int x, int y, Suunta suunta) {
        super(x, y, suunta);
        this.elamaa = 50;
    }
    
}
