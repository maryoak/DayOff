
package dayoffgroup.GUI;

import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;

/**
 *
 * @author hannamari
 */
public class Valikko {
    
    Kayttoliittyma kali;
    
    public Valikko(Kayttoliittyma kali) {
        this.kali = kali;
    }
    
    /**
     * Luo aloitusvalikon.
     * 
     * @param container
     */
    public void lisaaValikko(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
 
        lisaaPainike("Pelaa", container);
        lisaaPainike("Ohjeet", container);
        lisaaPainike("Poistu", container);
    }
    
    /**
     * Luo painikkeen valikkoon.
     * 
     * @param nimi
     * @param container
     */
    public void lisaaPainike(String nimi, Container container) {
        JButton painike = new JButton(nimi);
        ValikonKuuntelija painikkeenKuuntelija = 
                new ValikonKuuntelija(nimi, this.kali);
        painike.addActionListener(painikkeenKuuntelija);
        painike.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(painike);
    }   
}
