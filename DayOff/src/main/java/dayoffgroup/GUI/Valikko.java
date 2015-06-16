
package dayoffgroup.GUI;

import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;

/**
 * Luo ennalta määrätyn aloitusvalikon.
 * Valikolla on painikkeita ja painikkeilla omat kuuntelijat.
 */
public class Valikko {
    
    Piirtoalusta pa;
    private String painikkeet;
    
    public Valikko(Piirtoalusta pa) {
        this.pa = pa;
        this.painikkeet = "";
    }
    
    /**
     * Luo aloitusvalikon.
     * 
     * @param container
     */
    public void lisaaValikko(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
 
        lisaaPainike("Uusi peli", container);
        lisaaPainike("Ohjeet", container);
        lisaaPainike("Poistu", container);
    }
    
    /**
     * Luo painikkeen ja sen kuuntelijan valikkoon.
     * 
     * @param nimi
     * @param container
     */
    public void lisaaPainike(String nimi, Container container) {
        JButton painike = new JButton(nimi);
        this.painikkeet = "" + nimi;
        ValikonKuuntelija painikkeenKuuntelija = new ValikonKuuntelija(nimi, pa);
        painike.addActionListener(painikkeenKuuntelija);
        painike.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(painike);
    }  
    
    @Override
    public String toString() {
        return "Valikkoon sisältyvät painikkeet" + this.painikkeet;
    }
}
