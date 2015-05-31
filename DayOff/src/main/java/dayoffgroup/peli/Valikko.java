
package dayoffgroup.peli;

import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class Valikko {
    
    public void lisaaValikko(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
 
        lisaaPainike("Pelaa", container);
        lisaaPainike("Ohjeet", container);
        lisaaPainike("Poistu", container);
    }
    
    public void lisaaPainike(String nimi, Container container) {
        JButton painike = new JButton(nimi);
        ValikonKuuntelija painikkeenKuuntelija = new ValikonKuuntelija(nimi);
        painike.addActionListener(painikkeenKuuntelija);
        painike.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(painike);
    }   
}
