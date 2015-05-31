
package dayoffgroup.domain;

public class Torni {
    private int x;
    private int y;
    private Ammus ammus;
    
    public Torni(int x, int y, Ammus ammus) {
        this.x = x;
        this.y = y;
        this.ammus = ammus;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
}
