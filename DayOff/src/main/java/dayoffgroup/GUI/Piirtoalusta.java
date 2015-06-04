
package dayoffgroup.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

/**
 *
 * @author hannamari
 */
public class Piirtoalusta extends JPanel implements Runnable, Paivitettava {
    
    Thread thread = new Thread(this);
    Kayttoliittyma kali;
    
    private int fps = 0;
    /**
     *
     * @param kali
     */
    public Piirtoalusta(Kayttoliittyma kali) {
        this.kali = kali;
        thread.start();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.clearRect(0, 0, this.kali.frame.getWidth(), this.kali.frame.getHeight());
        g.drawString("" + fps, 10, 10);
    }
    
    @Override
    public void run() {
        System.out.println("Toimii");
        
        long lastFrame = System.currentTimeMillis();
        int frames = 0;
        
        while(true) {
            repaint();
            frames++;
            
            if (System.currentTimeMillis() - 1000 >= lastFrame){
                fps = frames;
                frames = 0;
                lastFrame = System.currentTimeMillis();
            }
            try { 
            Thread.sleep(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
    }

    /**
     *
     */
    @Override
    public void paivita() {

    }
}
