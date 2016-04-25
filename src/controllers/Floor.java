package controllers;


import java.util.ArrayList;


public class Floor {

    protected ArrayList<Unit> unitList = new ArrayList<Unit>();
    protected ArrayList<Person> personList = new ArrayList<Person>();

    protected int level; // numerical level of the floor: negative is underground
    
    public Floor(int level) {
        this.level = level;
    }
    
    // person getters and setters
    public void addPerson(Person p) {
        this.personList.add(p);
    }
    
    public void removePerson(Person p){
        this.personList.remove(p);
    } 

    public ArrayList<Person> getPersonList() {
        return this.personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    // unit getters and setters
    public void addUnit(Unit u) {
        this.unitList.add(u);
    }
    
    public void removeUnit(Unit u){
        this.unitList.remove(u);
    } 

    public ArrayList<Unit> getUnitList() {
        return this.unitList;
    }

    public void setUnitList(ArrayList<Unit> unitList) {
        this.unitList = unitList;
    }

    // level getters and setters
    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
