package org.example.qa_notes.OOPIntro.InterfacesAbstractClasses;

// an interface is similar to an abstract class
// except that it does not contain instance variables
// can be used to define public interface of type
public interface InterfaceExample {
    // using public and abstract keywords to define public abstract
    // method signatures is optional in interfaces
    public abstract void draw();
    // would be same as
    void otherDraw();

    // can also define DEFAULT methodws
    // classes arre not required to provide implementation of default methods
    // automatically inherited by implementation
    default void exampleDefault() {
        System.out.println("Yes");
    }
    // interfaces may also define and implement static methods
    // NB classes do NOT inhgerit static method
    // static methods can now be inboked on the interface (look at demo)
    static void exampleStatic() {
        System.out.println("Her eis a ");
    }


}
