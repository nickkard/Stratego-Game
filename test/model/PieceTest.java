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
public class PieceTest {
    
    public PieceTest() {
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
     * Test of getTeam method, of class Piece.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        Piece instance = null;
        String expResult = "";
        String result = instance.getTeam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeam method, of class Piece.
     */
    @Test
    public void testSetTeam() {
        System.out.println("setTeam");
        String x = "";
        Piece instance = null;
        instance.setTeam(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Piece.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Piece instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Piece.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String x = "";
        Piece instance = null;
        instance.setName(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRank method, of class Piece.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Piece instance = null;
        int expResult = 0;
        int result = instance.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRank method, of class Piece.
     */
    @Test
    public void testSetRank() {
        System.out.println("setRank");
        int x = 0;
        Piece instance = null;
        instance.setRank(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThesis method, of class Piece.
     */
    @Test
    public void testGetThesis() {
        System.out.println("getThesis");
        Piece instance = null;
        int expResult = 0;
        int result = instance.getThesis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThesis method, of class Piece.
     */
    @Test
    public void testSetThesis() {
        System.out.println("setThesis");
        int x = 0;
        Piece instance = null;
        instance.setThesis(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PieceImpl extends Piece {

        public PieceImpl() {
            super("", "", 0);
        }
    }
    
}
