package dayoffgroup.GUI;




import dayoffgroup.GUI.Valikko;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Container;
import javax.swing.BoxLayout;
import dayoffgroup.GUI.ValikonKuuntelija;

/**
 *
 * @author hannamari
 */
public class ValikkoTest {
    
    Valikko valikko;
    Container container;
    Piirtoalusta pa;
    Kayttoliittyma kali;
    

    public ValikkoTest() {
    }
    

    @BeforeClass
    public static void setUpClass() {
    }
    

    @AfterClass
    public static void tearDownClass() {
    }
    

    @Before
    public void setUp() {
        kali = new Kayttoliittyma();
        pa = new Piirtoalusta(kali);
        valikko = new Valikko(pa);
    }
    

    @After
    public void tearDown() {
    }

    @Test
    public void luokoLisaaValikkoMetodiPainikkeita() {
        valikko.lisaaValikko(container);
        assertTrue(container.getComponentCount()>0);
    }    
    
    @Test
    public void luokoLisaaPainikeMetodiUudenPainikkeen() {
        int i = container.getComponentCount();
        valikko.lisaaPainike("testi", container);
        assertTrue(container.getComponentCount()>i);
    }
   

}
