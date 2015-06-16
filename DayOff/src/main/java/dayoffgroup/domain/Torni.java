
package dayoffgroup.domain;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hannamari
 */
public abstract class Torni {
    
    private int id;
    public static final Torni[] tornit = new Torni[50];
    
    /**
     * Konstruktorin parametrina on jokaiselle tornille yksilöllinen id.
     * 
     * @param id
     */
    public Torni(int id) {
        if(tornit[id] != null){
            System.out.println("Kaksi tornia samalla id:llä: " + id);
        } else {
            this.id = id;
            tornit[id] = this;
        }
    }
    
    public abstract void piirra(Graphics g);
    
}
