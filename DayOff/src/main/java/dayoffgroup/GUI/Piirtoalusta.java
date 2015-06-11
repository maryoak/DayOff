
package dayoffgroup.GUI;

import javax.swing.JPanel;
import java.awt.Graphics;
import dayoffgroup.peli.Peli;
import java.awt.Color;

/**
 *
 * @author hannamari
 */
public class Piirtoalusta extends JPanel implements Runnable, Paivitettava {
    
    public Thread thread = new Thread(this);
    public Kayttoliittyma kali;
    public static Kentta kentta;
    public static Peli peli;
    public boolean ensimmainen = true;
    public int nakyma;
    
    private int fps;
    /**
     * Konstruktori yhdellä parametrilla
     * 
     * @param kali
     */
    public Piirtoalusta(Kayttoliittyma kali) {
        thread.start();
        this.kali = kali;
    }

    public void alusta() {
        peli = new Peli();
        kentta = new Kentta();
    }
    
    
    /**
     * Piirtää näkymät.
     * Näkymä 0 = valikko
     * Näkymä 1 = peli
     * Näkymä 2 = ohjeet
     * Fps-arvot saa näkyviin poistamalla kommenttimerkit metodin
     * kolmannelta riviltä
     * 
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        g.clearRect(0, 0, this.kali.frame.getWidth(), this.kali.frame.getHeight());
     // g.drawString("" + fps, 20, 20);
        g.setColor(Color.orange);
        g.drawString("DAYOFF TOWER DEFENCE opening soon!", 250, 250);
        
        if (this.nakyma == 0) {
            //luo valikon
            Valikko valikko = new Valikko(this);
            valikko.lisaaValikko(this.kali.frame.getContentPane());
        } else if (this.nakyma == 1) {
            //peli "käynnistyy"
            kentta.piirra(g);
        } else if (this.nakyma == 2) {
            Ohjeet ohjeet = new Ohjeet();
            //näyttää ohjeet kunhan valmistuu
        }
    }
    
    @Override
    public void run() {
        
        long lastFrame = System.currentTimeMillis();
        int frames = 0;
        
        while(true) {
         
            if (!this.ensimmainen) {
              
            }
            
            paivita();
            frames++;
            if (System.currentTimeMillis() - 1000 >= lastFrame){
                fps = frames;
                frames = 0;
                lastFrame = System.currentTimeMillis();
            }
            try { 
            Thread.sleep(2);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
    }
    /**
     * Päivittää piirtoalustan.
     */
    @Override
    public void paivita() {
        this.repaint();
    }
    /**
     * Metodilla vaihdetaan näkymä.
     * 0 - valikko
     * 1 - peli
     * 2 - ohjeet
     * 
     * @param i 
     */
    public void setNakyma(int i) {
        if(i <= 2 && i >= 0) {
            this.nakyma = i;
        }
    }    
    
}
