
package dayoffgroup.GUI;

import dayoffgroup.peli.Peli;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JButton;


/**
 * @author hannamari
 */
public class Sivupalkki {
    
    public static int korkeus = 5;
    public static int painikkeenKoko = 40;
    public static int vali = 2;
    
    public Rectangle[] painike = new Rectangle[korkeus];
    
    public Sivupalkki() {
        alusta();
    }
    
    public void alusta() {
        for (int i = 0; i < korkeus; i++) {
            painike[i] = new Rectangle((Piirtoalusta.leveys - 70), (300 - (i * 50)), painikkeenKoko, painikkeenKoko);
            
            System.out.println("painike" + i);
        }
    }
    
    public void piirra(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("MASSIT: " + Peli.tili.getRahat(), (Piirtoalusta.leveys - 100), 30);
        g.drawString("LAIFFII: " + Peli.opiskelija.getElamaa(), (Piirtoalusta.leveys -100), 60);
        
        for (int i = 0; i < painike.length; i++) {
                    
            if (painike[i].contains(Piirtoalusta.hiiri)) {
                g.setColor(Color.orange);
                g.drawRect(painike[i].x, painike[i].y, painike[i].width, painike[i].height);
            }
            g.setColor(Color.black);
            g.drawRect(painike[i].x, painike[i].y, painike[i].width, painike[i].height);
        }
        
    }
}
