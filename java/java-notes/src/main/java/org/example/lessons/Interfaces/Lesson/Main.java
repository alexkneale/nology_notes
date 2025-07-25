package org.example.lessons.Interfaces.Lesson;

public class Main {

    public static void main (String[] args) {
        // interfaces define what a class SHOULD DO
        // ... NOT HOW to do it

        // an interface is a 100% abstract class
        // all methods and no implementation

        // so far we have looked at abstract classes and concrete classes
        // concrete classes that implement an abstract class has a 'IS A' relationship

        // interfaces are weirder
        // when you write an interface, you're saying "I need something that can ..."
        // If we had a mobile, tablet and laptop, we could create these interfaces
        // - Displayable, have display functionality
        // - Chargeable, have to be able to charge
        // - ReceiveCall, have to be able to receive a call

        // unlike with inheriting between classes, where we cannot have multiple inheritence (DIAMOND problem)
        // classes CAN inherit from multiple interfaces

        // on an interface
        // - all methods are abstract
        // - all variables are constant
        // - use "interface" keyword to define an interface
        // - an interface can extend another interface
        // all methods are implicitly abstract and public (don't have to explicitly write "public abstract" each time)

        // unless abstract, a class which inherits an interface must implement ALL interface methods
        // have to use @Override
        // can use instanceof to check if a class implements an interface

        // can use interface as TYPE
        // useful for making arraylists of all same elements


        Dog rex = new Dog();
        Duck duck = new Duck();

        System.out.println(duck instanceof Animal);
        // true, as Duck inherits from Animal superclass
        System.out.println(duck instanceof CanFly);
        // true, as Duck implements canFly interface

        duck.fly();
        // Duck is flying
        duck.makeSound();
        // Quack!

        // casting from Type Dog object to object of type CanMakeSound
        CanMakeSound barker = rex;

        // note
        // when we caste from a class to an interface
        // we lose functionality, but KEEP THE MEMORY OF THE ORIGINAL CLASS TYPE
        // example
        // here we caste from Duck class to CanFly interface
        CanFly flier = duck;
        // so now we've lost functionality that was in Duck type
        // so this would cause an error
        // flier.land() ERROR

        // now let's caste flier BACK to Duck type
        // interestingly, can now call methods in Duck type
        // Why?
        // Because under the hood, we keep memory that flier was originally caste from a type Duck
        // so we return to original funcionality that was lost when duck was caste to CanFly type
        // MEMORY OF PREVIOUS TYPES IS RETAINED IN JAVA
        Duck otherDuck = (Duck) flier;
        otherDuck.makeSound();
        // Quack!



    }
}
