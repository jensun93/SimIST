
package controllers;


public class Stairs extends Mover {

    public Stairs(Building building, Floor top, Floor bottom) {
        super(building);
    }

    // move to the top floor
    public boolean moveUp(Person passenger){
        // check if the bottom floor actually contains the passenger
        if(super.bottom.getPersonList().contains(passenger)) {
            // move passenger to another floor
            super.bottom.removePerson(passenger);
            super.top.addPerson(passenger);
            return true; // completed the action
        } else {
            return false; // failed to move
        }
    }

    // move to the bottom floor
    public boolean moveDown(Person passenger){
        // check if the top floor actually contains the passenger
        if(super.top.getPersonList().contains(passenger)) {
            // move passenger to another floor
            super.top.removePerson(passenger);
            super.bottom.addPerson(passenger);
            return true; // completed the action
        } else {
            return false; // failed to move
        }
    }
}
