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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author krnik
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({model.BlocksTest.class, model.PlayerTest.class, model.special_powerTest.class, model.SpecialMovablePieceTest.class, model.BoardTest.class, model.SlayerTest.class, model.FlagTest.class, model.MageTest.class, model.PieceTest.class, model.Beast_RiderTest.class, model.KnightTest.class, model.ScoutTest.class, model.BombTest.class, model.SorceressTest.class, model.MoveablePieceTest.class, model.YetiTest.class, model.DwarfTest.class, model.DragonTest.class, model.ElfTest.class, model.Lava_BeastTest.class, model.ImmovablePieceTest.class})
public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
