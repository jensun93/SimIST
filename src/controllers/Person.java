
package controllers;
import java.util.ArrayList;

/**
 * Interim Person class, representing a mobile person, which is also a Unit.
 * @author lvw5264
 */
public class Person {
    protected String name;
    protected Floor currentFloor; // floor that they are already on
    protected Floor destFloor;
    protected ArrayList<Unit> baggage; // what is the person carrying? Can carry other Units, or even person.
    
    public Person(String name, Floor floor) {
        this.name = name;
        
        this.currentFloor = floor;
        this.setCurrentFloor(floor);
        this.destFloor = this.currentFloor; // the person is already where they want to be
    }
    
    public String getName() {
        return this.name;
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
        this.currentFloor.removePerson(this);
        
        newFloor.addPerson(this);
        
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
