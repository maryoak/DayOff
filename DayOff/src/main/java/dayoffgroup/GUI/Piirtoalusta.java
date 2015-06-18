
package dayoffgroup.GUI;

import dayoffgroup.domain.AikainenHeratys;
import javax.swing.JPanel;
import java.awt.Graphics;
import dayoffgroup.peli.Peli;
import static dayoffgroup.peli.Peli.uhkat;
import java.awt.Color;
import java.awt.Point;
/**
 * Luokka luo ja päivittää GUI:n eri näkymiä.
 * 
 */
public class Piirtoalusta extends JPanel implements Runnable, Paivitettava {
    
    public Thread thread = new Thread(this);
    public static Kayttoliittyma kali;
    public static Peli peli;
<<<<<<< HEAD
    public static Sivupalkki sivuPalkki;
    
    public static int korkeus;
    public static int leveys;
    
    public static Point hiiri = new Point(0,0);
    
    private boolean ensimmainen;
=======
    
    public static int korkeus;
    public static int leveys;
    
    public static Point hiiri = new Point(0,0);
    
    private boolean ensimmainen = true;
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
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
        this.ensimmainen = true;
        kali.frame.addMouseMotionListener(new HiirenKuuntelija());
        kali.frame.addMouseMotionListener(new HiirenKuuntelija());
    }
    /**
     * Alustaa uuden pelin.
     */
    public void alusta() {
        peli = new Peli();
    }
<<<<<<< HEAD
=======
    /**
     * Alustaa uuden pelin.
     */
    public void alusta() {
        peli = new Peli();
    }
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
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
<<<<<<< HEAD
            super.paintComponent(g);
=======
        //    super.paintComponent(g);
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
            g.setColor(Color.orange);
            g.drawString("DAYOFF TOWER DEFENCE available soon!", 250, 250);
            Valikko valikko = new Valikko(this);
            valikko.lisaaValikko(this.kali.frame.getContentPane());  
        } else if (this.nakyma == 1) {
        //peli "käynnistyy"
            peli.kentta.piirra(g);
<<<<<<< HEAD
            peli.sivupalkki.piirra(g);
            peli.opiskelija.piirra(g);
            
            for (int i = 1; i < Peli.uhkat.length; i++) {
                if (Peli.uhkat[i].kentalla) {
                    Peli.uhkat[i].piirra(g);
                }
            }
=======
            peli.kauppa.piirra(g);
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
        } else if (this.nakyma == 2) {
        //näyttää ohjeet kunhan valmistuu
            Ohjeet ohjeet = new Ohjeet();
        } 
        
        g.drawString("" + fps, 20, 20);
<<<<<<< HEAD
    }
    
    public int luomisAika = 10, luomisKehys = 0;
    public void uhkienLuoja() {
        if (luomisKehys >= luomisAika) {
            for (int i = 1; i < Peli.uhkat.length; i++) {
                if (!Peli.uhkat[i].kentalla) {
                    Peli.uhkat[i].luoUhka(0);
                    break;
                }
            }
            
            luomisKehys = 0;
        } else {
            luomisKehys += 1;
        }
=======
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
    }
    
    @Override
    public void run() {
        
        long lastFrame = System.currentTimeMillis();
        int frames = 0;        
        
        while(true) {
<<<<<<< HEAD
            
            if(!ensimmainen) {
                uhkienLuoja();
                
                for (int i = 1; i < Peli.uhkat.length; i++) {
                    if (Peli.uhkat[i].kentalla) {
                        Peli.uhkat[i].liiku();
                                System.out.println("uh");
                    }
                }
                    
            }
            
=======
  
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
            paivita();
            frames++;
            
            if (System.currentTimeMillis() - 1000 >= lastFrame){
                fps = frames;
                frames = 0;
                lastFrame = System.currentTimeMillis();
            }
                try { 
<<<<<<< HEAD
                    Thread.sleep(5);
=======
                    Thread.sleep(2);
>>>>>>> 058b65d1eeefbb289df6a6ed0e15f94002889ab5
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
