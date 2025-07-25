package org.example.lessons.Classes;

public class Math {
    // can also have static fields
    // here we include final as this stops value from being changed
    // can also use final keyword in methods to make method immutable for subclasses
    public static final double GOLDEN_RATIO = 2.2333;

    // you place what method returns just after scope declaration
    // private methods are only available foor use within class itself (not in any instance of class)
    // so can only access them here, within scope of class
    private int addTwo(int n) {
        return n + 2;
    }

    public void printResult(int x) {
        // so can access private method, and display results using public method
        System.out.println(addTwo(x));
    }
    // static methods can be accessed from class directly
    // don't need to instantiate an object from the class
    public static int increment(int n) {
        return ++n;
    }

}
