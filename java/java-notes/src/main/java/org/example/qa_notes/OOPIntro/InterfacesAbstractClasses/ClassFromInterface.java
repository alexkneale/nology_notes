package org.example.qa_notes.OOPIntro.InterfacesAbstractClasses;

// a class can IMPLEMENT (note keyword below) one or more interfaces
// indicates a capability more than an inheritence relationship
// a class that implements an interface is said to be a subtype of its interface
public class ClassFromInterface implements InterfaceExample {
    // a concrete class MUST implement abstract methods of interface
    // an abstract class doesn't have to

    public void draw() {
        System.out.println("Drawing 1");
    }

    public void otherDraw() {
        System.out.println("Drawing 2");
    }
}
