/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author krnik
 */
public class graficTest {
    
    public graficTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init_buttons method, of class grafic.
     */
    @Test
    public void testInit_buttons() {
        System.out.println("init_buttons");
        grafic instance = new grafic();
        instance.init_buttons();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printButtons method, of class grafic.
     */
    @Test
    public void testPrintButtons() {
        System.out.println("printButtons");
        grafic instance = new grafic();
        instance.printButtons();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButtonText method, of class grafic.
     */
    @Test
    public void testGetButtonText() {
        System.out.println("getButtonText");
        int i = 0;
        grafic instance = new grafic();
        String expResult = "";
        String result = instance.getButtonText(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setbuttonClicked method, of class grafic.
     */
    @Test
    public void testSetbuttonClicked() {
        System.out.println("setbuttonClicked");
        String x = "";
        grafic instance = new grafic();
        instance.setbuttonClicked(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
