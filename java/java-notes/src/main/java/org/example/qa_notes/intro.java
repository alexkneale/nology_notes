package org.example.qa_notes;

public class intro {

    // everything in java exists within a class definition, which is then used to create objects
    // all code in java implemented within a class
    // data can be hidden within object

    // class --> template for building objects (data and methods)

    // instance variables
    int salary;
    //methods
    int getSalary()
    {
        return salary;
    }
    // access modifiers define visibility of class, field or method
    // class can be defined as public or package-private
    //  - public: class visible to other classes
    //  - package-private: limits visibility to current package

    // fields and methods can also be defined as private or protected
    // - any private member is only visible to owning class
    // - using protected makes member visible to subclasses
    private String name;
    public void setName(String newName) {
        name = newName;
    }

    // instance variables (called "fields")
    // - hold object's stat
    // - can be used by all methods of that object instance
    // - may be accessible to external objects

    // common to declare private fields and public methods to access fields

    // 8 primitive types (one of few non-OO concepts)
    // byte, char, boolean, short, int, long, float, double

    // primitive vs object references
    // - primitive field type: holds a value (private int age = 13)
    // - object reference field type: can only hold a reference to an object (private Person student, "here Person is an object type")

    // use New operator to instantiate an object from a class
    // private Person student
    // student = new Person("Kimberly")

    // can reassign
    // student = null

    // any class may have a "main" method with following signature
    // can be defined to allow class to be invoked from command line
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    // dot operator
    // . is used to access object's methods or variables
    // .variableName or .methodName()


    // example of classs with getters and setters

    public class Employee {

        private int age = 0;
        private String name = "unknown";

        // getter and setter method definitions

        public void setName(String newName) {
            this.name = newName;
        }

        public String getName() {
            return this.name;
        }

        public void setAge(int newAge) {
            this.age = newAge;
        }

        public int getAge() {
            return this.age;
        }
    }




}
