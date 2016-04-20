
package controllers;
import java.util.ArrayList;

/**
 * Interim Person class, representing a mobile person, which is also a Unit.
 * @author lvw5264
 */
public class Person extends Unit {
    protected Floor currentFloor; // floor that they are already on
    protected Floor destFloor;
    protected ArrayList<Unit> baggage; // what is the person carrying? Can carry other Units, or even person.

    public Person(String name, Floor floor) {
        super(name, floor);
        
        this.currentFloor = floor;
        this.setCurrentFloor(floor);
        this.destFloor = this.currentFloor; // the person is already where they want to be
    }

    // return an ArrayList of baggage that the Person is carrying.
    public ArrayList<Unit> getBaggage() {
        return this.baggage;
    }

    // set an ArrayList of baggage that the Person is carrying.
    public void setUnitList(ArrayList<Unit> unitList) {
        this.baggage = baggage;
    }

    // find where the passenger is.
    public Floor getCurrentFloor() {
        return this.currentFloor;
    }

    // change where the passenger is.
    public void setCurrentFloor(Floor newFloor) {
        // remove the passenger from the current floor, add to new floor
        this.currentFloor.removeUnit(this);
        
        newFloor.addUnit(this);
        
        // set currentFloor as new floor
        this.currentFloor = newFloor;
    }
    
    // find where the passenger wants to go.
    public Floor getDestFloor() {
        return this.destFloor;
    }

    // change where the passenger wants to go.
    public void setDestFloor(Floor newFloor) {
        this.destFloor = newFloor;
    }
}
