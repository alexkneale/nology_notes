package org.example.qa_notes.SOLID;

public class Intro {

    // SOLID --> software design principles

    // Single Responsibility Principle
    // Open/closed
    // Liskov substitution
    // Interface Segregation
    // Dependency Inversion

    // Single responsibility principle (SRP)
    // every class should have responsibility over a single part of the functionality provided by the software
    // and that responsibility should be entirely encapsulated by the class.
    // Basically, a class should only have these classes methods because every class has a different purpose.

    // w/out SRP
    // doesn't conform to SRP as we have salary calculator within employee
    public class Employee {
        public void addEmployee() {}
        public void UpdateEmployee() {}
        public void CalculateSalary() {}
    }
    // w/ SRP --> note now we have two diff classes
    // one for employee and the other for calculating salary
    public class EmployeeSRP {
        public void AddEmployee() {}
        public void UpdateEmployee() {}
    }

    public class SalarySRP {
        public void CalculateSalary() {}
    }

    // Open/Closed Principle
    // software entities classes or methods should be open for extension but closed for modification.
    // This informs us that any code may change in the future due to new requirements. So, while coding to meet these requirements, we must protect all missions, otherwise this will be a major issue for our object.
    // Essentially, any given class or module or function etc, should allow for its functionality to be extended but not allow for modification to its own source code.

    // Liskoff Substitution Principle (LSP)
    // we should be able to treat a child class as though it were the parent class.
    // Essentially, this means that all derived classes should retain the functionality of their parent class and cannot replace any functionality the parent provides.

    // Interface Segregation Principle (ISP)
    // no client code object should be forced to depend on methods it does not use.
    // Basically, each code object should only implement what it needs, and not be required to implement anything else.

    // Dependency Inversion
    // Two rules
    // 1. High level modules should not depend on low level modules. Both should depend on abstractions.
    // 2. Abstractions should not depend on details, details should depend on abstractions.

    // This principle is primarily concerned with reducing dependencies among the code modules.
    // We can think of it as needing the low level objects to define contracts that the high level objects can use
    // without the high level objects, needing to care about the specific implementation the low level objects provide.








}
