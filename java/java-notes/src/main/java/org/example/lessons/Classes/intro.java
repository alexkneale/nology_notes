package org.example.lessons.Classes;

public class intro {

    public static void main (String[] args) {
        // class is a blueprint for instances of objects
        // syntax for creating a class
        // [scope] [class] [ClassName] {}
        //


        // access modifiers --> public, private, protected etc
        // decides in which scope classes can be accessed
        // public --> class can be accessed anywhere in project --> class is essentially global
        // public is default
        // private --> makes class or property within class only accessible within own class/ classfile
        // protected --> restrict access to sub-folder (packages)

        // NB
        // objects --> camel case
        // classes --> pascal scase
//
//        Student newStudent = new Student("Jeff", 2312);
//        System.out.println(newStudent.name);
//        // Jeff

        //-   In you main function:
//        -   instantiate a dog that woofs
//    -   ... a bear that roars
//    -   print each of their sounds to the consol

//        Animal dog = new Animal("dog", "pringles","woof");
//        Animal bear = new Animal("bear", "crisps", "roar");
//        Animal toucan = new Animal("tucan", "doritos", "caw");
//        Animal bee = new Animal("bee", "walker","buzz");
//        Animal hedgehog = new Animal("hedgehog", "wotsit", "snuffling");
//        Animal penguin = new Animal("penguin", "Tyrell", "noot noot");
//        Animal cat = new Animal();
//        System.out.println(dog.getSound());
//        System.out.println(bear.getSound());
//        System.out.println(toucan.getSound());
//        System.out.println(bee.getSound());
//        System.out.println(hedgehog.getSound());
//        System.out.println(penguin.getSound());
//        System.out.println(cat.getSound());

        // 4 pillars of OOP
        // - Polymorphism --> e.g. function can take many forms (based on number of params)


        // methods defined in Math class only exist in instances of that class
        // first must create instance of class, then can access methods
        Math math = new Math();
        math.printResult(2);
        // how can we call a method from a class without instantiating ?
        // STATIC METHODS !
        System.out.println(Math.increment(2));

        // getting static field
        System.out.println(Math.GOLDEN_RATIO);


    }
}
