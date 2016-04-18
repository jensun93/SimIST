/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lvw5264
 */
public class ElevatorTest {
    
    public ElevatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void canMoveUp() {
        System.out.println("canMoveUp");
        Building building = new Building();
        Person passenger = new Person("Joe", building.middle());
        Elevator instance = new Elevator(building);
        
        Boolean result = instance.canMoveUp(); // at bottom floor: should return true
        assertEquals(result, true);
    }
    
    @Test
    public void canMoveDown() {
        System.out.println("canMoveDown");
        Building building = new Building();
        Person passenger = new Person("Joe", building.middle());
        Elevator instance = new Elevator(building);
        
        Boolean result = instance.canMoveDown(); // at bottom floor: should return false
        assertEquals(result, false);
    }
    
    /**
     * Test of moveUp method, of class Elevator.
     */
    @Test
    public void testMoveUp() {
        System.out.println("moveUp");
        Unit passenger = null;
        Elevator instance = null;
        //sinstance.moveUp(passenger);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of moveDown method, of class Elevator.
     */
    @Test
    public void testMoveDown() {
        System.out.println("moveDown");
        Unit passenger = null;
        Elevator instance = null;
        //instance.moveDown(passenger);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
