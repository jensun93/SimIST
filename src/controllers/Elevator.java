
package controllers;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class Elevator extends Mover {
    protected int direction = 0; // -1 for down, 0 for no direction, 1 for up.
    protected Floor currentFloor;
    ArrayList<Person> passengers = new ArrayList<Person>();
    // 2D array of which floors have the buttons activated: [down, up], rows are total floors, cols are 2: up or down
    boolean [][] buttons = new boolean[building.getFloorList().size()][2];

    public Elevator(Building building) {
        super(building);
        this.currentFloor = super.bottom; // rest position of elevator is always at the bottom
        this.direction = 0;         // elevator is at rest
    }

    // accessor for direction of elevator. no mutator given (outsiders shouldn't interfere with elevator motion)
    // -1 for down, 0 for no direction, 1 for up.
    public int getDirection() {
        return this.direction;
    }

    // pick up all passengers going in the same direction
    public void pickUp() {
        
    }
    
    // drop off all passengers that want to go to the current floor
    public void dropOff() {
        // make an array of indices to drop off
        ArrayList<Integer> exiting = new ArrayList<Integer>();
        
        for (Person passenger : passengers) {
            if (passenger.getDestFloor() == currentFloor) {
                // add passenger to dropoff list
                exiting.add(passengers.indexOf(passenger));
            }
        }
        
        // drop off the passengers by index
        for (Integer exiter: exiting) {
            passengers.remove(exiter);
        }
    }

    // let the passenger press a button to schedule a move 
    public boolean moveUp(Person passenger) {
        // take note of the floor the passenger presses the button on and where they want to go
        Floor passengerFloor = passenger.getCurrentFloor();
        Floor passengerDest = passenger.getDestFloor();
        
        // if the passenger is on the top floor, or destination is a lower floor, they cannot move up
        if ((top == passengerFloor) || (passengerDest.getLevel() < passengerFloor.getLevel())) {
            return false;
        }
        
        // check if the current floor actually contains the passenger
        if (passengerFloor.getUnitList().contains(passenger)) {
            // schedule a pickup for the elevator, going up (1)
            buttons[passengerDest.getLevel() - 1][1] = true;
            return true; // completed the action
        } else {
            return false; // failed to move
        }
    }

    // let the passenger press a button to schedule a move 
    public boolean moveDown(Person passenger) {
        // take note of the floor the passenger presses the button on and where they want to go
        Floor passengerFloor = passenger.getCurrentFloor();
        Floor passengerDest = passenger.getDestFloor();
        
        // if the passenger is on the bottom floor, or destination is an upper floor, they cannot move down
        if ((bottom == passengerFloor) || (passengerDest.getLevel() > passengerFloor.getLevel())) {
            return false;
        }
        
        // check if the current floor actually contains the passenger
        if (passengerFloor.getUnitList().contains(passenger)) {
            // schedule a pickup for the elevator, going down (0)
            buttons[passengerDest.getLevel() - 1][0] = true;
            return true; // completed the action
        } else {
            return false; // failed to move
        }
    }

    public Boolean canMoveUp() {
        if (currentFloor.getLevel() == super.top.getLevel()) { // on top floor
            return false; // could not move up since elevator at top floor
        } else {
            return true; // true means you can
        }
    }

    public Boolean canMoveDown() {
        if (currentFloor.getLevel() == super.bottom.getLevel()) { // on bottom floor
            return false; // could not move down since elevator at bottom floor
        } else {
            return true;
        }
    }

    // moves the whole elevator: setup only for three floors
    public Boolean up() {
        if (canMoveUp()) { // on top floor
            return false; // could not move up since elevator at top floor
        } else if (currentFloor.getLevel() == 2-1) { // on middle floor
            currentFloor = super.building.getFloor(3-1);
        } else if (currentFloor.getLevel() == 1-1) { // on bottom floor
            currentFloor = super.building.getFloor(2-1);
        }
        return true; // true means movement is successful
    }

    // moves the whole elevator: setup only for three floors
    public Boolean down() {
        if (canMoveDown()) { // on bottom floor
            return false; // could not move down since elevator at bottom floor
        } else if (currentFloor.getLevel() == 2-1) { // on middle floor
            currentFloor = super.building.getFloor(1-1);
        } else if (currentFloor.getLevel() == 3-1) { // on bottom floor
            currentFloor = super.building.getFloor(2-1);
        }
        return true;
    }

    public void move(int floorChoice) {
        if(currentFloor.getLevel() < floorChoice && canMoveUp()) {
            System.out.println("Going up..");
            currentFloor.setLevel(floorChoice);
            this.up();
            // dropOff();
            // pickUp();
        }
        else if(currentFloor.getLevel() > floorChoice && canMoveDown()) {
            System.out.println("Going down..");
            currentFloor.setLevel(floorChoice);
            this.down();
            // dropOff();
            // pickUp();
        }
    }
}
