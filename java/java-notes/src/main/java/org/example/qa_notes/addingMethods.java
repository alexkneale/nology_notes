package org.example.qa_notes;

public class addingMethods {
    private String name;

    // lets Look at writing and adding methods to a class

    // methods must return either 0 or 1 data types
    public void setName (String name) {
        // "this" specifies use of the instance variable
        // distinguish fields from method variables
        this.name = name;
    }
    // can overload methods

    public String getName() {
        return name;
    }

    // CONSTRUCTORS
    // special method within class
    // can have 0 or more
    // controls instantiation of objects
    // if no constructor defined, java provides default which is nothing


}
