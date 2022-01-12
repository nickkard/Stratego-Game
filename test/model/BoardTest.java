/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class BoardTest {
    
    public BoardTest() {
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
     * Test of validBox method, of class Board.
     */
    @Test
    public void testValidBox() {
        System.out.println("validBox");
        int x = 0;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.validBox(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emptyBox method, of class Board.
     */
    @Test
    public void testEmptyBox() {
        System.out.println("emptyBox");
        int x = 0;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.emptyBox(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of WhereToPlace method, of class Board.
     */
    @Test
    public void testWhereToPlace() {
        System.out.println("WhereToPlace");
        Piece e = null;
        Board instance = new Board();
        int expResult = 0;
        int result = instance.WhereToPlace(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPeriferiakoBox method, of class Board.
     */
    @Test
    public void testIsPeriferiakoBox() {
        System.out.println("isPeriferiakoBox");
        int x = 0;
        Board instance = new Board();
        int expResult = 0;
        int result = instance.isEdgeBox(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidMove method, of class Board.
     */
    @Test
    public void testValidMove() {
        System.out.println("ValidMove");
        int i = 0;
        int y = 0;
        int k = 0;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.ValidMove(i, y, k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
