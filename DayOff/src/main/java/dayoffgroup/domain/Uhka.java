
package dayoffgroup.domain;

public class Uhka implements Kuoleva {
    private int alkuX;
    private int alkuY;
    private Suunta suunta;
    private int elamaa;
    
    public Uhka(int x, int y, Suunta suunta) {
        this.alkuX = x;
        this.alkuY = y;
        this.suunta = suunta;
        this.elamaa = 0;
    }
    
    public void menetaElamaa() {
        this.elamaa--;
        if (this.elamaa == 0) {
            
        }
    }
    
    public void tuhoudu() {
        
    }
   
    public String toString() {
        return "(" + this.alkuX + ", " + this.alkuY + ")";
    }
}
