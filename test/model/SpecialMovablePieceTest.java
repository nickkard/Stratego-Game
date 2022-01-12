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
public class SpecialMovablePieceTest {
    
    public SpecialMovablePieceTest() {
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
     * Test of getPower method, of class SpecialMovablePiece.
     */
    @Test
    public void testGetPower() {
        System.out.println("getPower");
        SpecialMovablePiece instance = null;
        special_power expResult = null;
        special_power result = instance.getPower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPower method, of class SpecialMovablePiece.
     */
    @Test
    public void testSetPower() {
        System.out.println("setPower");
        special_power x = null;
        SpecialMovablePiece instance = null;
        instance.setPower(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SpecialMovablePieceImpl extends SpecialMovablePiece {

        public SpecialMovablePieceImpl() {
            super(null, "", "", 0);
        }
    }
    
}
