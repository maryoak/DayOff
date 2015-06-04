
package dayoffgroup.GUI;

import java.awt.Container;
import java.awt.Dimension;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
//import java.awt.Container;
//import dayoffgroup.peli.Valikko; Tarvitaanko näitä?

/**
 *
 * @author hannamari
 */
public class KayttoliittymaTest {
    
    Kayttoliittyma kali;
    JFrame frame;
    Container container;
    
    /**
     *
     */
    public KayttoliittymaTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        frame = new JFrame("DayOff Tower Defence!");
        frame.setPreferredSize(new Dimension(700, 600));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        kali.luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }
    

    
    
}
