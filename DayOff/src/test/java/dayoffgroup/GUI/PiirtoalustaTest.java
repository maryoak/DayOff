
package dayoffgroup.GUI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import dayoffgroup.GUI.Kayttoliittyma;

/**
 *
 * @author hannamari
 */
public class PiirtoalustaTest {
    
    Piirtoalusta pa;
    Kayttoliittyma kali;
    
    public PiirtoalustaTest() {
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
    }
    
    @After
    public void tearDown() {
    }
     

}
