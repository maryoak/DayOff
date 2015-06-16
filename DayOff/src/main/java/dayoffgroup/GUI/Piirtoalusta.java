
package dayoffgroup.GUI;

import javax.swing.JPanel;
import java.awt.Graphics;
import dayoffgroup.peli.Peli;
import java.awt.Color;
import java.awt.Point;
/**
 * Luokka luo ja päivittää GUI:n eri näkymiä.
 * 
 */
public class Piirtoalusta extends JPanel implements Runnable, Paivitettava {
    
    public Thread thread = new Thread(this);
    public Kayttoliittyma kali;
    public static Peli peli;
    
    public static int korkeus;
    public static int leveys;
    
    public static Point hiiri = new Point(0,0);
    
    private boolean ensimmainen = true;
    private int nakyma = 0;
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
    /**
     * Alustaa uuden pelin.
     */
    public void alusta() {
        peli = new Peli();
    }
    /**
     * Piirtää näkymät.
     * Näkymä 0 = aloitusnäkymä
     * Näkymä 1 = peli
     * Näkymä 2 = ohjeet
     * Fps-arvot saa näkyviin poistamalla kommenttimerkit metodin
     * viimeiseltä riviltä
     * 
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g) {
       
        g.clearRect(0, 0, getWidth(), getHeight());    
            
        if (this.ensimmainen) {
            leveys = getWidth();
            korkeus = getHeight();
            alusta();     
            this.ensimmainen = false;
        }
        
        if (this.nakyma == 0) { 
        //avaa aloitusnäkymän      
        //    super.paintComponent(g);
            g.setColor(Color.orange);
            g.drawString("DAYOFF TOWER DEFENCE available soon!", 250, 250);
            Valikko valikko = new Valikko(this);
            valikko.lisaaValikko(this.kali.frame.getContentPane());  
        } else if (this.nakyma == 1) {
        //peli "käynnistyy"
            peli.kentta.piirra(g);
            peli.kauppa.piirra(g);
        } else if (this.nakyma == 2) {
        //näyttää ohjeet kunhan valmistuu
            Ohjeet ohjeet = new Ohjeet();
        } 
        
        g.drawString("" + fps, 20, 20);
    }
    
    @Override
    public void run() {
        
        long lastFrame = System.currentTimeMillis();
        int frames = 0;        
        
        while(true) {
  
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
     * 0 - aloitusnäkymä
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
