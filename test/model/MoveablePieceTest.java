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
public class MoveablePieceTest {
    
    public MoveablePieceTest() {
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
     * Test of attack method, of class MoveablePiece.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        Piece e = null;
        MoveablePiece instance = null;
        int expResult = 0;
        int result = instance.attack(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class MoveablePiece.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int x = 0;
        MoveablePiece instance = null;
        instance.move(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MoveablePieceImpl extends MoveablePiece {

        public MoveablePieceImpl() {
            super("", "", 0);
        }
    }
    
}
