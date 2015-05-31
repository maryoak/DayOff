
package dayoffgroup.peli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Container;
import javax.swing.BoxLayout;
import dayoffgroup.peli.ValikonKuuntelija;

public class ValikkoTest {
    
    Valikko valikko;
    Container container;
    
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
        valikko = new Valikko();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void onkoValikkoTyhja() {
        
    }
    
    @Test
    public void luokoLisaaValikkoMetodiPainikkeita() {
        valikko.lisaaValikko(container);
        assertTrue(container.getComponentCount()>0);
    }    
    
    @Test
    public void luokoLisaaPainikeMetodiUudenPainikkeen() {
        valikko.lisaaValikko(container);
        assertTrue(container.getComponentCount()>0);
    }
    
    @Test
    public void luokoLisaaPainikeMetodiUudenValikonKuuntelijan() {
        valikko.lisaaPainike("testi", container);
        
    }
 
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
