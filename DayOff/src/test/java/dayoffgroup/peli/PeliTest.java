package dayoffgroup.peli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeliTest {
    
    public PeliTest() {
    }
    
    Peli peli;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        peli = new Peli();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void onkoPelinTasoLuotaessaYksi() {
        assertTrue(peli.getTaso() == 1);
    }
    
    @Test
    public void kasvattaakoSeuraavaTasoMetodiTasonYhdella() {
        peli.seuraavaTaso();
        assertTrue(peli.getTaso() == 2);    
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
