/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getRess method, of class Player.
     */
    @Test
    public void testGetRess() {
        System.out.println("getRess");
        Player instance = null;
        int expResult = 0;
        int result = instance.getRess();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ress method, of class Player.
     */
    @Test
    public void testRess() {
        System.out.println("Ress");
        Player instance = null;
        MoveablePiece expResult = null;
        MoveablePiece result = instance.Ress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidRess method, of class Player.
     */
    @Test
    public void testValidRess() {
        System.out.println("ValidRess");
        String x = "";
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.ValidRess(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String x = "";
        Player instance = null;
        instance.setName(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeam method, of class Player.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        Player instance = null;
        String expResult = "";
        String result = instance.getTeam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeam method, of class Player.
     */
    @Test
    public void testSetTeam() {
        System.out.println("setTeam");
        String x = "";
        Player instance = null;
        instance.setTeam(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToActiveCards method, of class Player.
     */
    @Test
    public void testAddToActiveCards() {
        System.out.println("addToActiveCards");
        Piece e = null;
        Player instance = null;
        instance.addToActiveCards(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToInActiveCards method, of class Player.
     */
    @Test
    public void testAddToInActiveCards() {
        System.out.println("addToInActiveCards");
        Piece e = null;
        Player instance = null;
        instance.addToInActiveCards(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromActiveCards method, of class Player.
     */
    @Test
    public void testRemoveFromActiveCards() {
        System.out.println("removeFromActiveCards");
        Piece e = null;
        Player instance = null;
        instance.removeFromActiveCards(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromInActiveCards method, of class Player.
     */
    @Test
    public void testRemoveFromInActiveCards() {
        System.out.println("removeFromInActiveCards");
        Piece e = null;
        Player instance = null;
        instance.removeFromInActiveCards(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize_pieces method, of class Player.
     */
    @Test
    public void testInitialize_pieces() {
        System.out.println("initialize_pieces");
        String x = "";
        Player instance = null;
        instance.initialize_pieces(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActiveCards method, of class Player.
     */
    @Test
    public void testGetActiveCards() {
        System.out.println("getActiveCards");
        Player instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getActiveCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInActiveCards method, of class Player.
     */
    @Test
    public void testGetInActiveCards() {
        System.out.println("getInActiveCards");
        Player instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getInActiveCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ActiveCardsSize method, of class Player.
     */
    @Test
    public void testActiveCardsSize() {
        System.out.println("ActiveCardsSize");
        Player instance = null;
        int expResult = 0;
        int result = instance.ActiveCardsSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InActiveCardsSize method, of class Player.
     */
    @Test
    public void testInActiveCardsSize() {
        System.out.println("InActiveCardsSize");
        Player instance = null;
        int expResult = 0;
        int result = instance.InActiveCardsSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HowManyImmovablePieces method, of class Player.
     */
    @Test
    public void testHowManyImmovablePieces() {
        System.out.println("HowManyImmovablePieces");
        Player instance = null;
        int expResult = 0;
        int result = instance.HowManyImmovablePieces();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HasFlag method, of class Player.
     */
    @Test
    public void testHasFlag() {
        System.out.println("HasFlag");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.HasFlag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Has_Played method, of class Player.
     */
    @Test
    public void testHas_Played() {
        System.out.println("Has_Played");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.Has_Played();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PrintActivePieces method, of class Player.
     */
    @Test
    public void testPrintActivePieces() {
        System.out.println("PrintActivePieces");
        Player instance = null;
        instance.PrintActivePieces();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PrintInActivePieces method, of class Player.
     */
    @Test
    public void testPrintInActivePieces() {
        System.out.println("PrintInActivePieces");
        Player instance = null;
        instance.PrintInActivePieces();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Print_Ress_board method, of class Player.
     */
    @Test
    public void testPrint_Ress_board() {
        System.out.println("Print_Ress_board");
        Player instance = null;
        instance.Print_Ress_board();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
