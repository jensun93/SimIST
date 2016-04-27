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

    /**
     * Test of getDirection method, of class Elevator.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        Elevator instance = null;
        int expResult = 0;
        int result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickUp method, of class Elevator.
     */
    @Test
    public void testPickUp() {
        System.out.println("pickUp");
        Elevator instance = null;
        int expResult = 0;
        int result = instance.pickUp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dropOff method, of class Elevator.
     */
    @Test
    public void testDropOff() {
        System.out.println("dropOff");
        Elevator instance = null;
        int expResult = 0;
        int result = instance.dropOff();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canMoveUp method, of class Elevator.
     */
    @Test
    public void testCanMoveUp() {
        System.out.println("canMoveUp");
        Elevator instance = null;
        Boolean expResult = null;
        Boolean result = instance.canMoveUp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canMoveDown method, of class Elevator.
     */
    @Test
    public void testCanMoveDown() {
        System.out.println("canMoveDown");
        Elevator instance = null;
        Boolean expResult = null;
        Boolean result = instance.canMoveDown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of up method, of class Elevator.
     */
    @Test
    public void testUp() {
        System.out.println("up");
        Elevator instance = null;
        Boolean expResult = null;
        Boolean result = instance.up();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of down method, of class Elevator.
     */
    @Test
    public void testDown() {
        System.out.println("down");
        Elevator instance = null;
        Boolean expResult = null;
        Boolean result = instance.down();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Elevator.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int floorChoice = 0;
        Elevator instance = null;
        instance.move(floorChoice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
