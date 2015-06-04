/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    @Test
    public void toimiikoMetodiSetNakyma() {
        pa.setNakyma(2);
        assertTrue(pa.nakyma == 2);
    }    

}
