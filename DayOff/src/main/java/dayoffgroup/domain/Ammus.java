
package dayoffgroup.domain;

public class Ammus {
    
    private int x;
    private int y;
    private Torni torni;
    private Suunta suunta;
    
    public Ammus(Torni torni) {
        this.x = torni.getX();
        this.y = torni.getY();
    }
}
