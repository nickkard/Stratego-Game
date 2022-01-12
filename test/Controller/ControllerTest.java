/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Player;
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
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of initialize_board method, of class Controller.
     */
    @Test
    public void testInitialize_board() {
        System.out.println("initialize_board");
        Controller instance = new Controller();
        instance.initialize_board();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeChanges method, of class Controller.
     */
    @Test
    public void testMakeChanges() {
        System.out.println("makeChanges");
        String a = "";
        String b = "";
        String k = "";
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.makeChanges(a, b, k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameEnded method, of class Controller.
     */
    @Test
    public void testSetGameEnded() {
        System.out.println("setGameEnded");
        boolean x = false;
        Controller instance = new Controller();
        instance.setGameEnded(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GameEnded method, of class Controller.
     */
    @Test
    public void testGameEnded() {
        System.out.println("GameEnded");
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.GameEnded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardHasPlayed method, of class Controller.
     */
    @Test
    public void testGetCardHasPlayed() {
        System.out.println("getCardHasPlayed");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.getCardHasPlayed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTurn method, of class Controller.
     */
    @Test
    public void testGetTurn() {
        System.out.println("getTurn");
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.getTurn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeTurn method, of class Controller.
     */
    @Test
    public void testChangeTurn() {
        System.out.println("changeTurn");
        Controller instance = new Controller();
        instance.changeTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlastPlayer method, of class Controller.
     */
    @Test
    public void testGetlastPlayer() {
        System.out.println("getlastPlayer");
        Controller instance = new Controller();
        Player expResult = null;
        Player result = instance.getlastPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setlastPlayer method, of class Controller.
     */
    @Test
    public void testSetlastPlayer() {
        System.out.println("setlastPlayer");
        Player e = null;
        Controller instance = new Controller();
        instance.setlastPlayer(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
